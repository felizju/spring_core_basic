package com.spring.core.basic.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void personTest(){

        Person kim = Person.getInstance();
        Person park = Person.getInstance();

        System.out.println(kim); // 주소값 같음
        System.out.println(park); // 주소값 같음
    }

}