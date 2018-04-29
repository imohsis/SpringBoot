package com.example.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {
	
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	
	

	 
	public List<Course> index(String topicId){
		
		//return topics; was done before  
		List<Course> courses = new ArrayList<>();
		
		courseRepository.FindByTopicId(topicId)
		.forEach(courses::add);
		return courses;
		
		
		
	}
	
	
	public Optional<Course> show(String id) {
		
	 return courseRepository.findById(id);
	
	
	}
	
	
	
	
	public void create(Course course) {
		courseRepository.save(course);
	}
	
	
	
	public void update(Course topic) {
		
		courseRepository.save(topic);
		
	}


	public void delete(String id) {
	
		courseRepository.deleteById(id);
	
	}


   	
	
	
	
	
	
	
	

}
