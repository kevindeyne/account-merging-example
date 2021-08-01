package com.ryan;

import java.math.BigDecimal;

public class Account {

    private int id;
    private String customerName;
    private String customerCity;
    private BigDecimal accountBalance;

    public Account(int id, String customerName, String customerCity, BigDecimal accountBalance) {
        this.id = id;
        this.customerName = customerName;
        this.customerCity = customerCity;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerCity='" + customerCity + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
}
