package com.mateacademy.lessons16;
// Generated Jan 26, 2019 11:24:41 AM by Hibernate Tools 5.2.10.Final


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private String productId;
     private String mfrId;
     private String description;
     private BigDecimal price;
     private BigDecimal qtyOnHand;
     private Set<Order> orders = new HashSet<Order>(0);

    public Product() {
    }

	
    public Product(String productId) {
        this.productId = productId;
    }
    public Product(String productId, String mfrId, String description, BigDecimal price, BigDecimal qtyOnHand, Set<Order> orders) {
       this.productId = productId;
       this.mfrId = mfrId;
       this.description = description;
       this.price = price;
       this.qtyOnHand = qtyOnHand;
       this.orders = orders;
    }
   
    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getMfrId() {
        return this.mfrId;
    }
    
    public void setMfrId(String mfrId) {
        this.mfrId = mfrId;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getQtyOnHand() {
        return this.qtyOnHand;
    }
    
    public void setQtyOnHand(BigDecimal qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("productId").append("='").append(getProductId()).append("' ");			
      buffer.append("mfrId").append("='").append(getMfrId()).append("' ");			
      buffer.append("description").append("='").append(getDescription()).append("' ");			
      buffer.append("price").append("='").append(getPrice()).append("' ");			
      buffer.append("qtyOnHand").append("='").append(getQtyOnHand()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


