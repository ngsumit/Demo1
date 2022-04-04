package com.cg.placement.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="college")
public class College extends Placement {
 
	@Id
	private int Id; 
	private String collegeAdmin; 
	private String collegeName;
	private String location;
	
	@OneToMany(mappedBy="college",cascade=CascadeType.ALL)
	private Set<Placement> college = new HashSet<>();		//Initialization required to avoid NullPointerException
	
	public int getId() {
		return Id;
	}
	public String getCollegeAdmin() {
		return collegeAdmin;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
