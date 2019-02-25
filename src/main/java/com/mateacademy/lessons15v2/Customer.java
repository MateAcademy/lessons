package com.mateacademy.lessons15v2;

import java.math.BigDecimal;

public class Customer implements java.io.Serializable {

    private BigDecimal custNum;
    private String company;
    private BigDecimal custRep;
    private BigDecimal creditLimit;

    public Customer() {
    }

    public Customer(BigDecimal custNum, String company, BigDecimal custRep, BigDecimal creditLimit) {
        this.custNum = custNum;
        this.company = company;
        this.custRep = custRep;
        this.creditLimit = creditLimit;
    }

    public BigDecimal getCustNum() {
        return custNum;
    }

    public void setCustNum(BigDecimal custNum) {
        this.custNum = custNum;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BigDecimal getCustRep() {
        return custRep;
    }

    public void setCustRep(BigDecimal custRep) {
        this.custRep = custRep;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }



}
