package com.Project.Osahaneat.Entity.key;

import java.io.Serializable;

public class idOrdersItem implements Serializable{
	private int foodId;
	private int orderId;
	public idOrdersItem() {}

	public idOrdersItem(int orderId, int foodId) {
		this.foodId = foodId;
		this.orderId = orderId;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}
