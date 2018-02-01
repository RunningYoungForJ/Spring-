package com.young.jdbc.example;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

public class StudentJDBCTemplate implements StudentDAO{

	private DataSource datasource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		this.datasource=ds;
		this.jdbcTemplateObject=new JdbcTemplate(datasource);
	}

	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		String sql="insert into student (name,age) values (?,?)";
		jdbcTemplateObject.update(sql, name,age);
		System.out.println("create record name = "+name+" age = "+age);
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		String sql="select * from student where id = ?";
		Student student= jdbcTemplateObject.queryForObject(sql, new Object[] {id}, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete * from student where id = ?";
		jdbcTemplateObject.update(sql, id);
	    System.out.println("Deleted Record with ID = " + id );

	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		String sql="update student set age = ? where id = ?";
		jdbcTemplateObject.update(sql, age,id);
		System.out.println("Updated Record with ID = " + id );
	}

}
