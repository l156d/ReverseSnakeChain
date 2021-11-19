package com.reverse.snake.game;


import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<JavaFXClass.StageReadyEvent> {
    @Override
    public void onApplicationEvent(JavaFXClass.StageReadyEvent event) {
        Stage stage = event.getStage();
    }
}