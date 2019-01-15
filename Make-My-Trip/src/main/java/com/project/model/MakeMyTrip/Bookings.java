package com.project.model.MakeMyTrip;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKINGS")

public class Bookings {
	

	public Bookings(int pnr, String bookingDate, String passengerName, String source, String destination,
			String departure, String arrival, String journeydate, double price) {
		super();
		this.pnr = pnr;
		BookingDate = bookingDate;
		PassengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
		this.journeydate = journeydate;
		this.price = price;
	}

	@Id
	@Column(name = "PNR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "pnr_Sequence")
	@SequenceGenerator(name = "pnr_Sequence", sequenceName = "PNR_SEQ")
	private int pnr;

	@Column(name = "BookingDate")
	String BookingDate;

	@Column(name = "PassengerName")
	String PassengerName;

	@Column(name = "SOURCE")
	String source;

	@Column(name = "destination")
	String destination;

	@Column(name = "departure")
	String departure;

	@Column(name = "arrival")
	String arrival;

	@Column(name = "Journeydate")
	String journeydate;

	@Column(name = "price")
	double price;
}
