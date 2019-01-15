package com.project.dao.MakeMyTrip;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.model.MakeMyTrip.Passenger;

public interface PassengerDAO extends CrudRepository<Passenger, String> {

	Passenger findOne(Query query, Class<Passenger> class1, String passengerCollection);
	
}

	
