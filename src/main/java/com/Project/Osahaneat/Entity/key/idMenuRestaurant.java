package com.Project.Osahaneat.Entity.key;

import java.io.Serializable;

import jakarta.persistence.Column;


public class idMenuRestaurant implements Serializable{

	private int cateId;
	private int resId;
	
	public idMenuRestaurant() {}
	
	public idMenuRestaurant(int cateId, int resId) {
		this.cateId = cateId;
		this.resId = resId;
	}

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
}
