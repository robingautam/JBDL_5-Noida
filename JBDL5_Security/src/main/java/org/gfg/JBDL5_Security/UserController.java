package org.gfg.JBDL5_Security;

import org.gfg.JBDL5_Security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/create/user")
    public User createUser(@RequestBody CreateUserRequest createUserRequest){
        User user = new User();
        user.setUsername(createUserRequest.username);
        user.setRole(createUserRequest.getRole());
        user.setPassword(passwordEncoder.encode(createUserRequest.getPassword()));

        return userRepository.save(user);
    }
}
