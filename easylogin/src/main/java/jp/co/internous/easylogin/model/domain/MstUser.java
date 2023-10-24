package jp.co.internous.easylogin.model.domain;

public class MstUser {

	private int id;
		
	private String userName;
		
	private String password;
	
	private String fullName;

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getfullName() {
		return fullName;
	}
	public void setfullName(String fullName) {
		this.fullName=fullName;
	}
}
