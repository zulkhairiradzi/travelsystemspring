package com.movingwalls.intvw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.movingwalls.intvw.dao.TravelBooking;
import com.movingwalls.intvw.repository.TravelRepository;

@SpringBootApplication
public class InterviewApplication{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private TravelRepository travelRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}	
	
}
