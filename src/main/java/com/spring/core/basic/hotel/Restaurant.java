package com.spring.core.basic.hotel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Restaurant {

   //@Autowired // 필드 주입
    private final Chef chef;

    //@Autowired
/*    public Restaurant(Chef chef){ // 의존성 주입 (생성자 주입)
        this.chef = chef;
    }*/

/*    @Autowired
    public void setChef(Chef chef){ // 수정자 주입 (setter 주입)
        this.chef = chef;
    }*/

    // 저녁 식사 주문 가능
    public void orderDinner(){
        System.out.println("저녁 식사를 주문합니다.");
        chef.cook();
    }

}
