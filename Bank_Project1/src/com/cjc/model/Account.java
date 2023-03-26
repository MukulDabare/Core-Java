package com.cjc.model;

public class Account {
	
	private int accountNumber;
	private String accountHolderName;
	private long mobileNumber;
	private long adharNumber;
	private String gender;
	private static double accountBalance;
	private String cityName;
	private int age;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public static double getAccountBalance() {
		return accountBalance;
	}
	public static void setAccountBalance(double accountBalance) {
		Account.accountBalance = accountBalance;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
