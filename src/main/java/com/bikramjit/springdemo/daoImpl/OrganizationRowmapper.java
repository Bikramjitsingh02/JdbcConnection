package com.bikramjit.springdemo.daoImpl;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bikramjit.springdemo.domain.Organization;

public class OrganizationRowmapper implements RowMapper<Organization> {

	
	public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Organization org=new Organization();
		org.setId(rs.getInt("id"));
		org.setCompanyName(rs.getString("company_Name"));
		org.setYearOfCorporation(rs.getInt("year_of_incorporation"));
		org.setPostalCode(rs.getString("postal_code"));
		org.setEmployeeCount(rs.getInt("employee_count"));
		org.setSlogan(rs.getString("slogan"));
		
		return org;
	}

}
