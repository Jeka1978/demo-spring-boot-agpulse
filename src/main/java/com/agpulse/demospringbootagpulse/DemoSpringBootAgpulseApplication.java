package com.agpulse.demospringbootagpulse;

import com.agpulse.demospringbootagpulse.never_use_switch.MessageProcessor;
import com.agpulse.demospringbootagpulse.never_use_switch.WhatsappMessageProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication
public class DemoSpringBootAgpulseApplication {
    
    
    
    @Bean
    public Map<Integer, MessageProcessor> map(){
        return Map.of(1,new WhatsappMessageProcessor());
    }
    

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoSpringBootAgpulseApplication.class, args);
        context.getBeansOfType(MessageProcessor.class)
    }

}
