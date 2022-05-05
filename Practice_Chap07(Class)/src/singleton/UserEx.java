package singleton;

import java.util.Calendar;

public class UserEx {
	
	public static void main(String[] args) {
		//User u = new User(); // error
		
		User user = User.getSingleton();
		user.add();
		System.out.println(user);
		
		
		User user2 = User.getSingleton();
		user.add();
		System.out.println(user2);
		
		if (user.equals(user2)) {
			System.out.println("singleton ∞¥√º »Æ¿Œ");
		}
	}

}
