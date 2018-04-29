package com.example.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	
	

	 
	public List<Topic> index(){
		
		//return topics; was done before  
		List<Topic> topics = new ArrayList<>();
		
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
		
		
	}
	
	
	public Optional<Topic> show(String id) {
		
	 return topicRepository.findById(id);
	
	
	}
	
	
	
	
	public void create(Topic topic) {
		topicRepository.save(topic);
	}
	
	
	
	public void update(String id, Topic topic) {
		
		topicRepository.save(topic);
		
	}


	public void delete(String id) {
	
		topicRepository.deleteById(id);
	
	}
	
   	
	
	
	
	
	
	
	

}
