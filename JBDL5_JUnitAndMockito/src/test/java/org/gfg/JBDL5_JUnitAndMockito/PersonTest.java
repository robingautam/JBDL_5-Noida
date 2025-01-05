package org.gfg.JBDL5_JUnitAndMockito;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonTest {
    Person person = null;

    @Autowired
    TestController testController;

    @Test
    void eat() {

        String result = person.eat();
        Assertions.assertEquals("person is eating", result);
        System.out.println("Inside the eat test method");
    }

    @Test
    @Disabled
    void eat2() {

        Person person = new Person();
        String result = person.eat();
        Assertions.assertEquals("person is eating", result);
        System.out.println("Inside the eat test method 2");

    }


    @BeforeEach
    public void beforeEachMethodTest(){
        person = new Person();
        System.out.println("Before Each Method");
    }

    @AfterEach
    public void afterEachMethodTest(){
        person = new Person();
        System.out.println("After Each Method");
    }


    @Test
    void checkTestController(){
        String result = testController.getTestData();
        Assertions.assertEquals("Test Data",result);
    }
}