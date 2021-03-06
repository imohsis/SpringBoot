package com.imoh.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	   @RequestMapping("/topics")
	public List<Topic> index() {
		
		
		return topicService.index();
							
	}
	
	   @RequestMapping("topics/{id}")
	   public Topic show(@PathVariable String id) {
		   
		   return topicService.show(id);
		   
	   }
	
	   @RequestMapping(method=RequestMethod.POST, value="/topics")
	   
	   public void create(@RequestBody Topic topic) {
		   
		   topicService.create(topic);	   
		   
	   }
	   

	   @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	   
	   public void update(@RequestBody Topic topic,@PathVariable String id) {
		   
		   topicService.update(id, topic);	   
		   
	   }
	
	   
	   
	  
      @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	   
	   public void delete(@PathVariable String id) {
		   
		    topicService.delete(id);	   
		   
	   }
	   
	   
	   
	   
	
}
