package com.movingwalls.intvw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movingwalls.intvw.dao.TravelBooking;
import com.movingwalls.intvw.repository.TravelRepository;

@RestController
@RequestMapping("/travelbooking")
public class TravelController {

	@Autowired
	private TravelRepository travelRepository;
	
	@CrossOrigin
	@RequestMapping("/getPendingBooking")
	public List<TravelBooking> getAllPendingBooking(){
		return travelRepository.findByStatus("pending");
	}
	
	@CrossOrigin
	@RequestMapping(value="/editBooking", method=RequestMethod.POST)
	public String editBooking(@RequestBody TravelBooking travelBooking){
		System.out.println("Request masuk = " + travelBooking);
		travelBooking.setStatus("pending");
		travelRepository.save(travelBooking);
		return "success";
	}
	
	@RequestMapping("/managerApproval")
	public String managerApproval(@RequestParam("travelId")String id){
		TravelBooking manAppTravel = travelRepository.findById(Long.parseLong(id));
		manAppTravel.setStatus("pendingFinance");
		travelRepository.save(manAppTravel);
		return "success";
	}
	
	@RequestMapping("/managerReject")
	public String managerReject(@RequestParam("travelId")String id){
		TravelBooking manRejectTravel = travelRepository.findById(Long.parseLong(id));
		manRejectTravel.setStatus("managerReject");
		travelRepository.save(manRejectTravel);
		return "success";
	}
	
	@RequestMapping("/financeApproval")
	public String financeApproval(@RequestParam("travelId")String id){
		TravelBooking financeApproveTravel = travelRepository.findById(Long.parseLong(id));
		financeApproveTravel.setStatus("approved");
		travelRepository.save(financeApproveTravel);
		return "success";
	}
	
	@RequestMapping("/financeReject")
	public String financeReject(@RequestParam("travelId")String id){
		TravelBooking financeRejectTravel = travelRepository.findById(Long.parseLong(id));
		financeRejectTravel.setStatus("financeReject");
		travelRepository.save(financeRejectTravel);
		return "success";
	}
}
