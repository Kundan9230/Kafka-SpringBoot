package com.example.springbootkafkajson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private final Producer producer;

	
	  @Autowired 
	  public TestController(Producer producer) { 
		  this.producer = producer; }
	 
    
	/*
	 * @Autowired private KafkaTemplate<String, User> kafkaTemplate; private static
	 * final String TOPIC = "User";
	 */
	
    @GetMapping("/publish/{firstname}/{email}")
	 public String post(@PathVariable("firstname") final String firstName,
		  @PathVariable("email") final String email) { 
			
			  User user=new User(firstName,email); 
			  this.producer.sendJsonMessage(user);
			return "Message has been Sent";
			 
    	/*kafkaTemplate.send(TOPIC,new User(firstName,email)); 
			  return "Published successfully"; }*/
		  
    }
    
}

