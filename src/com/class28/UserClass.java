package com.class28;

public class UserClass {

//	Write program: userClass  that has a constructor that initializes name and mobile number istance variables.
//	Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
//	Print users name, mobile number and address in userDetails method. Test your code.
UserClass(){
	String name;
	String mobileNumber;
}
}
class UserInfo extends UserClass{
	String address;
	UserInfo(String name, String mobileNumber, String address){
		super(name, mobileNumber);
		this.address=address;
	}
	public void userDetail() {
		System.out.println(name+ " "+mobileNumber+" "+address);
	}
	public static void main(String[] args) {
		UserInfo obj=new UserInfo("John","5712771301","4600 Duke Street");
		obj.userDetail();
	}
}