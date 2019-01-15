package com.project.model.MakeMyTrip;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Passenger table in database
 */
@Entity
@Table(name="PASSENGER")
public class Passenger{

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private int id;
	@Column(name="passengerName")
	String passengerName; 

	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;

	@ManyToOne
	@Column(name="bookings")
	Bookings bookings;
	
	public Passenger() {
		super();
	}
	
	
	
	public Passenger( String passengerName, String email, String password, int pnr) {
		super();
		
		this.passengerName = passengerName;
		this.email = email;
		this.password = password;
		this.bookings=new Bookings(pnr,"","","","","","","",00.00);
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
}
	