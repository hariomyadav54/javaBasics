package com.springrest.springrest.servies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CoursesServiesimpl implements CoursesServies {
	
	List<Courses>list;
	
	public  CoursesServiesimpl() {
		list = new ArrayList<>();
		list.add(new Courses(124,"java core courses","this courses basic of java"));
		list.add(new Courses(125,"spring core courses","spring  courses using rest api "));
		
	}
	

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Courses getCourses(long Coursesid) {
		Courses c=null;
		for( Courses courses:list) {
			if (courses.getId()==Coursesid)
			{
				c=courses;
				break;
			}
		}
		
		return c;
	}
}
