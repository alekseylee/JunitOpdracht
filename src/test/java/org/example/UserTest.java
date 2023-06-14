package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    @BeforeEach
    void setup(){
        user = new User();
    }

    @ParameterizedTest
    @CsvSource(value = {"John, 23", "Anne, 18", "Jack, 55"})
    void shouldReturnEqualsWhenUserIsCreated(String name, int age){
        user.setName(name);
        user.setAge(age);


        assertAll(
                () -> assertEquals(name,user.getName()),
                () -> assertEquals(age, user.getAge())
                );

    }

}