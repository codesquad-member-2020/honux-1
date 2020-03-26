package net.honux.login.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public User hello() {
        return userRepository.findById(1L).get();
    }
}
