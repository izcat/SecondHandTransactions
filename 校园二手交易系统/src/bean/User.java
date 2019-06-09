package bean;

public class User {
	private int id;
	private String username;
	private String password;
	public User()
	{}
	public User (String s1,String s2)
	{
		username=s1;
		password=s2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String user) {
		this.username = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
