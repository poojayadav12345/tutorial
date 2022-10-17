package com.springrest.springrest.Services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.Entities.Course;


@Service
public  class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	List<Course> list;
	
	public CourseServiceImpl()
	{
//		list =new ArrayList<>();
//		{
//			list.add(new Course(11,"java","this is java"));
//			list.add(new Course(12,"ds","this is ds"));
//		}
	}
	
	
	
	
	@Override
	public List<Course> getCourses()
	{
		return courseDao.findAll();
	}
	
	

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
//		Course c = null;
//		for(Course course:list)
//		{
//			if(course.getId() == courseId)
//			{
//				c=course;
//				break;
//				
//			}
//		}
		
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		// TODO Auto-generated method stub
//		list.add(course);
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		
		
	
//	});
		
		return courseDao.save(course);
}

	@Override
	public Course deleteCourse(long  parseLong) {
		// TODO Auto-generated method stub
//		Course c = null;
//		for(Course course:list)
//		{
//			if(course.getId() == courseId)
//			{
//				c=course;
//				break;
//				
//			}
//		}
	Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		return entity;
		
		
		
	
	}
}
