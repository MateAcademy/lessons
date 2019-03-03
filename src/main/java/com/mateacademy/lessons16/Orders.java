package com.mateacademy.lessons16;

// Generated Feb 2, 2019 5:38:52 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ORDERS", schema = "MA_STUDENT")
public class Orders implements java.io.Serializable {
    @Id
    @Column(name = "ORDER_NUM")
    private BigDecimal order_num;
    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE")
    private Date order_date;
    @Column(name = "CUST")
    private BigDecimal cust;
    @Column(name = "REP")
    private BigDecimal rep;
    @Column(name = "MFR")
    private String mfr;
    @Column(name = "PRODUCT")
    private String product;
    @Column(name = "Qty")
    private BigDecimal qty;
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    public Orders() {
    }

    public Orders(BigDecimal order_num,   Date order_date, BigDecimal cust, BigDecimal rep,
                  String mfr, String product, BigDecimal qty, BigDecimal amount) {
        this.product = product;
        this.order_num = order_num;
        this.order_date = order_date;
        this.amount = amount;
        this.qty = qty;
        this.mfr = mfr;
        this.rep = rep;
        this.cust = cust;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigDecimal getOrderNum() {
        return order_num;
    }

    public void setOrderNum(BigDecimal order_num) {
        this.order_num = order_num;
    }

    public Date getOrderDate() {
        return order_date;
    }

    public void setOrderDate(Date order_date) {
        this.order_date = order_date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getMfr() {
        return mfr;
    }

    public void setMfr(String mfr) {
        this.mfr = mfr;
    }

    public BigDecimal getOrder_num() {
        return order_num;
    }

    public void setOrder_num(BigDecimal order_num) {
        this.order_num = order_num;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public BigDecimal getRep() {
        return rep;
    }

    public void setRep(BigDecimal rep) {
        this.rep = rep;
    }

    public BigDecimal getCust() {
        return cust;
    }

    public void setCust(BigDecimal cust) {
        this.cust = cust;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", order_num=" + order_num +
                ", order_date=" + order_date +
                ", amount=" + amount +
                ", qty=" + qty +
                ", mfr='" + mfr + '\'' +
                ", rep=" + rep +
                ", cust=" + cust +
                '}';
    }
}