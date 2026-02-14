package com.Bhavesh.main.Controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

	
	private ChatClient chatClient;
	
	public ChatController(ChatClient.Builder chatClient) {
		// TODO Auto-generated constructor stub
		this.chatClient=chatClient.build();
	}
	
	
	@GetMapping("/chat")
	public ResponseEntity<String> chat(@RequestParam(value = "q") String query){
		
		
		String ans = this.chatClient.prompt(query).call().content();
		return ResponseEntity.ok(ans);
	}
}
