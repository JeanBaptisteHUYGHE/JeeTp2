package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import DAO.CommentDao;
import model.Comment;


@Named /*("CommentsListBean")*/
@ApplicationScoped
public class CommentsListBean implements Serializable {
	private static final long serialVersionUID = 2050885057741919572L;
	
	private String newComment = "";
	private String newCommentAuthor = "";
	private List<Comment> commentsList;

	@Inject
	CommentDao commentDao;

	public String getNewComment() {
		return newComment;
	}

	public void setNewComment(String newComment) {
		this.newComment = newComment;
	}

	public String getNewCommentAuthor() {
		return newCommentAuthor;
	}

	public void setNewCommentAuthor(String newCommentAuthor) {
		this.newCommentAuthor = newCommentAuthor;
	}


    public CommentsListBean(){
    }

	public List<Comment> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comment> commentsList) {
		this.commentsList = commentsList;
	}

    public String postCommentAction() {
		Comment theNewComment = new Comment(newCommentAuthor,newComment);
		commentDao.saveComment(theNewComment);
    	return "succes";
    }

	public String likeComment(Comment comment){
		System.out.println("plus un like !!!");
		comment.addLike();
		commentDao.update(comment);
		return "success";
	}
}
