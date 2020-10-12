package com.eureka.auth.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users")
public class Users implements Serializable {
	private static final long serialVersionUID = -2054386655979281969L;

	public static final String ROLE_ADMIN = "ROLE_ADMIN";
	public static final String ROLE_STUDENT = "ROLE_STUDENT";
	public static final String ROLE_PARENT = "ROLE_PARENT";
	public static final String ROLE_LECTURERS = "ROLE_LECTURERS";
	public static final String ROLE_STAFF = "ROLE_STAFF";

	@Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

	@Column(name = "user_name", length = 20, nullable = false)
	private String userName;

	@Column(name = "encryted_password", length = 128, nullable = false)
	private String encrytedPassword;

	@Column(name = "role", nullable = false)
	private String role;
	/*
	 * @Column(name = "user_type", nullable = false) private int userType;
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "expire_time") private Date expireTime;
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "created_date") private Date created_date;
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "last_login") private Date last_login;
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	/*
	 * public int getUserType() { return userType; }
	 * 
	 * public void setUserType(int userType) { this.userType = userType; }
	 * 
	 * public Date getExpireTime() { return expireTime; }
	 * 
	 * public void setExpireTime(Date expireTime) { this.expireTime = expireTime; }
	 * 
	 * public Date getCreated_date() { return created_date; }
	 * 
	 * public void setCreated_date(Date created_date) { this.created_date =
	 * created_date; }
	 * 
	 * public Date getLast_login() { return last_login; }
	 * 
	 * public void setLast_login(Date last_login) { this.last_login = last_login; }
	 * 
	 * @Override public String toString() { return "Users [id=" + id + ", userName="
	 * + userName + ", encrytedPassword=" + encrytedPassword + ", role=" + role +
	 * ", userType=" + userType + ", expireTime=" + expireTime + ", created_date=" +
	 * created_date + ", last_login=" + last_login + "]"; }
	 */
	
}
