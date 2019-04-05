package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageRenderer
{
	private MessageProvider messageProvider;

	@Autowired
	public MessageRenderer(MessageProvider provider)

	{
		this.messageProvider=provider;
	}

	public void render()
	{
		System.out.println(messageProvider.getMessage());
	}

}