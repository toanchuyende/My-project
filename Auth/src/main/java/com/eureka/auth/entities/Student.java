package com.eureka.auth.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Student implements Serializable {
	private static final long serialVersionUID = -1000119078147252957L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "student_code", nullable = false)
	private int studentCode;

	@Column(name = "student_name", length = 128, nullable = false)
	private String studentName;

	@Column(name = "student_class", length = 45, nullable = true)
	private String studentClass;

	@Column(name = "student_address", length = 128, nullable = true)
	private String studentAddress;

	@Column(name = "student_phone", length = 20, nullable = true)
	private String studentPhone;

	@Column(name = "student_mail", length = 128, nullable = true)
	private String studentMail;

	@Column(name = "user_id", nullable = false)
	private String userId;
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "id", nullable = false) private Users user;
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentMail() {
		return studentMail;
	}

	public void setStudentMail(String studentMail) {
		this.studentMail = studentMail;
	}

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}

}
