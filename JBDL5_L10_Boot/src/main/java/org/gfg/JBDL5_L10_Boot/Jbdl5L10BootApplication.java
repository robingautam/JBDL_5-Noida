package org.gfg.JBDL5_L10_Boot;

import org.gfg.JBDL5_L10_Boot.profile.DBConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
@ComponentScan("org.gfg")
@EnableAutoConfiguration
public class Jbdl5L10BootApplication implements CommandLineRunner {

	@Autowired
	DBConnect dbConnect;

	public static void main(String[] args) {
		SpringApplication.run(Jbdl5L10BootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dbConnect.connectDatabase();
	}
}
