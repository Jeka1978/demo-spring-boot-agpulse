package com.agpulse.demospringbootagpulse.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private Map<Integer,MessageProcessor> messageProcessorMap;


    @Override
    public String process(Message message) {
        String type = String.valueOf(message.getType());
        MessageProcessor messageProcessor = messageProcessorMap.get(type);
        if (messageProcessor == null) {
            throw new UnsupportedOperationException(type + " not supported yet, please call 054-6496609");
        }
        return messageProcessor.process(message);
    }
}








