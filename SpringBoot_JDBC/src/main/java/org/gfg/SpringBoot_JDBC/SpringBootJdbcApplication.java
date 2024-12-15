package org.gfg.SpringBoot_JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	String query = "INSERT INTO student (id, name, email) VALUES (?,?,?)";

	//	int rows =  jdbcTemplate.update(query,3,"Harsh","harsh@gmail.com");

	//	System.out.println("Rows Updated: "+rows);

		String query = "SELECT * FROM student where id=3";

		Student student = jdbcTemplate.queryForObject(query, (rs, rowNum) -> {
            Student map = new Student();
            map.setId(rs.getInt(1));
            map.setName(rs.getString(2));
            map.setEmail(rs.getString(3));
            return map;
        });

		System.out.println(student);
		query = "SELECT * FROM student";
	  //  List studentList =	jdbcTemplate.queryForList(query, StudentRowMapper.class);

	//	System.out.println(studentList);
		query = "UPDATE student set email=? where id=?";
		int rows = jdbcTemplate.update(query,"robingautam@yahoo.com",1);

		System.out.println(query);



	}
}
