package DAO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Named ("EntityManagerDao")
@ApplicationScoped
class EntityManagerDao {

    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;

    public void entytiManagerDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("QubioWebsite");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
