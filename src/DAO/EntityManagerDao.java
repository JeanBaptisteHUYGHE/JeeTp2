package DAO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.*;
import java.io.Serializable;

@Named ("EntityManagerDao")
@ApplicationScoped
public class EntityManagerDao implements Serializable {
    private static final long serialVersionUID = -25786612485945L;

    EntityManagerFactory entityManagerFactory = null;

    EntityManager entityManager;

    public UserDao getUserDao() {
        return userDao;
    }

    UserDao userDao;

    public EntityManagerDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("qubiowebsite");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
