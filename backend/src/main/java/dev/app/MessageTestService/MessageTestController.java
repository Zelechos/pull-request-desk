package dev.app.MessageTestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageTestController {

    @Autowired
    private MessageTestService messageTestService;


    @GetMapping("/prlab")
    public String sendMessageTest(){
        return messageTestService.sendMessage();
    }

}
