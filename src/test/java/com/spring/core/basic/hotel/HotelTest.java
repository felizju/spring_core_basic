package com.spring.core.basic.hotel;

import com.spring.core.basic.config.HotelAutoConfig;
import com.spring.core.basic.config.HotelConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void hotelTest(){ // spring : AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(HotelConfig.class);

        Hotel hotel = context.getBean(Hotel.class);
        hotel.reserveRestaurant();
    }

    @Test
    void hotelTest2(){ // xml : GenericXmlApplicationContext
        ApplicationContext context = new GenericXmlApplicationContext("hotelConfig.xml");

        Hotel hotel = context.getBean(Hotel.class);
        hotel.reserveRestaurant();
    }

    @Test
    void hotelTest3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HotelAutoConfig.class);

        Hotel hotel = context.getBean(Hotel.class);
        hotel.reserveRestaurant();
    }

}