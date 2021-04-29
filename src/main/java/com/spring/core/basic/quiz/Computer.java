package com.spring.core.basic.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private final Keyboard keyboard;
    private final Mouse mouse;
    private final Monitor monitor;

    // 마우스, 모니터 두가지일 때, 생성자에서 @Qualifier(빈이름)으로 둘 중 하나를 선택해준다.
    @Autowired
    public Computer(@Qualifier("skb") Keyboard keyboard, @Qualifier("lgMouse") Mouse mouse, @Qualifier("appleMonitor") Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public void info(){
        keyboard.info();
        monitor.info();
        mouse.info();
    }
}
