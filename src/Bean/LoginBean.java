package Bean;

import DAO.EntityManagerDao;
import DAO.UserDao;
import model.User;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named /*("loginBean")*/
@SessionScoped
public class LoginBean implements Serializable {
    private static final long serialVersionUID = -254251875945L;

    private String login = "user madkhbcSEUF";
    private String password = "pass";

    @Inject
    //private UserDao userDao;
    private EntityManagerDao entityManagerDao;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

        public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String returnAction() {
        System.out.println( "in returnAction test" );
        User user = new User();
        user.setEmail("toto@to.fr");
        user.setMotDePasse(password);
        user.setNom(login);
        entityManagerDao.getUserDao().saveUser(user);
        return password.equals( "response.xhtml" ) ? "" : " login.xhtml";
    }
}