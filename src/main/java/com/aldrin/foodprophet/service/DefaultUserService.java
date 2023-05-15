package com.aldrin.foodprophet.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.aldrin.foodprophet.dto.UserRegisteredDTO;
import com.aldrin.foodprophet.model.User;


public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);




	
}
