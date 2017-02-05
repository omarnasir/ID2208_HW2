package dataObjects;

public class FlightCityData {
	private Integer id;
	private String fromCity;
	private String toCity;
	private Integer flightNum;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public Integer getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(Integer flightNum) {
		this.flightNum = flightNum;
	}
}
