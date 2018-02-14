package com.bikramjit.springdemo.daoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bikramjit.springdemo.dao.OrganisationDao;
import com.bikramjit.springdemo.domain.Organization;

public class OrganizationDaoImpl implements OrganisationDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource datasource) {
		// TODO Auto-generated method stub
		jdbcTemplate=new JdbcTemplate(datasource);
	}

	public boolean create(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Organization> getOrganization(Integer id) {
		// TODO Auto-generated method stub
		return null;
	
	}

	public boolean delete(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	public List<Organization> getAllOrganization() {
		// TODO Auto-generated method stub
		String sql_query="SELECT * FROM organization";
		List<Organization> orgList=jdbcTemplate.query(sql_query,new OrganizationRowmapper());
		return orgList;
		
	}

	public boolean update(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
