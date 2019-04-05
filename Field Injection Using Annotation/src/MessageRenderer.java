package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageRenderer
{

@Autowired
private MessageProvider messageProvider;


	public void render()
	{
		System.out.println(messageProvider.getMessage());
	}

}