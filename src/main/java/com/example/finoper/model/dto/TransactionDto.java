package com.example.finoper.model.dto;

import com.example.finoper.model.CashOrder;
import com.example.finoper.model.Client;
import com.example.finoper.model.ClientAccount;
import com.example.finoper.model.TypeTransaction;

import java.time.LocalDateTime;

public class TransactionDto {

    private Long id;

    private LocalDateTime dateOfCreation;

    private Double sum;

    private TypeTransaction type;

    private ClientAccount clientAccount;

    private CashOrder cashOrder;

    private Client clientOrder;

    private String resultTransaction;

    public TransactionDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public TypeTransaction getType() {
        return type;
    }

    public void setType(TypeTransaction type) {
        this.type = type;
    }

    public CashOrder getCashOrder() {
        return cashOrder;
    }

    public void setCashOrder(CashOrder cashOrder) {
        this.cashOrder = cashOrder;
    }

    public Client getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(Client clientOrder) {
        this.clientOrder = clientOrder;
    }

    public String getResultTransaction() {
        return resultTransaction;
    }

    public void setResultTransaction(String resultTransaction) {
        this.resultTransaction = resultTransaction;
    }

    public void setClientAccount(ClientAccount clientAccount) {
    }

    public ClientAccount getClientAccount() {
        return clientAccount;
    }
}
