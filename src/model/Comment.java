package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    String autorOfComment;
    String comment;
    int like = 0;

    public Comment(){
        autorOfComment = null;
        comment = null;
    }

    public Comment(String autorOfComment, String comment) {
        this.autorOfComment = autorOfComment;
        this.comment = comment;
    }

    public String getAutorOfComment() {
        return autorOfComment;
    }

    public void setAutorOfComment(String autorOfComment) {
        this.autorOfComment = autorOfComment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void addLike(){
        like++;
    }
}
