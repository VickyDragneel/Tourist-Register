package com.travel.Tuorist.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TouristDetails")
public class TuoristModel {
	@Id
	private int id;
	private String FName;
	private String LName;
	private String Gender;
	private String Source;	
	private int age;
	private int DaysOfVisit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public int getDaysOfVisit() {
		return DaysOfVisit;
	}
	public void setDaysOfVisit(int daysOfVisit) {
		DaysOfVisit = daysOfVisit;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public TuoristModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TuoristModel(int id, String fName, String lName, String gender, String source, int age, int daysOfVisit) {
		super();
		this.id = id;
		FName = fName;
		LName = lName;
		Gender = gender;
		Source = source;
		this.age = age;
		DaysOfVisit = daysOfVisit;
	}
	
	
	

}
