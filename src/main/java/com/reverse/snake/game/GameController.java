package com.reverse.snake.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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

    Rectangle rectangle;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(rectangle);
    }
    //Your code goes here
    @FXML
    public void backToWallet() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Wallet.fxml"));

        Pane pane = loader.load();
        WalletController wc = loader.getController();
        wc.setStage(stage);
        stage.setScene(new Scene(pane));
    }










}
