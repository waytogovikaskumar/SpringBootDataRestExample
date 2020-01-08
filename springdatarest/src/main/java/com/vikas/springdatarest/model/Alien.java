package com.vikas.springdatarest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_alien")
public class Alien {

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int aid;
 
 private String aname;
 
 private String tech;

public int getAid() {
	return aid;
}

public void setAid(int aid) {
	this.aid = aid;
}

public String getAname() {
	return aname;
}

public void setAname(String aname) {
	this.aname = aname;
}

public String getTech() {
	return tech;
}

public void setTech(String tech) {
	this.tech = tech;
}

@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
}
	
}
