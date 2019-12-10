package com.offcn.pojo;

import java.util.Date;

public class Hospital {
	private Integer id;  
	  
	private String hospitalOn;  
	  
	private String province;  
	  
    private String city;  
	  
	private String title;
	
	private Date  buildDate;
	
    private double money;
    
    private double percent;//�ٷֱ�

    
    
	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHospitalOn() {
		return hospitalOn;
	}

	public void setHospitalOn(String hospitalOn) {
		this.hospitalOn = hospitalOn;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", hospitalOn=" + hospitalOn + ", province=" + province + ", city=" + city
				+ ", title=" + title + ", buildDate=" + buildDate + ", money=" + money + ", percent=" + percent + "]";
	}
	
	
	
}
