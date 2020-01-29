package com.agpulse.demospringbootagpulse.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class DbMessageProcessor implements MessageProcessor {
    @Override
    public String process(Message message) {
        return message.getText()+" was saved to db";

    }
}
