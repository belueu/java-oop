package dev.belueu.masterclass.oop1;

import java.math.BigDecimal;

public class VipCustomer {
    private String name;
    private BigDecimal creditLimit;
    private String email;

    public VipCustomer() {
        this("Default Name", new BigDecimal("20000"), "Default email");
    }

    public VipCustomer(BigDecimal creditLimit, String email) {
        this("John Smith", creditLimit, email);
    }

    public VipCustomer(String name, BigDecimal creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
