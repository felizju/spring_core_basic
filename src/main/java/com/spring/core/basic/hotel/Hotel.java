package com.spring.core.basic.hotel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Hotel {

    //@Autowired // 필드 주입
    private final Restaurant restaurant;

    //@Autowired
/*    public Hotel(Restaurant restaurant){ // 의존성 주입 (생성자 주입)
        this.restaurant = restaurant;
    }*/

/*    @Autowired
    public void setRestaurant(Restaurant restaurant){ // 수정자 주입 (setter 주입)
        this.restaurant = restaurant;
    }*/

    // 레스토랑 예약 기능
    public void reserveRestaurant(){
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();
    }

}
