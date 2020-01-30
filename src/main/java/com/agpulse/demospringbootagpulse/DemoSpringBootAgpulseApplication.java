package com.agpulse.demospringbootagpulse;

import com.agpulse.demospringbootagpulse.never_use_switch.MessageProcessor;
import com.agpulse.demospringbootagpulse.never_use_switch.WhatsappMessageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoSpringBootAgpulseApplication {
    
    
 @Bean
 public Map<Integer,MessageProcessor> map(List<MessageProcessor> messageProcessors){
     return messageProcessors
             .stream()
             .collect(Collectors.toMap(MessageProcessor::getMyType, Function.identity()));

 }
    

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoSpringBootAgpulseApplication.class, args);
        System.out.println();
 }

}
