package com.reverse.snake;

import com.reverse.snake.game.JavaFXClass;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnakeApplication {

	public static void main(String[] args) {
		Application.launch(JavaFXClass.class, args);
	}

}
