package com.bikramjit.springdemo.daoImpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bikramjit.springdemo.dao.OrganisationDao;
import com.bikramjit.springdemo.domain.Organization;

public class jdbcTempleteClassicApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a Application context

		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cp.xml");
		
		
		OrganisationDao dao=(OrganisationDao)ctx.getBean("orgDao");
		
		List<Organization> orgs=dao.getAllOrganization(); 
	
		for(Organization org:orgs) {
		System.out.println(org.getCompanyName());
		}
		
		((ClassPathXmlApplicationContext)ctx).close();
	
	}

}
