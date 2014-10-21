package aa.abra.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aa.abra.jba.entity.User;
import aa.abra.jba.repository.UserRepository;

@Service

public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}		
}
