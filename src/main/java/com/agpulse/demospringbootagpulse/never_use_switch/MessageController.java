package com.agpulse.demospringbootagpulse.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/message")
    public String processMessage(@RequestBody Message message) {
        return messageService.process(message);
    }

}
