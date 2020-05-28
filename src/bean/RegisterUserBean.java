package bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import model.User;


@Named
@SessionScoped
public class RegisterUserBean implements Serializable {

	private static final long serialVersionUID = 1554960432393184460L;
	
	private String name;
	private String email;
	
	public RegisterUserBean() {
		name = "1";
		email = "2";
		//password = "";
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
	
	public String submitAction(ActionEvent event) {
		email = email + "_ok";
    	System.out.println("submitAction()");
    	return "succes";
    }
}
