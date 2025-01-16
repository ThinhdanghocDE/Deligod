package com.Project.Osahaneat.Entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "food")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "time_ship")
	private String timeShip;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "cate_id")
	private Category categoryFood;

	@OneToMany(mappedBy = "foodRF")
	private List<RatingFood> ListRatingFood;
	
	@OneToMany(mappedBy = "foodOI")
	private List<OrdersItem> ListOrdersItem;
	
	public List<OrdersItem> getListOrdersItem() {
		return ListOrdersItem;
	}
	public void setListOrdersItem(List<OrdersItem> listOrdersItem) {
		ListOrdersItem = listOrdersItem;
	}

	public List<RatingFood> getListRatingFood() {
		return ListRatingFood;
	}

	public void setListRatingFood(List<RatingFood> listRatingFood) {
		ListRatingFood = listRatingFood;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTimeShip() {
		return timeShip;
	}

	public void setTimeShip(String timeShip) {
		this.timeShip = timeShip;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Category getCategoryFood() {
		return categoryFood;
	}

	public void setCategoryFood(Category categoryFood) {
		this.categoryFood = categoryFood;
	}
}
