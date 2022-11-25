package com.springrest.springrest.servies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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


	@Override
	public Courses addCourses(Courses courses) {
		list.add(courses);
		return courses;
	}


	@Override
	public Courses updateCourses(Courses courses) {
		list.forEach(e -> {
			if (e.getId()==courses.getId()) {
				e.setTitile(courses.getTitile());
				e.setDescription(courses.getDescription());
			}
		});
		return courses;
	}


	@Override
	public void deleteCourses(long parseLong) {
	list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		
	}
}
