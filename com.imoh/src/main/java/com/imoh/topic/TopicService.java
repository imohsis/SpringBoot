package com.imoh.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	
	private  List<Topic> topics =new ArrayList<>( Arrays.asList(
			
			new Topic("spring", "spring Framework", "Strictly Typed Language "),
			new Topic("PHP", "Laravel Framework", "the easiest to learn "),
			new Topic("Javascript", "Angular Framework", "Well cant be too Confident in javascript")
			
			));
	 
	public List<Topic> index(){
		
		return topics;
	}
	
	
	public Topic show(String id) {
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
	
	
	public void create(Topic topic) {
		topics.add(topic);
	}
	
	
	
	public void update(String id, Topic topic) {
		
		for(int i=0; i<topics.size(); i++) {
			
			Topic t = topics.get(i);
			
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}


	public void delete(String id) {
	
		topics.removeIf(t -> t.getId().equals(id));
	
	}
	
   	
	
	
	
	
	
	
	

}
