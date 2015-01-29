package org.hms.service;

import java.util.List;

import org.hms.model.Country;
import org.hms.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoutryService {
	
	@Autowired
	private CountryRepository countryRepository;

	public List<Country> loadCountries() {
		return countryRepository.findAll();
	}
	
}
 