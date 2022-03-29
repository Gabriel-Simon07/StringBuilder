package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private Date moment;
	private OrderStatus status;

	private List<OrderItem> itens = new ArrayList<OrderItem>();
	
	public Order() { }
			
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return moment + " " + status;
	}

	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
//	public double total() {
//		return ;
//	}
}