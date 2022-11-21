package com.springrest.springrest.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.servies.CoursesServies;

@RestController
public class myController {
	@Autowired
private CoursesServies coursesServies;
	@GetMapping("/home")
	public String home() {
		return "this is hom page";
	}
	@GetMapping("/Courses")
	public List<Courses> getCourses1(){
		return this.coursesServies.getCourses();
		
	}
	@GetMapping("/Courses/{Coursesid}")
	public Courses getCourses(@PathVariable String Coursesid) {
		return this.coursesServies.getCourses(Long.parseLong(Coursesid));
		
	}
}

