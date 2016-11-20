package com.service;

import java.util.List;

import com.model.Address;



public interface AddressService {

	public List<Address> getDistinctStates()throws Exception;
	
}
