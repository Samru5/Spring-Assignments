package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;

public class MessageRenderer
{
private MessageProvider messageProvider;

public MessageRenderer(MessageProvider provider)

	{
		this.messageProvider=provider;
	}

	public void render()
	{
		System.out.println(messageProvider.getMessage());
	}

}