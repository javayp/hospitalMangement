package org.hms.service;

import org.hms.model.User;
import org.hms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void save(User user) {
		userRepository.save(user);
	}
}
