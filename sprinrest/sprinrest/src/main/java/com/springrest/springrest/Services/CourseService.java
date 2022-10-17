package com.springrest.springrest.Services;

import java.util.List;

//import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.Entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public Course deleteCourse(long courseId);
	

}
