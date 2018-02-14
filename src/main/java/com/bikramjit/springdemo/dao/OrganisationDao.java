package com.bikramjit.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.bikramjit.springdemo.domain.Organization;

public interface OrganisationDao {
	
	//set the data source that will be required to create a connection to the database
	public void setDataSource(DataSource datasource);
	
	//create a record in the organization table
	public boolean create(Organization org);
	
	//retrieve a single organization 
	public List<Organization> getOrganization(Integer id);
	
	
	//delete a spefication organization in the table
	public boolean delete(Organization org);
	
	//get all the list of organizarions
	public List<Organization> getAllOrganization();
	
	//update record of the organization
	public boolean update(Organization org);
	
	public void cleanup();

}
