package com.Project.Osahaneat.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "ratingrestaurant")
public class RatingRestaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "rate_point")
	private int ratePoint;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users usersRR;
	
	@ManyToOne
	@JoinColumn(name = "res_id")
	private Restaurant restaurantRR;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getRatePoint() {
		return ratePoint;
	}

	public void setRatePoint(int ratePoint) {
		this.ratePoint = ratePoint;
	}

	public Users getUsers() {
		return usersRR;
	}

	public void setUsers(Users users) {
		this.usersRR = users;
	}

	public Restaurant getRestaurant() {
		return restaurantRR;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurantRR = restaurant;
	}
}
