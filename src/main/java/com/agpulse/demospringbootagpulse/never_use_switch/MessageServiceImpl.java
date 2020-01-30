package com.agpulse.demospringbootagpulse.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.MessageSourceProperties;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
@Service
public class MessageServiceImpl implements MessageService {


    @Autowired
    private Map<Integer,MessageProcessor> messageProcessorMap;



    @Override
    public String process(Message message) {
        int type = message.getType();
        MessageProcessor messageProcessor = messageProcessorMap.get(type);
        if (messageProcessor == null) {
            throw new UnsupportedOperationException(type + " not supported yet, please call 054-6496609");
        }
        return messageProcessor.process(message);
    }
}








