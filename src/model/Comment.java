package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "comment")
public class Comment implements Serializable {
    private static final long serialVersionUID = 2050885057741919572L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String autorOfComment;
    private String comment;
    private int nbLike = 0;

    public Comment(){
        autorOfComment = "";
        comment = "";
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

    public int getNbLike() {
        return nbLike;
    }

    public void setNbLike(int nbLike) {
        this.nbLike = nbLike;
    }

    public void addLike(){
        nbLike++;
    }
}
