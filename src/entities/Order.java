package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
		
	private Date date;
	private OrderStatus status;
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date date, OrderStatus status, List<OrderItem> orderItem) {
		super();
		this.date = date;
		this.status = status;
		this.orderItem = orderItem;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
		
	

}
