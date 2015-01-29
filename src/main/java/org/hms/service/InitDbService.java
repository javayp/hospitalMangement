package org.hms.service;

import javax.annotation.PostConstruct;

import org.hms.model.Country;
import org.hms.model.User;
import org.hms.repositories.CountryRepository;
import org.hms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@PostConstruct
	public void initDb(){
		User user=new User();
		user.setName("prashanth");
		user.setEmail("prashanth.yp89@gmail.com");
		user.setPassword("password");
		userRepository.save(user);
		
		Country country=new Country();
		country.setName("india");
		countryRepository.save(country);
	}
}
