package com.springtuto.repository;

import java.util.List;

import com.springtuto.model.CarManufacturer;

public interface CarManufacturerRepository {

	List<CarManufacturer> findAllManufacturers();

}