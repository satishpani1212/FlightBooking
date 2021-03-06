package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Flight;
import com.demo.services.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService; // new FlightService();

	@GetMapping(value = "/flights", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}
	@GetMapping("flights/{id}")
	public Flight findById(@PathVariable int id) {
		return flightService.findById(id);
	}
	@PostMapping("/flights")
	public ResponseEntity<?> saveFlight(@RequestBody Flight b) {
		return new ResponseEntity<Flight>(flightService.saveFlight(b), HttpStatus.CREATED);
	}
	@PutMapping("/flights")
	public Flight updateFlight(@RequestBody Flight b) {
		return flightService.updateFlight(b);
	}
	@DeleteMapping("/flights/{id}")
	public boolean deleteFlight(@PathVariable int id) {
		return flightService.deleteFlight(id);
	}
}
