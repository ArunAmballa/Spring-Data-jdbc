package com.arun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner
{
	@Autowired
	private CourseJdbcRepository repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
		repo.insert(new Course(2,"SpringBoot"));
		repo.insert(new Course(3,"SpringMVC"));
		
		repo.delete(2);
		
		System.out.println(repo.select(3));
				
	}

}
