package com.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootDemoApplication.class, args);
		EmployeeRepository emprepo=context.getBean(EmployeeRepository.class);
		Employee emp=new Employee();
		
		emp.setEmp_Id(1);
		emp.setEmp_name("Vipin");
		emp.setEmp_sallary("50000");
		emprepo.save(emp);
		System.out.println(emp);
			
		
		Employee emp1=new Employee();
        
        emp1.setEmp_Id(3);
        emp1.setEmp_name("priti");
        emp1.setEmp_sallary("100000");
        
	
		
		 ArrayList<Employee>emplist=new ArrayList<>();
	        emplist.add(emp);
	        emplist.add(emp1);
	        emprepo.saveAll(emplist);
	        System.out.println("all the employees stores succesfully");
	     /*    
			
			Optional<Employee> empOp=emprepo.findById(2);
			Employee e=empOp.get();
			e.setEmp_name("zaid");
			emprepo.save(e);
			System.out.println("employee data has been updated");
	       
			
			emprepo.deleteById(3);
		
			List<Employee>emplist1=emprepo.findAll();
			for(Employee e1:emplist1) {
				System.out.println(e1);
				
			}
       */
	}		
}

