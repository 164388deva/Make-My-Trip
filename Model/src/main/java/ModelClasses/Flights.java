package ModelClasses;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="Flights")
public class Flights {

       @Id
       long flightid;
       String flightName;
       String source;
       String destination;
       String departure;
       String arrival;
       String departdate;
       double price;

       public long getFlightid() {
              return flightid;
       }

       public void setFlightid(long flightid) {
              this.flightid = flightid;
       }

       public String getFlightName() {
              return flightName;
       }

       public void setFlightName(String flightName) {
              this.flightName = flightName;
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

       public String getDepartdate() {
              return departdate;
       }

       public void setDepartdate(String departdate) {
              this.departdate = departdate;
       }

       public double getPrice() {
              return price;
       }

       public void setPrice(double price) {
              this.price = price;
       }

       @Override
       public String toString() {
              return "Flights [flightid=" + flightid + ", flightName=" + flightName + ", source=" + source + ", destination="
                           + destination + ", departure=" + departure + ", arrival=" + arrival + ", departdate=" + departdate
                           + ", price=" + price + "]";
       }

      
       public Flights(long flightid, String flightName, String source, String destination, String departure, String arrival,
			String departdate, double price) {
		super();
		this.flightid = flightid;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
		this.departdate = departdate;
		this.price = price;
	}

	public Flights()
       {
              super();
       }
}