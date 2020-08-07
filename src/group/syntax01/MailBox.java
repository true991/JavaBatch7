package group.syntax01;

public class MailBox {
	public static void main(String[] args) {

		Registration x = new Registration();

		x.setEmail("wizzard");
		x.setUserName("HarryPotter");
		x.setPassword("qwerty01");

		System.out.println(x.getEmail());
		System.out.println(x.getUserName());
		System.out.println(x.getPassword());

	}

}

class Registration {
	private String email, userName, password;

	public void setEmail(String email) {
		email += "@yahoo.com";
		this.email = email;

	}

	public void setUserName(String userName) {
		if (userName.length() != 0 && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println("Username field cannot be empty and should be larger than 6 characters");
		}

	}

	public void setPassword(String password) {
		if (password.length() != 0 && password.length() > 6) {
			if (!password.contains(userName)) {
				this.password = password;
			} else {
				System.out.println("Password cannot contain Username");
			}
		} else {
			System.out.println("Password field cannot be empty and should be larger than 6 characters");
		}

	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
