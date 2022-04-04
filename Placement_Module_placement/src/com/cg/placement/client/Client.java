package com.cg.placement.client;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICollegeService;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.PlacementServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		Placement placement = new Placement();
		College college = new College();
		
		IPlacementService service = new PlacementServiceImpl();
		ICollegeService cservice = new CollegeServiceImpl();
		// Create
		placement.setId(102);
		placement.setName("Akshay");
		placement.setDate(49);
		placement.setQualification("BE");
		placement.setYear(2030);
		service.addPlacement(placement);
		
		college.setId(1);
		college.setCollegeName("ABCD");
		college.setLocation("Karnataka");
		cservice.addCollege(college);
		
		
		college.setCollegeAdmin("Akshay");
		
		
		// Retrieve
		/*
		placement	= service.searchPlacement(100);
		System.out.println("ID is:"+placement.getId());
		System.out.println("College is:"+placement.getCollege());
		*/
		
		
		  /*
	     // Update
		placement	= service.searchPlacement(100);
		placement.setCollege("Rive University");
		service.updatePlacement(placement);
		System.out.println("Update is successful");
	    */
		
		/*
		placement	= service.searchPlacement(101);
		service.cancelPlacement(15);
		System.out.println("Cancel is successful");
		*/
		}


}
