package com.agpulse.demospringbootagpulse.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WhatsappMessageProcessor implements MessageProcessor {
    @Override
    public String process(Message message) {
        return message.getText()+" was sent to whatsapp";

    }

    @Override
    public int getMyType() {
        return 2;
    }
}
