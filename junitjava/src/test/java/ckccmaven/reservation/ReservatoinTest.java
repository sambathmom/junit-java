package ckccmaven.reservation;

import static org.junit.Assert.*;

import org.junit.Test;

import ckccmaven.user.Reservation;
import ckccmaven.user.User;

public class ReservatoinTest {
	
	private Reservation reservation;
	private User user;

	@Test
	public void testCanBeCancelByAdmin() {
		reservation = new Reservation();
		user = new User(1, true);
		User user1 = new User(2, false);
		reservation.setMadeBy(user1);
		
		assertTrue(reservation.canBeCancelBy(user));
	}
	
	@Test
	public void testCanBeCancelByCreater() {
		reservation = new Reservation();
		user = new User(1, false);
		
		reservation.setMadeBy(user);
		
		assertTrue(reservation.canBeCancelBy(user));
	}
	
	@Test
	public void testCanBeCancelByNotAdminAndNotCreater() {
		reservation = new Reservation();
		user = new User(1, false);
		User user1 = new User(2, false);
		
		reservation.setMadeBy(user1);
		
		assertFalse(reservation.canBeCancelBy(user));	
	}
	
}
