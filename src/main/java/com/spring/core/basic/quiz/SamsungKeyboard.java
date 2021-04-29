package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component("skb") // 빈이름 설정 가능, 설정하지 않으면 클래스명의 카멜케이스
public class SamsungKeyboard implements Keyboard{

    @Override
    public void info() {
        System.out.println("삼성 키보드!");
    }
}
