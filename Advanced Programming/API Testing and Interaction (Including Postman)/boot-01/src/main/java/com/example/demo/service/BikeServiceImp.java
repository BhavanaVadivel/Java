package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;
@Service
public class BikeServiceImp implements BikeService{

	
	BikeRepository bikeRepository;
	
	public BikeServiceImp(BikeRepository bikeRepository) {
		super();
		this.bikeRepository = bikeRepository;
	}
	
	@Override
	public Bike createBike(Bike bike) {
		// TODO Auto-generated method stub
		Bike b1= bikeRepository.save(bike);
		return b1;
	}

	@Override
	public Bike readBikeByRegNumber(String regNumber) {
		// TODO Auto-generated method stub
		Bike b1 = bikeRepository.findById(regNumber).get();
		return b1;
	}

	@Override
	public List<Bike> readAllBikes() {
		// TODO Auto-generated method stub
		return bikeRepository.findAll();
	}

	@Override
	public Bike updateBike(Bike bike) {
		// TODO Auto-generated method stub
		return bikeRepository.save(bike);
	}

	@Override
	public String deleteBikeByRegNumber(String regNumber) {
		// TODO Auto-generated method stub
		bikeRepository.deleteById(regNumber);
		return "Bike with the registration number "+regNumber+" has been deleted";
	}

}
