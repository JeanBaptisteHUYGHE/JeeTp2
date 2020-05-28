package DAO;

import model.Comment;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

@Named("CommentDao")
@ApplicationScoped
class CommentDao implements Serializable {
    private static final long serialVersionUID = -254254685945L;

    @Inject
    EntityManagerDao entityManagerDao;

    public void saveComment(Comment comment){
        entityManagerDao.getEntityManager().persist(comment);
    }

    public void update(Comment comment){
        entityManagerDao.getEntityManager().persist(comment);
        entityManagerDao.getEntityManager().persist(comment);
    }

    public List<Comment> getComments(){
        TypedQuery<Comment> queryLocation = entityManagerDao.getEntityManager().createQuery(
                "FROM comment",Comment.class);
        return queryLocation.getResultList();
    }
}
