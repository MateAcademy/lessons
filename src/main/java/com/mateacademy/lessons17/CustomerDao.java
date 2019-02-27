package com.mateacademy.lessons17;

import java.math.BigDecimal;


public interface CustomerDao {
    boolean insertCustomer(Customers customer);

    boolean updateCustomer(Customers customer);

    boolean deleteCustomer(BigDecimal cust_num);
}