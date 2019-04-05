package com.capgemini.spring.test;
import com.capgemini.spring.renderer.*;
import com.capgemini.spring.configuration.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppConfigurationTest{

	public static void main(String args[])
	{

	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);

	MessageRenderer mr=(MessageRenderer)context.getBean(MessageRenderer.class);

	mr.render();
	}
}