package com.arun;

import org.springframework.stereotype.Component;

@Component
public class Course 
{
	
	private long id;
	private String name;
	
	public Course()
	{
		
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Course(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
