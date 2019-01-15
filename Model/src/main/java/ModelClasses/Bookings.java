package ModelClasses;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Bookings")

public class Bookings {

	       @Id
	       private long pnr;
	       String BookingDate;
	       String PassengerName;
	       String source;
	       String destination;
	       String departure;
	       String arrival;
	       String journeydate;
	       double price;
	       
	       
	       
		public Bookings() {
			super();
			
		}
		
		public Bookings(String bookingDate, String passengerName, String source, String destination, String departure,
				String arrival, String journeydate, double price) {
			super();
			BookingDate = bookingDate;
			PassengerName = passengerName;
			this.source = source;
			this.destination = destination;
			this.departure = departure;
			this.arrival = arrival;
			this.journeydate = journeydate;
			this.price = price;
		}



		public long getPnr() {
			return pnr;
		}
		public void setPnr(long pnr) {
			this.pnr = pnr;
		}
		public String getBookingDate() {
			return BookingDate;
		}
		public void setBookingDate(String bookingDate) {
			BookingDate = bookingDate;
		}
		public String getPassengerName() {
			return PassengerName;
		}
		public void setPassengerName(String passengerName) {
			PassengerName = passengerName;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getDeparture() {
			return departure;
		}
		public void setDeparture(String departure) {
			this.departure = departure;
		}
		public String getArrival() {
			return arrival;
		}
		public void setArrival(String arrival) {
			this.arrival = arrival;
		}
		public String getJourneydate() {
			return journeydate;
		}
		public void setJourneydate(String journeydate) {
			this.journeydate = journeydate;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Bookings [pnr=" + pnr + ", BookingDate=" + BookingDate + ", PassengerName=" + PassengerName
					+ ", source=" + source + ", destination=" + destination + ", departure=" + departure + ", arrival="
					+ arrival + ", journeydate=" + journeydate + ", price=" + price + "]";
		}
	       
	       
}
