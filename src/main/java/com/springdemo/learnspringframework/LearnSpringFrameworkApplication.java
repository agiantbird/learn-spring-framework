package com.springdemo.learnspringframework;

import com.springdemo.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame, GameRunner
		GameRunner runner = context.getBean(GameRunner.class);
		runner.runGame();
	}
}
