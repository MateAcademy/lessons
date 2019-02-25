package com.mateacademy.lessons16.ipa;

import com.mateacademy.lessons16.entry.Orders;
import com.mateacademy.lessons16.ipa.OrderDao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class OrderDaoImpl implements OrderDao {
    private static EntityManagerFactory factory;

    static {
        Locale.setDefault(Locale.ENGLISH);
        factory = Persistence.createEntityManagerFactory("PERSISTENCE");
    }

    private static final Logger LOG = LogManager.getLogger(com.mateacademy.lessons16.ipa.OrderDaoImpl.class);

    private EntityManager entityManager = factory.createEntityManager();

    @Override
    public boolean insertOrder(Orders transientInstance) {
        LOG.debug("persisting Orders instance");
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(transientInstance);
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
    public boolean deleteOrder(BigDecimal id) {
        LOG.debug("removing Orders instance");
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.find(Orders.class, id));
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

    @Override
    public boolean updateOrder(Orders detachedInstance) {
        LOG.debug("merging Orders instance");
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(detachedInstance);
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
    public Set<Orders> getAllOrders() throws SQLException {
        return null;
    }

    @Override
    public Orders findOrderById(BigDecimal id) throws SQLException {
        return null;
    }

}
