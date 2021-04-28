package com.spring.core.basic.printer;

import com.spring.core.basic.config.PrintConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    @DisplayName("스프링 컨테이너에 의해 프린터가 생성되어 정상 작동해야 한다.")
    void printerTest(){
        // 스프링에게 사용할 설정 파일을 알려줌
        ApplicationContext context = new AnnotationConfigApplicationContext(PrintConfig.class);

        // 컨테이너에서 등록된 빈을 취득
        Printer printer = context.getBean(Printer.class);

        printer.printPaper();
    }

    @Test
    @DisplayName("스프링 xml컨테이너에 의해 프린터가 생성되고 작동해야 한다.")
    void printerTestByXmlConfig(){
        ApplicationContext context = new GenericXmlApplicationContext("printConfig.xml");
        Printer printer = context.getBean(Printer.class);

        printer.printPaper();
    }

}