package loginpackage;

public class user{
	String email,password;
	user(String email,String pass){
		this.email=email;
		this.password=pass;
		
	}
	String getEmail() {
		return email;
	}
	String getPass() {
		return password;
	}
	void setEmail(String email) {
		this.email=email;
	}
	void setPass(String pass) {
		this.password=pass;
	}
}