package DAO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named ("EntityManagerDao")
@ApplicationScoped
public class EntityManagerDao implements Serializable {
    private static final long serialVersionUID = -25786612485945L;

    EntityManagerFactory entityManagerFactory = null;

    //@PersistenceContext(unitName="qubiowebsite")
    EntityManager entityManager;

    public UserDao getUserDao() {
        return userDao;
    }

    UserDao userDao;

    public EntityManagerDao() {
        System.out.println( "on construit mon super dao" );
        entityManagerFactory = Persistence.createEntityManagerFactory("qubiowebsite");
        entityManager = entityManagerFactory.createEntityManager();
        userDao = new UserDao(this);
    }

   /* public void init(){
        System.out.println( "on construit mon super dao" );
        entityManagerFactory = Persistence.createEntityManagerFactory("QubioWebsite");
        entityManager = entityManagerFactory.createEntityManager();
    }*/

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
