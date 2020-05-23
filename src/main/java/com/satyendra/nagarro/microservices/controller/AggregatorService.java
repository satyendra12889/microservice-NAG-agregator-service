package com.satyendra.nagarro.microservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AggregatorService implements IAgregatorService{
	
	@Autowired
	RestTemplate rtemplate;

	@Override
	public OrderDetailDto getOrderDetails(int id) {
		// TODO Auto-generated method stub
		HttpEntity<String> entity  = new HttpEntity<String>("");
		User res = rtemplate.getForObject("http://userservice-service/user/{q}", User.class, id);
		 Order[] allorder  =  rtemplate.getForObject("http://orderservice-service/order/{q}", Order[].class, res.id);
		
		 ArrayList<OrderDto> orders  = new ArrayList<>();
		 OrderDetailDto rtn = new OrderDetailDto();
		
		 rtn.userDetails = new UserDto(res);
		 rtn.orders = orders;
		 for (int i = 0; i < allorder.length; i++) {
			OrderDto odto = new OrderDto(allorder[i]);
			orders.add(odto);
		}
		 
		
		return rtn;
	}
	
	

}
