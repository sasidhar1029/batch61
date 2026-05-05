package vcube.com.dto;

public class LoginUser {

	String name;
	String email;
	String password;
	String Re_password;

	public LoginUser() {

	}

	public LoginUser(String name, String email, String password, String p) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.Re_password = p;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRe_password() {
		return Re_password;
	}

	public void setRe_password(String re_password) {
		Re_password = re_password;
	}

}
