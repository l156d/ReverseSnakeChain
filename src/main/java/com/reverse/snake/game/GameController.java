package com.reverse.snake.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Setter
@Getter
public class GameController implements Initializable {

    private Stage stage;

    @FXML
    private Canvas canvas;

    Rectangle rectangle;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        createObject(gc);
    }
    //Your code goes here
    @FXML
    public void backToWallet() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Wallet.fxml"));
        Pane pane = loader.load();
        WalletController wc = loader.getController();
        wc.setStage(stage);
        stage.setScene(new Scene(pane, 1600, 800));
    }

    public void createObject(GraphicsContext gc){
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLUE);
        gc.setLineWidth(3);
        //Spielfeld
        // x minus geht nach links, und y minus geht nach oben
        gc.strokeRect(100, 200, 800, 800);

        //Spieler erstellen
        gc.fillRect(110, 210, 20,20);
    }












}
