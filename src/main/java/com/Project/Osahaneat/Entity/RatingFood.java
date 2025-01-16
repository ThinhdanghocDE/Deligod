package com.Project.Osahaneat.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "ratingfood")
public class RatingFood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "rate_point")
	private String ratePoint;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users usersRF;
	
	@ManyToOne
	@JoinColumn(name = "food_id")
	private Food foodRF;

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

	public String getRatePoint() {
		return ratePoint;
	}

	public void setRatePoint(String ratePoint) {
		this.ratePoint = ratePoint;
	}

	public Users getUsersRF() {
		return usersRF;
	}

	public void setUsersRF(Users usersRF) {
		this.usersRF = usersRF;
	}

	public Food getFoodRF() {
		return foodRF;
	}

	public void setFoodRF(Food foodRF) {
		this.foodRF = foodRF;
	}
}
