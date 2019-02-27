package com.mateacademy.lessons16;

import java.math.BigDecimal;

public interface CustomerDao {
    boolean insertCustomer(Customers customer);

    boolean updateCustomer(Customers customer);

    boolean deleteCustomer(BigDecimal cust_num);
}