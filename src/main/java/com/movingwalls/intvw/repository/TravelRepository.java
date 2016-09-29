package com.movingwalls.intvw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.movingwalls.intvw.dao.TravelBooking;

public interface TravelRepository extends CrudRepository<TravelBooking, Long> {

	public List<TravelBooking> findByStatus(String status);
	public TravelBooking findById(long id);
	
}
