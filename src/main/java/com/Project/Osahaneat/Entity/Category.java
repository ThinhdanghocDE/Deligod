package com.Project.Osahaneat.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name_cate")
	private String nameCate;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@OneToMany(mappedBy = "categoryFood")
	private List<Food> ListFood;

	@OneToMany(mappedBy = "categoryMR")
	private List<MenuRestaurant> listMenuRestaurants;
	
	public List<MenuRestaurant> getListMenuRestaurants() {
		return listMenuRestaurants;
	}

	public void setListMenuRestaurants(List<MenuRestaurant> listMenuRestaurants) {
		this.listMenuRestaurants = listMenuRestaurants;
	}

	public List<Food> getListFood() {
		return ListFood;
	}

	public void setListFood(List<Food> listFood) {
		ListFood = listFood;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCate() {
		return nameCate;
	}

	public void setNameCate(String nameCate) {
		this.nameCate = nameCate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}	
}
