package com.movingwalls.intvw.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="TRAVEL_BOOKING")
public class TravelBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="TRAVEL_DESCRIPTION")
	private String travelName; //description
	
	@Column
	private Date startDate;
	
	@Column
	private Date endDate;
	
	@Column
	private String modeOfTravel;
	
	@Column
	private double ticketCost;
	
	@Column
	private double airportCabCost;
	
	@Column
	private double destAirportCabCost;
	
	@Column
	private double hotelCost;
	
	@Column
	private long localConveyance;
	
	@Column
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTravelName() {
		return travelName;
	}
	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getModeOfTravel() {
		return modeOfTravel;
	}
	public void setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public double getAirportCabCost() {
		return airportCabCost;
	}
	public void setAirportCabCost(double airportCabCost) {
		this.airportCabCost = airportCabCost;
	}
	public double getDestAirportCabCost() {
		return destAirportCabCost;
	}
	public void setDestAirportCabCost(double destAirportCabCost) {
		this.destAirportCabCost = destAirportCabCost;
	}
	public double getHotelCost() {
		return hotelCost;
	}
	public void setHotelCost(double hotelCost) {
		this.hotelCost = hotelCost;
	}
	public long getLocalConveyance() {
		return localConveyance;
	}
	public void setLocalConveyance(long localConveyance) {
		this.localConveyance = localConveyance;
	}
	
	
}
