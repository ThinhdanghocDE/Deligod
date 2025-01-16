package com.Project.Osahaneat.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "restaurant")
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "subtitle")
	private String subtitle;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "is_freeship")
	private int isFreeship;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "open_date")
	private Date openDate;

	@OneToMany(mappedBy = "RestaurantMR")
	private List<MenuRestaurant> ListMenuRestaurant;
	
	@OneToMany(mappedBy = "restaurantPromo")
	private List<Promo> ListPromo;
	
	@OneToMany(mappedBy = "restaurantRR")
	private List<RatingRestaurant> ListRatingRestaurant;
	
	@OneToMany(mappedBy = "restaurantOrders")
	private List<Orders> ListOrders;
	
	
	public List<Orders> getListOrders() {
		return ListOrders;
	}

	public void setListOrders(List<Orders> listOrders) {
		ListOrders = listOrders;
	}

	public List<RatingRestaurant> getListRatingRestaurant() {
		return ListRatingRestaurant;
	}

	public void setListRatingRestaurant(List<RatingRestaurant> listRatingRestaurant) {
		ListRatingRestaurant = listRatingRestaurant;
	}

	public List<Promo> getListPromo() {
		return ListPromo;
	}

	public void setListPromo(List<Promo> listPromo) {
		ListPromo = listPromo;
	}

	public List<MenuRestaurant> getListMenuRestaurant() {
		return ListMenuRestaurant;
	}

	public void setListMenuRestaurant(List<MenuRestaurant> listMenuRestaurant) {
		this.ListMenuRestaurant = listMenuRestaurant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getIsFreeship() {
		return isFreeship;
	}

	public void setIsFreeship(int isFreeship) {
		this.isFreeship = isFreeship;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
}
