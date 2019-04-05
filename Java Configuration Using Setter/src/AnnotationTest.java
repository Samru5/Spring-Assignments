package com.capgemini.spring.test;
import com.capgemini.spring.renderer.*;
import com.capgemini.spring.configuration.*;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest
{
public static void main(String args[])
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
		MessageRenderer renderer=context.getBean(MessageRenderer.class);

		renderer.render();
	}
}