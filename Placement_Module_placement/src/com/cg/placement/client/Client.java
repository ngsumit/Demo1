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
		
		// Create
		placement.setId(102);
		placement.setName("Akshay");
		placement.setCollege("Pokhara University");
		placement.setDate(49);
		placement.setQualification("BE");
		placement.setYear(2030);
		placement.addPlacement();
		
		// Retrieve
		
		placement	= service.searchPlacement(100);
		System.out.println("ID is:"+placement.getId());
		System.out.println("College is:"+placement.getCollege());
		
		
		
		  
		//
		
		// Update
		placement	= service.searchPlacement(100);
		placement.setCollege("Rive University");
		service.updatePlacement(placement);
		System.out.println("Update is successful");
	
		
		
		placement	= service.searchPlacement(101);
		service.deletePlacement(placement);
		System.out.println("Delete is successful");
		}


}
