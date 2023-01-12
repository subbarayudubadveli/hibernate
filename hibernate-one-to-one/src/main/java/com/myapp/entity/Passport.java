package com.myapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passport_id")
	private int passportId;

	@Column(name = "passport_number")
	private String passportNumber;

	@OneToOne(cascade = CascadeType.ALL,
			mappedBy = "passport")
	private Student student;

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

//	@Override
//	public String toString() {
//		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", student=" + student
//				+ "]";
//	}

}
