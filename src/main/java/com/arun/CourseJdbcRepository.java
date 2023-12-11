package com.arun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository 
{
	
	private static final String INSERT_QUERY =
			"""
			 insert into course(id,name) values(?,?);
			 
			""";
	private static final String DELETE_QUERY = 
			"""
			 delete from course where id=?;
			""";
	
	private static final String SELECT_QUERY = 
			"""
			 select * from course where id=?;
			""";
    @Autowired
	private JdbcTemplate springJdbcTemplate;
	
	public void insert(Course course)
	{
		springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName());
	}
	
	public void delete(long id)
	{
		springJdbcTemplate.update(DELETE_QUERY,id);
	}
	
	public Course select(long id)
	{
		return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
	}
	
	

}
