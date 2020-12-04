package com.example.springbootkafkajson;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	private static final String TOPIC = "test_topic_json";
	  @Autowired 
	  private KafkaTemplate<String, User> kafkaJsonTemplate; 
	  public void sendJsonMessage(User user) { 
	 kafkaJsonTemplate.send(TOPIC,new User(user.getFirstname(),user.getEmail())); 
	 }	 
	  
	  @Bean
	    public NewTopic createTopic(){

	        return new NewTopic(TOPIC,3,(short) 1);
	    }
}
