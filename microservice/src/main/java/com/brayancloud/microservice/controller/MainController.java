package com.brayancloud.microservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brayancloud.microservice.models.Greeting;

@RestController
public class MainController 
{
	private static final String template="HELLO XXXX %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting gretting (@RequestParam (value = "name",defaultValue = "WORLD") String name)
	{
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}
}
