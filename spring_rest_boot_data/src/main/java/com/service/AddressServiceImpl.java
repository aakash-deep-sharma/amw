package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Address;
import com.model.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public List<Address> getDistinctStates() throws Exception {
		List<Address> list =addressRepository.findDistinctState();
		System.out.println("hello "+list);
		/*List<String> stateList = new ArrayList<>();
		for (Address addr : list) {
			stateList.add(addr.getState());
		}*/
		return list;
	}

}
