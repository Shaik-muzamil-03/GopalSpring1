package com.mvn.OnlineSportsAccessoriesStore.entity;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "User")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int userId;
	private String Username;
	private String Password;
	private String role;
	private long DebitCardNo;
	private int TotalPurchase;

	
	@Embedded
	@Column(nullable = true)
	private UserDetails userDeatils;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Orders order;
	
	





	public User() {
		super();
		// TODO Auto-generated constructor stub
	}







	public User(int userId, String username, String password, String role, long debitCardNo, int totalPurchase,
			UserDetails userDeatils, Orders order) {
		super();
		this.userId = userId;
		Username = username;
		Password = password;
		this.role = role;
		DebitCardNo = debitCardNo;
		TotalPurchase = totalPurchase;
		this.userDeatils = userDeatils;
		this.order = order;
	}







	public int getUserId() {
		return userId;
	}







	public void setUserId(int userId) {
		this.userId = userId;
	}







	public String getUsername() {
		return Username;
	}







	public void setUsername(String username) {
		Username = username;
	}







	public String getPassword() {
		return Password;
	}







	public void setPassword(String password) {
		Password = password;
	}







	public String getRole() {
		return role;
	}







	public void setRole(String role) {
		this.role = role;
	}







	public long getDebitCardNo() {
		return DebitCardNo;
	}







	public void setDebitCardNo(long debitCardNo) {
		DebitCardNo = debitCardNo;
	}







	public int getTotalPurchase() {
		return TotalPurchase;
	}







	public void setTotalPurchase(int totalPurchase) {
		TotalPurchase = totalPurchase;
	}







	public UserDetails getUserDeatils() {
		return userDeatils;
	}







	public void setUserDeatils(UserDetails userDeatils) {
		this.userDeatils = userDeatils;
	}







	public Orders getOrder() {
		return order;
	}







	public void setOrder(Orders order) {
		this.order = order;
	}







	@Override
	public int hashCode() {
		return Objects.hash(DebitCardNo, Password, TotalPurchase, Username, order, role, userDeatils, userId);
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return DebitCardNo == other.DebitCardNo && Objects.equals(Password, other.Password)
				&& TotalPurchase == other.TotalPurchase && Objects.equals(Username, other.Username)
				&& Objects.equals(order, other.order) && Objects.equals(role, other.role)
				&& Objects.equals(userDeatils, other.userDeatils) && userId == other.userId;
	}







	@Override
	public String toString() {
		return "User [userId=" + userId + ", Username=" + Username + ", Password=" + Password + ", role=" + role
				+ ", DebitCardNo=" + DebitCardNo + ", TotalPurchase=" + TotalPurchase + ", userDeatils=" + userDeatils
				+ ", order=" + order + "]";
	}







	



	
}

	