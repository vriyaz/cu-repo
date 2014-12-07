package com.cu.spring.batch.app1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class PersonRowMapper implements RowMapper<Person> {
  public Person mapRow(ResultSet rs, int row) throws SQLException {
    return new Person(rs.getString(1), rs.getString(2));
  }
}
