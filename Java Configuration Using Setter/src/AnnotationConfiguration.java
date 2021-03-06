package com.capgemini.spring.configuration;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfiguration
{

@Bean
public MessageProvider provider(){
	return new GmMessageProvider();
	}

@Bean
public MessageRenderer renderer(){

	MessageRenderer renderer=new MessageRenderer();
	renderer.setMessageProvider(provider());
	return renderer;
	}
}