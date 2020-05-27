package DAO;

import model.Comment;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import java.util.List;

@Named("CommentDao")
@ApplicationScoped
class CommentDao {

    @Inject
    EntityManagerDao entityManagerDao;

    void SaveComment(Comment comment){
        entityManagerDao.getEntityManager().persist(comment);
    }

    void Update(Comment comment){
        entityManagerDao.getEntityManager().persist(comment);
        entityManagerDao.getEntityManager().persist(comment);
    }

    List<Comment> getComments(){
        TypedQuery<Comment> queryLocation = entityManagerDao.getEntityManager().createQuery(
                "FROM comment",Comment.class);
        return queryLocation.getResultList();
    }
}
