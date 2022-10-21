//package com.training.springboot.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="User1")
//public class User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="user_id")
//	private int userId;
//	
//	@Column(name="user_name")
//	private String userName;
//	
//	private String password;
//
//	public User() {
//		
//	}
//	
//
//	public User(String userName, String password) {
//		super();
//		this.userName = userName;
//		this.password = password;
//	}
//
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//}
