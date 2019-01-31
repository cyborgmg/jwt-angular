package br.com.jwtangular.service;

import java.util.List;

import org.springframework.data.domain.Page;

import br.com.jwtangular.entity.User;
import br.com.jwtangular.enums.ProfileEnum;


public interface UserService {
	
	User findByEmail(String email);
	/*
	User createOrUpdate(User user);
	
	User findById(Long id);
	
	void delete(Long id);
	
	Page<User> findAll(int page, int count);

	List<User> findUserParams(String email, ProfileEnum profile);
*/
}
