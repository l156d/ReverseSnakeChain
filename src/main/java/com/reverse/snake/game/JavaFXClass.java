package com.reverse.snake.game;

import com.reverse.snake.SnakeApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class JavaFXClass  extends Application {
    private ConfigurableApplicationContext applicationContext;
    private WalletController walletController;

    @Override
    public void start(Stage stage) throws IOException {
        //objekte erstellen hier:
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Wallet.fxml"));
        Pane pane = loader.load();
        walletController = loader.getController();
        walletController.setStage(stage);
        applicationContext.publishEvent(new StageReadyEvent(stage));
        stage.setScene(new Scene(pane, 1600, 800));
        stage.show();
    }
    static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return ((Stage)  getSource());
        }
    }
    @Override
    public void init() {
        applicationContext = new SpringApplicationBuilder(SnakeApplication.class).run();
    }
    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }



}
