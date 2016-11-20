package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Address;
import com.service.AddressService;

@Controller
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@RequestMapping(value="/getStates")
	public List<Address> createEmployee(HttpServletResponse response)
	{
		try {
			
			return addressService.getDistinctStates();
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(500);
			return null;
		}
		
	}
	
}
