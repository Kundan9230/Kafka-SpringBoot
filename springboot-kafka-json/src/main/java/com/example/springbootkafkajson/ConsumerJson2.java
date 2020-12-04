package com.example.springbootkafkajson;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerJson2 {

	@KafkaListener(topics = "test_topic_json",groupId = "group_id_json",containerFactory 
            = "userListner")
    public void consumeJsonMessage(User user){
	  
	System.out.println("New Entry(Recieved By Consumer 2): "+ user); 
	}
	 
}
