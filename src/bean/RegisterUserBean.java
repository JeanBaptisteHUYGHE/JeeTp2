package bean;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import DAO.UserDao;
import model.User;


@Named /*("registerUserBean")*/
@SessionScoped
public class RegisterUserBean implements Serializable {
	private static final long serialVersionUID = 1554960432393184460L;

	@Inject
	private UserDao userDao;

	private String name;
	private String email;
	
	public RegisterUserBean() {
		name = "";
		email = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String submitAction() {
		User user = new User();
		user.setNom(name);
		user.setEmail(email);
		userDao.saveUser(user);
    	System.out.println("submitAction()");
    	return "success";
    }
}
