package com.example.messageRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		int a = 10;
		System.out.println("Hello World "+a);
		System.out.println("Hello Kunal");
		System.out.println("Hello India");

	}

}
