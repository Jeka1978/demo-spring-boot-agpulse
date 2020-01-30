package com.agpulse.demospringbootagpulse.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class TelegramMessageProcessor implements MessageProcessor {
    @Override
    public String process(Message message) {
        //50 lines of code
        return message.getText().toUpperCase() + " was sent by telegram";
    }

    @Override
    public int getMyType() {
        return 3;
    }
}
