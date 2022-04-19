package com.sapiens.springboot.springsecurity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String emailId;

	@Column
	private int age;

	@Column
	private String mobileNumber;

	@Column
	private String gender;

	@Column
	private Boolean consumeTobaco;

	@Column
	private double annualIncome;

	@Column
	private double lifeCoverAmount;

	@Column
	private int lifeCoverUptoAge;

	@Column
	private String insuranceType;

	@Column
	private String client;

	public Policy() {
	}

	public Policy(Long id, String firstName, String lastName, String emailId, int age, String mobileNumber,
			String gender, Boolean consumeTobaco, double annualIncome, double lifeCoverAmount, int lifeCoverUptoAge,
			String insuranceType, String client) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.consumeTobaco = consumeTobaco;
		this.annualIncome = annualIncome;
		this.lifeCoverAmount = lifeCoverAmount;
		this.lifeCoverUptoAge = lifeCoverUptoAge;
		this.insuranceType = insuranceType;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getConsumeTobaco() {
		return consumeTobaco;
	}

	public void setConsumeTobaco(Boolean consumeTobaco) {
		this.consumeTobaco = consumeTobaco;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getLifeCoverAmount() {
		return lifeCoverAmount;
	}

	public void setLifeCoverAmount(double lifeCoverAmount) {
		this.lifeCoverAmount = lifeCoverAmount;
	}

	public int getLifeCoverUptoAge() {
		return lifeCoverUptoAge;
	}

	public void setLifeCoverUptoAge(int lifeCoverUptoAge) {
		this.lifeCoverUptoAge = lifeCoverUptoAge;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Policy [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", age=" + age + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", consumeTobaco="
				+ consumeTobaco + ", annualIncome=" + annualIncome + ", lifeCoverAmount=" + lifeCoverAmount
				+ ", lifeCoverUptoAge=" + lifeCoverUptoAge + ", insuranceType=" + insuranceType + ", client=" + client
				+ "]";
	}
}
