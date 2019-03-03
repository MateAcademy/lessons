package com.mateacademy.lessons16;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author spasko
 */
public class OrderDaoImpl implements OrderDao {
    private static EntityManagerFactory factory;
    static {
        Locale.setDefault(Locale.ENGLISH);
        factory = Persistence.createEntityManagerFactory("PERSISTENCE");
    }
    private static final Logger LOG = LogManager.getLogger(OrderDaoImpl.class);
    private EntityManager entityManager = factory.createEntityManager();

    @Override
    public Set<Orders> getAllOrders() throws SQLException {
        return null;
    }

    @Override
    public Set<Orders> getAllOrdersInnerJoin() throws SQLException {
        return null;
    }

    @Override
    public Orders findOrderById(BigDecimal id) throws SQLException {
        return null;
    }

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
    public boolean updateOrder(Orders order) throws SQLException {
        LOG.debug("updating Orders instance");
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(order);
            entityManager.getTransaction().commit();
            LOG.debug("update successful");
            return true;
        } catch (RuntimeException re) {
            if (entityManager != null) {
                System.out.println("Transaction is being rolled back.");
                entityManager.getTransaction().rollback();
            }
            LOG.error("update failed", re);
            throw re;
        }
    }

    @Override
    public boolean deleteOrder(BigDecimal id) throws SQLException {
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
}