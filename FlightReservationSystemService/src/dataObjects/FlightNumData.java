package dataObjects;

import java.util.Date;

public class FlightNumData {
	private Integer id;
	private Integer flightNum;
	private Date date;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(Integer flightNum) {
		this.flightNum = flightNum;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
