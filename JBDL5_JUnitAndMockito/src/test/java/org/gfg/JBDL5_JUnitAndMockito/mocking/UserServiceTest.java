package org.gfg.JBDL5_JUnitAndMockito.mocking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

   /* @Spy
    UserService userService;*/

    @InjectMocks
    UserService userService;


    @Mock
    UserRepository userRepository;

    @Test
    void returnFirstNameCharacter() {
        // defining the stubing
    /*    when(userService.getUser()).thenReturn(new User(1,"Robin","robin@gmail.com"));
        char ch = userService.returnFirstNameCharacter(1);
        Assertions.assertEquals('R', ch);*/

        when(userRepository.findUserById(anyInt())).thenReturn(new User(1,"Robin","robin@gmail.com"));
        char ch  = userService.returnFirstNameCharacter(2);
        Assertions.assertEquals('R', ch);
    }
}