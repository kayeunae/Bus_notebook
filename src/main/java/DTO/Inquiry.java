package DTO;

public class Inquiry {
	private String bus_no;
	private String id;
	private String depart;
	private String arrival;
	private String d_time;
	private String duration;
	private int ticket;
	
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getD_time() {
		return d_time;
	}
	public void setD_time(String d_time) {
		this.d_time = d_time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
}
