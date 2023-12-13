package com.rental.beans;

public class BikeBeans {

	/*
	 * @author : ARUN
	 * @Date : 11-12-2023
	 * @Version : 1.0
	 * @Purpose : Bean / Model for bike table
	 */
	
	private int bikeId;
	private String brand;
	private String model;
	private String regno;
	private Float rent;
	private String avalaibility;
	private String image;
	

	public BikeBeans(int bikeId, String brand, String model, String regno, Float rent, String avalaibility, String image) {
		this.bikeId = bikeId;
		this.brand = brand;
		this.model = model;
		this.regno = regno;
		this.rent = rent;
		this.avalaibility = avalaibility;
		this.image = image;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public Float getRent() {
		return rent;
	}
	public void setRent(Float rent) {
		this.rent = rent;
	}
	public String getAvalaibility() {
		return avalaibility;
	}
	public void setAvalaibility(String avalaibility) {
		this.avalaibility = avalaibility;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
