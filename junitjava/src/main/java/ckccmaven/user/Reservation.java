package ckccmaven.user;

public class Reservation {
	private User madeBy;
	
	public User getMadeBy() {
		return this.madeBy;
	}
	
	public void setMadeBy(User user) {
		this.madeBy = user;
	}
	
	public boolean canBeCancelBy(User user) {	
		
		if (user.getIsAdmin() || user.getId() == madeBy.getId()) {
			return true;
		} else {
			return false;
		}				
	}
	
}
