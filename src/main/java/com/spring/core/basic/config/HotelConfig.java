package com.spring.core.basic.config;

import com.spring.core.basic.hotel.Chef;
import com.spring.core.basic.hotel.Hotel;
import com.spring.core.basic.hotel.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HotelConfig {

/*    // 생성자 주입
    @Bean
    public Chef chef(){
        return new Chef();
    }

    // 생성자 주입
    @Bean
    public Restaurant restaurant(){
        return new Restaurant(chef());
    }

    // 생성자 주입
    @Bean
    public Hotel hotel(){
        return new Hotel(restaurant());
    }*/
    

/*    // setter 주입
    @Bean
    public Restaurant restaurant(){
        Restaurant restaurant  = new Restaurant();
        restaurant.setChef(chef());
        return  restaurant;
    }

    // setter 주입
    @Bean
    public Hotel hotel(){
        Hotel hotel =  new Hotel();
        hotel.setRestaurant(restaurant());
        return hotel;
    }*/



}
