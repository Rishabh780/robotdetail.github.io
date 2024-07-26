package com.robot.entitiy;

import jakarta.persistence.Entity;

@Entity
public class Robot {
	
	private String home;
	private String technology;
	private String applications;
	private String product;
	private String pricing;
	private String hardware;
	private String ModelZoo;
	private String contact;
	
	
	
	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getApplications() {
		return applications;
	}
	public void setApplications(String applications) {
		this.applications = applications;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPricing() {
		return pricing;
	}
	public void setPricing(String pricing) {
		this.pricing = pricing;
	}
	public String getHardware() {
		return hardware;
	}
	public void setHardware(String hardware) {
		this.hardware = hardware;
	}
	public String getModelZoo() {
		return ModelZoo;
	}
	public void setModelZoo(String modelZoo) {
		ModelZoo = modelZoo;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Robot [home=" + home + ", technology=" + technology + ", applications=" + applications + ", product="
				+ product + ", pricing=" + pricing + ", hardware=" + hardware + ", ModelZoo=" + ModelZoo + ", contact="
				+ contact + "]";
	}
	
	

}
