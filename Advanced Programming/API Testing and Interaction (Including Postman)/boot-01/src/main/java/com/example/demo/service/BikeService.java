package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bike;

public interface BikeService {
	Bike createBike(Bike bike);

	Bike readBikeByRegNumber(String regNumber);

	List<Bike> readAllBikes();
	
	Bike updateBike(Bike bike);
	
	String deleteBikeByRegNumber(String regNumber);
}
