package com.example.Actuator.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Actuator.model.Student;

@RestController
public class Mycontroller {

	Logger logger=LogManager.getLogger(Mycontroller.class);
	
	@RequestMapping(value="/welcome",produces="application/json",method=RequestMethod.GET)
	public List<Student> show()
	{
		logger.trace("asd");
		ArrayList<Student> l=new ArrayList();
		l.add(new Student(1,"avi","Dighi"));
		l.add(new Student(2,"prasad","alandi"));
		l.add(new Student(3,"pradip","latur"));
		return l;
	}
}
