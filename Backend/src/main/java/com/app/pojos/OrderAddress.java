package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//address_id 	flat_no	society_name	area	city	pincode	state	user_id / customer_id
@Entity
@Table(name = "OrderAddress")
public class OrderAddress extends BaseEntity{
	private int flatNo;
	@Column(length = 20)
	private String societyName;
	@Column(length = 20)
	private String area;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length = 20)
	private String pinCode;
	
	private int userId;
	private int orderId;


	public OrderAddress() {
		System.out.println("in address ctor"+getClass().getName());
	}


	public OrderAddress(int flatNo, String societyName, String area, String city, String state, String pinCode,
			int userId, int orderId) {
		super();
		this.flatNo = flatNo;
		this.societyName = societyName;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.userId = userId;
		this.orderId = orderId;
	}


	public int getFlatNo() {
		return flatNo;
	}


	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}


	public String getSocietyName() {
		return societyName;
	}


	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	@Override
	public String toString() {
		return "OrderAddress [flatNo=" + flatNo + ", societyName=" + societyName + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + ", userId=" + userId + ", orderId=" + orderId + "]";
	}

}