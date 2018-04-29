package com.example.course;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	   @RequestMapping("/topics/{id}/courses")
	public List<Course> index(@PathVariable String id){
		
		
		return courseService.index(id);
							
	}
	
	   @RequestMapping("/topics/{topicId}/courses/{id}")
	   public Optional<Course> show(@PathVariable String id) {
		   
		   return courseService.show(id);
		   
	   }
	
	   @RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	   
	   public void create(@RequestBody Course course,@PathVariable String topicId) {
		   course.setTopic(new  Topic(topicId,"",""));
		   courseService.create(course);	   
		   
	   }
	   

	   @RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
	   
	   public void update(@RequestBody Course course,@PathVariable String id,@PathVariable String topicId) {
		   
		   course.setTopic(new  Topic(topicId,"",""));
		   courseService.update(course);	   
		   
	   }
	
	   
	   
	  
      @RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
	   
	   public void delete(@PathVariable String id) {
		   
		    courseService.delete(id);	   
		   
	   }
	   
	   
	   
	   
	
}
