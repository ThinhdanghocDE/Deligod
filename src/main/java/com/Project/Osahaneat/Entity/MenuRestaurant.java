package com.Project.Osahaneat.Entity;

import java.util.Date;

import com.Project.Osahaneat.Entity.key.idMenuRestaurant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "menurestaurant")
@IdClass(idMenuRestaurant.class)
public class MenuRestaurant {
	@Id
	@Column(name = "cate_id", insertable = false, updatable = false)
	private int cateId;
	
	@Id
	@Column(name = "res_id", insertable = false, updatable = false)
	private int resId;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name = "cate_id", insertable = false, updatable = false)
	private Category categoryMR;
	
	@ManyToOne
	@JoinColumn(name = "res_id", insertable = false, updatable = false)
	private Restaurant RestaurantMR;

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Category getCategoryMR() {
		return categoryMR;
	}

	public void setCategoryMR(Category categoryMR) {
		this.categoryMR = categoryMR;
	}

	public Restaurant getRestaurantMR() {
		return RestaurantMR;
	}

	public void setRestaurantMR(Restaurant restaurantMR) {
		RestaurantMR = restaurantMR;
	}
}
