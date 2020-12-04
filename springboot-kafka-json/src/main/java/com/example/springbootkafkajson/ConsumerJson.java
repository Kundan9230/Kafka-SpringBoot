package com.example.springbootkafkajson;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerJson {

	@KafkaListener(topics = "test_topic_json",groupId = "group_id_json",containerFactory 
            = "userListner")
    public void consumeJsonMessage(User user){
	  
	System.out.println("New Entry(Recieved By Consumer 1): "+ user); }
	 
}