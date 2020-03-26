package net.honux.login;

import net.honux.login.web.User;
import net.honux.login.web.UserRepository;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class LoginApplicationTests {

	private Logger logger = LoggerFactory.getLogger(LoginApplicationTests.class);

	@Autowired
	private UserRepository userRepository;

	@Test
	void 로거_설정() {
		assertThat(logger).isNotNull();
		logger.debug("Logger Test OK");

	}

	@Test
	void 아이디로_사용자_찾기() {
		Optional<User> optionalUser = userRepository.findById(1L);
		assertThat(optionalUser.isPresent()).isTrue();
		logger.debug("Find user id 1: {}", optionalUser.get());
	}

	@Test
	void 사용자_추가_및_이메일로_찾기() {
		User user = new User();
		String email = "D@will.com";
		user.setEmail(email);
		userRepository.save(user);
		Optional<User> find = userRepository.findByEmail(email);
		assertThat(find.isPresent()).isTrue();
		logger.debug("Find user by email: {}", find.get());
	}

}
