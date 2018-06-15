package ckccmaven.user;

public class User {
	private boolean isAdmin;
	private int id;
	
	public User(int id, boolean isAdmin) {
		this.id = id; 
		this.isAdmin = isAdmin;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean getIsAdmin() {
		return this.isAdmin;
	}
	
	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
