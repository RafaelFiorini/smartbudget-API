package smartbudget_API.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smartbudget_API.Model.Transaction;
import smartbudget_API.Model.TransactionType;
import smartbudget_API.Repository.TransactionRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public List<Transaction> findAll() {
        return repository.findAll();
    }

    public Transaction save(Transaction transaction) {
        return repository.save(transaction);
    }

    public BigDecimal getBalance() {

        List<Transaction> list = repository.findAll();

        return list.stream()
                .map(t -> t.getType() == TransactionType.INCOME ?
                        t.getAmount() : t.getAmount().negate())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}