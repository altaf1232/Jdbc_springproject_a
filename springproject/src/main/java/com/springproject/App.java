package com.springproject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springproject.dao.Departmentdao;
import com.springproject.entity.Department;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configurationjdbc.xml");
        Departmentdao dpdao=context.getBean("studentdao",Departmentdao.class);
        //data save karne key liye
		
		/*
		 * //here create your pogo class Department dpa = new Department();
		 * dpa.setDp_id(102); dpa.setDp_name("altaf Malik");
		 * dpa.setDp_address("malik sakinaka 701");
		 * dpa.setDp_address("Mumbai Metro side gali kharani road");
		 * dpa.setDp_branch("Mech");
		 */
		 // int result = dpdao.insert(dpa);
		// System.out.println("it is print your result"+result);
		// JdbcTemplate jdbctemplate =context.getBean("jdbct",JdbcTemplate.class);
		  //here i am creating insert query String
		//String query="insert into Department(dp_id,dp_name,dp_address,dp_branch)value(?,?,?,?)";
		  //here is fire your query then used JdbcTemplate object int result
		//int result1 =jdbctemplate.update(query,1,"mechanical_a","Mechinal buling back side_a"
		// ,"Mumbai Branch Sakinak");
		 // System.out.println("number of recod inserted"+result1);
		 
          
       // here stared your update change 
		
		 // Department department1=new Department();
		//  department1.setDp_id(1);
		//  department1.setDp_name("Computer_engineer");
		//  department1.setDp_address("Computer Sceince buling sakinaka");
		//  department1.setDp_branch("Branch Delhi");
		 
		 //here i am using Departmetdao object 
		// int result=dpdao.change(department1);
		// System.out.println("data change"+result);
        
        //here is started your delete query
		/*
		 * int result=dpdao.delete(1);
		 * System.out.println("it is delete your data"+result);
		 */
       //here is started your select 
		/*
		 * Department departments=dpdao.getDepartment(123);
		 * System.out.println("here is your select query" +departments);
		 */
        //here is create your select All method
        List<Department>  department_c= dpdao.getAllDepartments();
             for(Department d :department_c) 
             {
            	 System.out.println("this is your all select method"+d);
             }
        
        
    }
    
    
}
