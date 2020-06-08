package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ctx.close();
		SpringApplication.run(Application.class, args);
		System.out.println("SpringbootApp...");
		System.out.println(ctx.getClass());
		//changes HIS-4
		System.out.println("working on stashes");
		//stash-2
		System.out.println("working on stashes-2");
		//stash-4
	    System.out.println("working on stashes-4");
				
		
	}

}
