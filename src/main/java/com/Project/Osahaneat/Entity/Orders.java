package com.Project.Osahaneat.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users usersOrders;
	
	@ManyToOne
	@JoinColumn(name = "res_id")
	private Restaurant restaurantOrders;
	
	@OneToMany(mappedBy = "ordersOI")
	private List<OrdersItem> ListOrdersItem;
	
	public Restaurant getRestaurantOrders() {
		return restaurantOrders;
	}

	public void setRestaurantOrders(Restaurant restaurantOrders) {
		this.restaurantOrders = restaurantOrders;
	}

	public List<OrdersItem> getListOrdersItem() {
		return ListOrdersItem;
	}

	public void setListOrdersItem(List<OrdersItem> listOrdersItem) {
		ListOrdersItem = listOrdersItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Users getUsersOrders() {
		return usersOrders;
	}

	public void setUsersOrders(Users usersOrders) {
		this.usersOrders = usersOrders;
	}

	public Restaurant getResOrders() {
		return restaurantOrders;
	}

	public void setResOrders(Restaurant resOrders) {
		this.restaurantOrders = resOrders;
	}
}
