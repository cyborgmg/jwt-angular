package br.com.jwtangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jwtangular.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
	
}
