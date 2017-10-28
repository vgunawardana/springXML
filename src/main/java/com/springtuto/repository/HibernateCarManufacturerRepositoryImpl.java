package com.springtuto.repository;

import java.util.ArrayList;
import java.util.List;

import com.springtuto.model.CarManufacturer;

public class HibernateCarManufacturerRepositoryImpl implements CarManufacturerRepository {
	
	/* (non-Javadoc)
	 * @see com.springtuto.repository.CarManufacturerRepository#findAllManufacturers()
	 */
	@Override
	public List<CarManufacturer> findAllManufacturers(){
		List<CarManufacturer> manufacturers = new ArrayList<>();
		
		CarManufacturer manufacturer = new CarManufacturer();
		manufacturer.setBrandName("BMW");
		manufacturer.setHeadquarters("Munich, Bavaria");
		
		manufacturers.add(manufacturer);
		
		return manufacturers;
	}

}
