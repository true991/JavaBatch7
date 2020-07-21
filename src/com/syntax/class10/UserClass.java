package com.syntax.class10;

public class UserClass {

	public String name;
	public int mobile;

	UserClass(String name, int mobile) {
		this.name = name;
		this.mobile = mobile;
	}

}

class UserInfo extends UserClass {
	public String adress;

	UserInfo(String name, int mobile, String adress) {
		super(name, mobile);
		this.adress = adress;
	}

}

class UserDetails {
	UserInfo x = new UserInfo("Igor", 128281293, "Tulip dr");
	
	
}
