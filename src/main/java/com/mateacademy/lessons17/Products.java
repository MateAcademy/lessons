package com.mateacademy.lessons17;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRODUCTS", schema = "MA_STUDENT")
public class Products implements Serializable {

    @Id
    @Column(name = "PRODUCT_ID")
    private String product_id;
    @Column(name = "MFR_ID")
    private String mfr_id;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "QTY_ON_HAND")
    private BigDecimal qty_on_hand;
    //    @OneToMany(fetch = FetchType.EAGER, mappedBy = "Products")
 //   private Set<Orders> orders = new HashSet<Orders>();

    public Products(){}

//    public Products(String mfr_ID, String product_ID, String description, BigDecimal price, BigDecimal qtyOnHand) {
//        this.mfr_ID = mfr_ID;
//        this.product_ID = product_ID;
//        this.description = description;
//        this.price = price;
//        this.qtyOnHand = qtyOnHand;
//    }


    public String getMfr_id() {
        return mfr_id;
    }

    public void setMfr_id(String mfr_id) {
        this.mfr_id = mfr_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQty_on_hand() {
        return qty_on_hand;
    }

    public void setQty_on_hand(BigDecimal qty_on_hand) {
        this.qty_on_hand = qty_on_hand;
    }

//    public Set<Orders> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(Set<Orders> orders) {
//        this.orders = orders;
//    }

    @Override
    public String toString() {
        return "Products{" +
                "mfr_id='" + mfr_id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", qty_on_hand=" + qty_on_hand +
//                ", orders=" + orders +
                '}';
    }
}