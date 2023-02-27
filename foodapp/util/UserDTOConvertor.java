package com.nv.foodapp.util;

import org.springframework.stereotype.Component;

import com.nv.foodapp.dto.UserDTO;
import com.nv.foodapp.entity.User;
import com.nv.foodapp.entity.Address;

@Component
public class UserDTOConvertor {
	public UserDTO convertTo(User user) {
      
		String address=user.getAddress().getBuildingName()+","+user.getAddress().getCity()+","+user.getAddress().getState()+","+user.getAddress().getPincode();
		UserDTO obj= new UserDTO(user.getUserId(), user.getFirstName(), user.getLastName(), user.getPhoneNumber(),address,user.getEmailId(),
				user.getUserRole());
		
		return obj;
	}
	
}
