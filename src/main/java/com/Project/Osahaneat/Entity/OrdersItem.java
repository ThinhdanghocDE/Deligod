package com.Project.Osahaneat.Entity;

import java.util.Date;

import com.Project.Osahaneat.Entity.key.idOrdersItem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "ordersitem")
@IdClass(idOrdersItem.class)
public class OrdersItem {
	@Id
	@Column(name = "order_id")
	private int orderId;
	
	@Id
	@Column(name = "food_id")
	private int foodId;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name = "order_id", insertable = false, updatable = false)
	private Orders ordersOI;
	
	@ManyToOne
	@JoinColumn(name = "food_id", insertable = false, updatable = false)
	private Food foodOI;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Orders getOrdersOI() {
		return ordersOI;
	}

	public void setOrdersOI(Orders ordersOI) {
		this.ordersOI = ordersOI;
	}

	public Food getFoodOI() {
		return foodOI;
	}

	public void setFoodOI(Food foodOI) {
		this.foodOI = foodOI;
	}
}
