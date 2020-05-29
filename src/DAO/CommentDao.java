package DAO;

import model.Comment;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("CommentDao")
@ApplicationScoped
public class CommentDao implements Serializable {
    private static final long serialVersionUID = -254254685945L;


    private static EntityManager em = EntityManagerDao.getEntityManager();

    public void saveComment(Comment comment){
        em.getTransaction().begin();
        em.persist(comment);
        em.getTransaction().commit();
    }

    public void update(Comment comment){
        em.getTransaction().begin();
        em.persist(comment);
        em.getTransaction().commit();
    }

    public static List<Comment> getComments(){
        System.out.println("par la ca passe e3");
        try{
        TypedQuery<Comment> queryComment = em.createQuery(
                "SELECT Comment FROM Comment comment",Comment.class);
            return queryComment.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<Comment>();
    }

    public CommentDao(){

    }
}
