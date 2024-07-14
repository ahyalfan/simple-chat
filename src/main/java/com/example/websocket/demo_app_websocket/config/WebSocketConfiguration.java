package com.example.websocket.demo_app_websocket.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
    @Override
//    kita daftarkan pakai stomp
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
        registry.addEndpoint("/ws");// prefix web socket
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic"); // karena akan dikirim ke prefix topix
        registry.setApplicationDestinationPrefixes("/app"); // untu ngrimnya akan pakai prefix app

//        jadi misal ada @MessageMapping("/chat")
//        maka jika ingin mengirim chat bisa pakai url /app/chat
//        dan lain lain

//        dan dia akan kirim ke prefix "/topic"
//        jadi misal ada @MessageMapping("/chat")
//          @SendTo(/topic/chat)
//        artinya function ini akan dikirim ke /topic/chat yg ngirim /app/chat

//        karena /app dan /topic sudah terhubung
    }
}
