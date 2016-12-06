package Dining;
import java.sql.*;

public class Order {
	private int orderId;
	private double totalPrice;
	private java.sql.Date dateOfOrder;
	private int venueId;
	private int userId;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public java.sql.Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(java.sql.Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
