package com.springrest.springrest.servies;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CoursesServies {

	
	public List<Courses> getCourses();

	public Courses getCourses(long Coursesid);

	public Courses addCourses(Courses courses);

	public Courses updateCourses(Courses courses);

	public void deleteCourses(long parseLong);
	

}
