package dev.app.MessageTestService;

import org.springframework.stereotype.Service;

@Service
public class MessageTestService {

    public String sendMessage() {
        return "Welcome to PRLab API!!!";
    }
}
