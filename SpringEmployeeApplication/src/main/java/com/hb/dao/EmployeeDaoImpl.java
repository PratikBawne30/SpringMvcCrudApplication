package com.hb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hb.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Employee e) {
		String sql = "insert into employee(name, desg) values('" +e.getName()+"','"+e.getDesg()+"')";
		return template.update(sql);
	}

	public List<Employee> getEmployees() {
		return template.query("select * from employee",new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException{
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDesg(rs.getString(3));
				
				return emp;
			}
		});
	}

	public Employee getEmpById(int id) {
        String sql = "select * from employee where id=?";
		return template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public int delete(int id) {
		String sql = "delete from employee where id="+id+"";
		return template.update(sql);
	}

	public int update(Employee emp) {
		String sql = "update employee set name='"+emp.getName()+"',desg='"+emp.getDesg()+"' where id="+emp.getId()+"";
		return template.update(sql);
	}
}
