package com.springtuto.service;

import java.util.List;

import com.springtuto.model.CarManufacturer;
import com.springtuto.repository.CarManufacturerRepository;

public class CarManufacturerServiceImpl implements CarManufacturerService {

	private CarManufacturerRepository manufacturer;

	/* (non-Javadoc)
	 * @see com.springtuto.service.CarManufacturerService#findAllManufacturers()
	 */
	@Override
	public List<CarManufacturer> findAllManufacturers() {

		return manufacturer.findAllManufacturers();
	}

	public void setManufacturer(CarManufacturerRepository manufacturer) {
		this.manufacturer = manufacturer;
	}

}
