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

@Entity(name = "Users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "fullname")
	private String fullname;
	
	@Column(name = "create_date")
	private Date createDate;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Roles roles;
	
	@OneToMany(mappedBy = "usersRR")
	private List<RatingRestaurant> ListRatingRestaurant;
	
	@OneToMany(mappedBy = "usersRF")
	private List<RatingFood> ListRatingFood;
	
	@OneToMany(mappedBy = "usersOrders")
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}
}
