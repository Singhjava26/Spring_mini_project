package com.spring.springFrame_demoproj;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	Priti trainer1=new Priti();
    	 trainer1.trainer();
    	
    	Omkar  trainer2 =new Omkar();
    	trainer2.trainer();
    	
    	Teacher teacher1 =new Omkar();
    	teacher1.trainer();
    
    }
}
