package com.project.dao.MakeMyTrip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.project.model.MakeMyTrip.Passenger;



public class PassengerDAOImpl {
	
	private MongoOperations mongoOps;
	private static final String PASSENGER_COLLECTION = "Passenger";
	
	public PassengerDAOImpl(MongoOperations mongoOps){
		this.mongoOps=mongoOps;
	}
	
	@Autowired
	private PassengerDAO passengerDAO;
	
	
	public void addPassenger(Passenger passenger) {
		this.mongoOps.insert(passenger, PASSENGER_COLLECTION);
	}
	
	public List<Passenger> getAllPassenger() {
		return this.mongoOps.findAll(Passenger.class, PASSENGER_COLLECTION);
	} 
	
	public Passenger getPassenger(int id) {
		Query query = new Query(Criteria.where("_id").is(id));
		return passengerDAO.findOne(query, Passenger.class, PASSENGER_COLLECTION);
	}
	
	public void updatePassenger(Passenger passenger) {
		this.mongoOps.save(passenger, PASSENGER_COLLECTION);
	}
	
	public void deletePassenger(int id) {
		Query query = new Query(Criteria.where("_id").is(id));
		this.mongoOps.remove(query, Passenger.class, PASSENGER_COLLECTION);	
	} 

}
