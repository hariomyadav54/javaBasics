package com.springrest.springrest.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/Courses")
	public Courses addCourses(@RequestBody Courses courses) {
		return this.coursesServies.addCourses(courses);
	}
	@PutMapping("/Courses")
	public Courses updateCourses(@RequestBody Courses courses) {
		
		return this.coursesServies.updateCourses(courses);  
	}
	@DeleteMapping("/Courses/{Coursesid}")
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String Coursesid) {
		try {
			this.coursesServies.deleteCourses(Long.parseLong(Coursesid));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

