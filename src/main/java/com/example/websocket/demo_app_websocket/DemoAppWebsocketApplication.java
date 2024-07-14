package com.example.websocket.demo_app_websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppWebsocketApplication.class, args);
	}

}
//disini kita akan buat contoh simple chat


//dan web sockectny akan seperti dibawah sini
/**
 * Message Type
 * Header
 * Body
 * destination
 * ada body destination
 *
 * destination it yg @MessageMapping
 */