package com.capgemini.spring.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.spring.model.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test
{

	public static void main(String args[])
	{
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("context.xml");
		context.refresh();
		Organization org=(Organization)context.getBean("organization");
		System.out.println(org);
	}
}