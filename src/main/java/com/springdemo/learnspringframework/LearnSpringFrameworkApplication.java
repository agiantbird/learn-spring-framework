package com.springdemo.learnspringframework;

import com.springdemo.learnspringframework.game.GameRunner;
import com.springdemo.learnspringframework.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
