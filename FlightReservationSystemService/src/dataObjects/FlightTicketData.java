package dataObjects;

public class FlightTicketData {
	private Integer id;
	private boolean isTicketAvail;
	private Integer price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isTicketAvail() {
		return isTicketAvail;
	}
	public void setTicketAvail(boolean isTicketAvail) {
		this.isTicketAvail = isTicketAvail;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
