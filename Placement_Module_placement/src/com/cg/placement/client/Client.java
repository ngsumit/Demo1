package com.cg.placement.client;

import com.cg.placement.entities.Placement;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.PlacementServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		Placement placement = new Placement();
		
		IPlacementService service = new PlacementServiceImpl();
		/*
		// Create
		student.setId(102);
		student.setName("Akshay");
		student.setCollege("Pokhara University");
		student.setDate(49);
		student.setQualification("BE");
		student.setYear(2030);
		service.addPlacement();
		*/
		// Retrieve
		/*
		placement	= service.searchCollegeByPlacementId(100);
		System.out.println("ID is:"+student.getId());
		System.out.println("College is:"+student.getCollege());
		
		
		*/
		  
		//
		/*
		// Update
		placement	= service.searchCollegeByPlacementId(100);
		student.setCollege("Rive University");
		service.updatePlacement(placement);
		System.out.println("Update is successful");
		*/
		
		
		placement	= service.searchCollegeByPlacementId(101);
		service.deletePlacement(placement);
		System.out.println("Delete is successful");
		}


}
