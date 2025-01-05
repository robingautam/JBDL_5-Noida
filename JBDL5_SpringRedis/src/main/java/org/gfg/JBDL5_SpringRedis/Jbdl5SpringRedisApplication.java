package org.gfg.JBDL5_SpringRedis;

import org.gfg.JBDL5_SpringRedis.config.User;
import org.gfg.JBDL5_SpringRedis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jbdl5SpringRedisApplication implements CommandLineRunner {

	@Autowired
	RedisUtil redisUtil;

	public static void main(String[] args) {
		SpringApplication.run(Jbdl5SpringRedisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	redisUtil.setExpirableKey("NAME", "ROBIN");
		//System.out.println("Data set in redis");

		//redisUtil.setExpirableKey("2","prabhat",50);

		//String data = redisUtil.getDataFromRedis("2");
		//System.out.println("Data from redis: "+data);

		User user = new User(1,"Robin","robin@gmail.com");
	//	redisUtil.setExpirableKey("robin",user,1000);
	//	System.out.println("data saved");
		User redisUser =  redisUtil.getDataFromRedis("robin");
		System.out.println(redisUser);
	}
}
