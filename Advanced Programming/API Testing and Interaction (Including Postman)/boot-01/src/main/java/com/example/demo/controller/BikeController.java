package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;


@RestController
@RequestMapping("/bike")
public class BikeController {
	BikeService bikeService;
	
	public BikeController(BikeService bikeService) {
		super();
		this.bikeService=bikeService;
	}
	
	//create and store bike object
	@PostMapping
	public Bike createBike(@RequestBody Bike bike) {
		Bike bike1= bikeService.createBike(bike);
		return bike1;
	}
	
	//Read bike for specific id
	@GetMapping("{regNumber}")
	public Bike readBikeByRegNumber(@PathVariable String regNumber) {
		Bike b1 = bikeService.readBikeByRegNumber(regNumber);
		return b1;
	}
	
	//Read all the bikes
	@GetMapping
	public List<Bike> getAllBikes(){
		return bikeService.readAllBikes();
	}
	
	//Update the Bike
	@PutMapping
	public Bike updateBike(@RequestBody Bike bike) {
		return bikeService.updateBike(bike);
	}
	
	//Delete the Bike
	@DeleteMapping(value="{regNumber}")
	public String deleteBike(@PathVariable String regNumber) {
		return bikeService.deleteBikeByRegNumber(regNumber);
	}
	/*public SomeData getMethodName(@RequestParam String param) {
		return new SomeData();
	}*/
	
}
