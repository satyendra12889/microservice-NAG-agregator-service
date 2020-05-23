package com.satyendra.nagarro.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorController {
	
	@Autowired
	IAgregatorService aggService;
	
	@GetMapping("agg/{id}")
	public ResponseEntity<OrderDetailDto> getOrderDetail(@PathVariable("id")int id){
		return new ResponseEntity<OrderDetailDto>(aggService.getOrderDetails(id), HttpStatus.OK );
	}

}
