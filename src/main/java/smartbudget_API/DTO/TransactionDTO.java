package smartbudget_API.DTO;

import smartbudget_API.Model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionDTO {

    private Long id;
    private String description;
    private BigDecimal amount;
    private String type;
    private LocalDate date;

    public TransactionDTO() {}

    public TransactionDTO(Long id, String description, BigDecimal amount, String type, LocalDate date) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public static TransactionDTO fromEntity(Transaction transaction) {

        return new TransactionDTO(
                transaction.getId(),
                transaction.getDescription(),
                transaction.getAmount(),
                transaction.getType().name(),
                transaction.getDate()
        );
    }
}