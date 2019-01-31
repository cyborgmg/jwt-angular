package br.com.jwtangular;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.jwtangular.entity.User;
import br.com.jwtangular.enums.ProfileEnum;
import br.com.jwtangular.repository.UserRepository;

@SpringBootApplication
public class JwtAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAngularApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
				initUsers(userRepository, passwordEncoder);
			};
	}
	
	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		
		List<User> users = Arrays.asList(
					new User(1L,"user1@gmail.com", passwordEncoder.encode("123456"), ProfileEnum.ROLE_ADMIN),
					new User(2L,"user2@gmail.com", passwordEncoder.encode("123456"), ProfileEnum.ROLE_ADMIN),
					new User(3L,"user3@gmail.com", passwordEncoder.encode("123456"), ProfileEnum.ROLE_ADMIN)
				);
		userRepository.saveAll(users);
	}

}

