package dev.belueu.masterclass.oop;

import java.math.BigDecimal;

public class BankAccount {

    private String accountNumber;
    private BigDecimal balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("9999", new BigDecimal("10000"), "Default Name", "Default email", "Default phone number");
        System.out.println("No args constructor called!");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999", new BigDecimal("10000"), customerName, email, phoneNumber);
    }

    public BankAccount(String accountNumber, BigDecimal balance, String customerName, String email, String phoneNumber) {
        System.out.println("All args constructor called!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(BigDecimal depositAmount) {
        this.balance = this.balance.add(depositAmount);
    }

    public void withdrawMoney(BigDecimal withdrawAmount) {
        if (withdrawAmount.doubleValue() > this.balance.doubleValue()) {
            System.out.println("Insufficient funds! Current balance is: " + this.balance + " and withdraw amount is: " + withdrawAmount);
        } else {
            this.balance = this.balance.subtract(withdrawAmount);
        }

    }
}
