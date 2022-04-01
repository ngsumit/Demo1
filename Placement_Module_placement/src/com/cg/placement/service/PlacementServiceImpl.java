package com.cg.placement.service;

import com.cg.placement.entities.Placement;
import com.cg.placement.repository.IPlacementRepository;
import com.cg.placement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements IPlacementService 
{
     
	// Step 1: Establishing connection between Service and Repository
		private IPlacementRepository dao;
		
		public PlacementServiceImpl() 
		{
			dao = new PlacementRepositoryImpl();
		}
		
		// Step 2: Service calls to perform CRUD Operation
	
	@Override
	public Placement addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTrasaction();
		return placement;

	}

	@Override
	public Placement updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTrasaction();
	     return placement;
	}

	@Override
	public Placement searchCollegeByPlacementId(int id) {
		// TODO Auto-generated method stub
		Placement placement = dao.searchCollegeByPlacementId(id);
		return placement;

	}

	@Override
	public Placement deletePlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.deletePlacement(placement);
		dao.commitTrasaction();
		return placement;

	}

	@Override
	public Placement addQualification(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addQualification(placement);
		dao.commitTrasaction();
		return placement;

	}

}
