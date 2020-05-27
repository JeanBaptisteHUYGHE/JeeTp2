package DAO;

import model.Comment;
import model.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import java.util.List;

@Named("UserDao")
@ApplicationScoped
public class UserDao {

    @Inject
    EntityManagerDao entityManagerDao;

    void SaveComment(User user){
        entityManagerDao.getEntityManager().persist(user);
    }

    void Update(User user){
        entityManagerDao.getEntityManager().persist(user);
    }

    List<User> getComments(){
        TypedQuery<User> queryLocation = entityManagerDao.getEntityManager().createQuery(
                "FROM user",User.class);
        return queryLocation.getResultList();
    }
}
