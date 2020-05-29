package DAO;

import model.Comment;
import model.User;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

@Named("UserDao")
@SessionScoped
public class UserDao implements Serializable {
    private static final long serialVersionUID = -25787861285945L;

    private static EntityManager em = EntityManagerDao.getEntityManager();

    public void saveUser(User user){
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public void update(User user){
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public List<User> getUsers(){
        TypedQuery<User> queryLocation = em.createQuery(
                "SELECT User FROM User user",User.class);
        return queryLocation.getResultList();
    }

    public UserDao(){
    }
}
