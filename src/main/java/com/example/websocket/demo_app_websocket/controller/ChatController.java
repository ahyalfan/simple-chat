package com.example.websocket.demo_app_websocket.controller;

import com.example.websocket.demo_app_websocket.dto.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    // TODO: Implement chat functionality using WebSockets
    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public Message sendMessage(Message topic){
        return topic;
    }
}

