package com.mateacademy.lessons16.ipa;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mateacademy.lessons16.entry.Customers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerDaoImpl  implements CustomerDao{
    private static EntityManagerFactory factory;

    static {
        Locale.setDefault(Locale.ENGLISH);
        factory = Persistence.createEntityManagerFactory("PERSISTENCE");
    }

    public static final Logger LOG = LogManager.getLogger(CustomerDaoImpl.class);

    private EntityManager entityManager = factory.createEntityManager();

    @Override
    public boolean insertCustomer(Customers customer) throws SQLException {
        LOG.debug("persisting Customer instance");
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(customer);
            entityManager.getTransaction().commit();
            LOG.debug("persist successful");
            return true;
        } catch (RuntimeException re) {
            if (entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                entityManager.getTransaction().rollback();
            }
            LOG.error("persist failed", re);
            throw re;
        }
    }

    @Override
    public boolean updateCustomer(Customers customer) throws SQLException {
        LOG.debug("merging Customer instance");
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(customer);
            entityManager.getTransaction().commit();
            LOG.debug("merge successful");
            return true;
        } catch (RuntimeException re) {
            if (entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                entityManager.getTransaction().rollback();
            }
            LOG.error("merge failed", re);
            throw re;
        }
    }

    @Override
    public boolean deleteCustomer(BigDecimal id) throws SQLException {
        LOG.debug("removing Customer instance");
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.find(Customers.class, id));
            entityManager.getTransaction().commit();
            LOG.debug("remove successful");
            return true;
        } catch (RuntimeException re) {
            if (entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                entityManager.getTransaction().rollback();
            }
            LOG.error("remove failed", re);
            throw re;
        }
    }
}