package com.capgemini.spring.test;
import com.capgemini.spring.renderer.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest
	{
		public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Annotation.xml");
		MessageRenderer renderer=context.getBean(MessageRenderer.class);

		renderer.render();
	}
}