package com.capgemini.spring.configuration;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class AppConfiguration
{

@Bean
public MessageRenderer getRenderer(){

	return new MessageRenderer(new GmMessageProvider());
	}
}