package com.springrest.springrest.servies;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CoursesServies {

	
	public List<Courses> getCourses();

	public Courses getCourses(long Coursesid);

}
