package smartbudget_API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smartbudget_API.DTO.TransactionDTO;
import smartbudget_API.Model.Transaction;
import smartbudget_API.Service.TransactionService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping
    public List<TransactionDTO> list() {

        return service.findAll()
                .stream()
                .map(TransactionDTO::fromEntity)
                .toList();
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return service.save(transaction);
    }

    @GetMapping("/balance")
    public BigDecimal balance() {
        return service.getBalance();
    }
}