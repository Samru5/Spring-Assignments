package com.capgemini.spring.provider;

import org.springframework.stereotype.Component;

@Component("gm")
public class GmMessageProvider implements MessageProvider
{

@Override
public String getMessage()
{
return "Good Morning";
}

}