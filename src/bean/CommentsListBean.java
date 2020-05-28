package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import model.Comment;


@Named
@SessionScoped
public class CommentsListBean implements Serializable {

	private static final long serialVersionUID = 2050885057741919572L;
	
	private Comment newComment;
	private List<Comment> commentsList;

    public CommentsListBean(){
    	System.out.println("CommentsListBean()");
    	newComment = new Comment("test", "test");
    	commentsList = new ArrayList<Comment>();
    	commentsList.add(new Comment("Jb", "C'est HONTEUUUUUX !!"));
    	commentsList.add(new Comment("Ahlam", "Mais pourquoi faire ?"));
    	commentsList.add(new Comment("Théo", "Je vais demander à Mei Chan"));
    	commentsList.add(new Comment("Florian", "Connaissez vous le jeu du Sirop ?"));
    	commentsList.add(new Comment("Oscar", "Ah ah ah ! Mais c'était sur en fait !"));
    }

	public Comment getNewComment() {
		return newComment;
	}

	public void setNewComment(Comment newComment) {
		this.newComment = newComment;
	}

	public List<Comment> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comment> commentsList) {
		this.commentsList = commentsList;
	}

    public String postCommentAction(ActionEvent event) {
    	System.out.println("CommentsListBean()");
    	return "succes";
    }
}
