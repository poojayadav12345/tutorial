package com.springrest.springrest.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springrest.springrest.Entities.Course;
import com.springrest.springrest.Services.CourseService;

@RestController
public class MyController {
   
	//private static final String HttpsStatus = null;
	@Autowired()
	private CourseService courseService;
	
	
	//get all courses
	@GetMapping("/abc")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
		
	}
	
	//get courses by id
	@GetMapping("/abc/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
		
	}
	
	//post the data
	@PostMapping("/abc")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
		
	}
	
	//update course using
	@PutMapping("/abc")
	public Course updateCourse(@RequestBody Course course )
	{
		return this.courseService.updateCourse(course);
		
	}
	
	
	//delete the course
	@DeleteMapping("/abc/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
	try{
//		return this.courseService.deleteCourse(Long.parseLong(courseId));
		this.courseService.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		
	}catch (Exception e)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
}
