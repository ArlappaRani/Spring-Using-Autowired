package com.spring.autowrinig.byannotation.SpringPro7AWbyAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
    	Car c1=(Car)ctx.getBean("car" );  
    	System.out.println(c1);
    	System.out.println("--------------------------");
    	
    	//University u=(University)ctx.getBean("univ");
    	//System.out.println(u);
    	
    
    }
}
