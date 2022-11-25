package org.example.repository;

import org.example.entity.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(Employee st) {
        Object [] param = new Object[]{st.getId(),st.getName(),st.getLastname(),st.getAddress(),st.getMobileNo()};
        int i = jdbcTemplate.update("insert into student_details values(?,?,?,?,?)",param);
        if(i >0)
        {
            return st.getId();
        }
        else return 0;

    }

    @Override
    public boolean updateById(Employee st) {
        Object [] param = new Object[]{st.getName(),st.getLastname(),st.getAddress(),st.getMobileNo(),st.getId()};
        int i = jdbcTemplate.update("update student_details set name = ?,lastname = ?,address = ?,mobileno = ? where id = ?",param);
        if(i>0) return true;
        else return false;
    }

    @Override
    public boolean updateName(int id,String name) {
        Object [] param = new Object[]{name,id};
       int i =  jdbcTemplate.update("update student_details set name = ? where id = ?",param);
        if(i>0) return true;
        else return false;

    }

    @Override
    public boolean updateLastName(int id,String lastname) {
        Object [] param = new Object[]{lastname,id};
        int i =  jdbcTemplate.update("update student_details set lastname = ? where id = ?",param);
        if(i>0) return true;
        else return false;

    }

    @Override
    public boolean updateMobileNo(int id,long mobileno) {
        Object [] param = new Object[]{mobileno,id};
        int i =  jdbcTemplate.update("update student_details set mobileno = ? where id = ?",param);
        if(i>0) return true;
        else return false;

    }

    @Override
    public boolean updateAddress(int id,String address) {
        Object [] param = new Object[]{address,id};
        int i =  jdbcTemplate.update("update student_details set address = ? where id = ?",param);
        if(i>0) return true;
        else return false;
    }


    @Override
    public Employee findById(int id) {
        return jdbcTemplate.query("select * from student_details where id="+id, new ResultSetExtractor<Employee>() {
            @Override
            public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
                int i = rs.getInt(1);
                System.out.println("hello"+i);
               return null;
            }
        });

    }
    @Override
    public boolean delete(int id) {

        Object [] param = new Object[]{id};
        int i = jdbcTemplate.update("delete from student_details where id = ?",param);
        if(i>0) return true;
        else return false;
    }

    @Override
    public List<Employee> findAll() {
        return jdbcTemplate.query("select * from student_details", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee s = new Employee();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setLastname(rs.getString(3));
                s.setAddress(rs.getString(4));
                s.setMobileNo(rs.getLong(5));
                return s;
            }
        });
    }
    }



