package DAO;

import model.Comment;
import model.User;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

/*@Named("UserDao")
@SessionScoped*/
public class UserDao implements Serializable {
    private static final long serialVersionUID = -25787861285945L;

    @Inject
    private EntityManagerDao entityManagerDao;

    public void saveUser(User user){
        entityManagerDao.getEntityManager().getTransaction().begin();
        entityManagerDao.getEntityManager().persist(user);
        entityManagerDao.getEntityManager().getTransaction().commit();
    }

    public void update(User user){
        entityManagerDao.getEntityManager().getTransaction().begin();
        entityManagerDao.getEntityManager().persist(user);
        entityManagerDao.getEntityManager().getTransaction().commit();
    }

    public List<User> getUsers(){
        TypedQuery<User> queryLocation = entityManagerDao.getEntityManager().createQuery(
                "FROM user",User.class);
        return queryLocation.getResultList();
    }

    public UserDao(){
    }
}
