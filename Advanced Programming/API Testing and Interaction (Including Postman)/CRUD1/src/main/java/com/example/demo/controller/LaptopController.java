package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

	Laptop laptop;

	@GetMapping(value = "{sNo}")
	public Laptop readLaptop(@PathVariable String sNo) {
		return laptop;
	}

	@PostMapping()
	public String createLaptop(@RequestBody Laptop laptop) {
		this.laptop = laptop;
		return "Laptop Created Successfully";
	}

	@PutMapping
	public String updateLaptop(@RequestBody Laptop laptop) {
		this.laptop = laptop;
		return "Laptop Updated Successfully";
	}

	@DeleteMapping(value="{sNo}")
	public String deleteLaptop(@PathVariable String sNo) {
		// return new Laptop(sNo,"dell",23489.98);
		laptop = null;
		return "Laptop Deleted Successfully";
	}
}
