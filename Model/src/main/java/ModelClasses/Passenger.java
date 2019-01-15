package ModelClasses;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * This is our model class and it corresponds to Passenger table in database
 */
@Document(collection = "passenger")
public class Passenger{

	@Id
	long id;
	String passengerName; 
	String email;
	String password;
	Bookings bookings;
	
	public Passenger() {
		super();
	}
	
	
	public Passenger( String passengerName, String email, String password) {
		super();
		
		this.passengerName = passengerName;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
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
	 
	
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", passengerName=" + passengerName + ", email=" + email + ", password="
				+ password + ", bookings=" + bookings + "]";
	}
	
}