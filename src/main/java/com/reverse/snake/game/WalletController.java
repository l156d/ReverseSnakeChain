package com.reverse.snake.game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Setter @Getter
public class WalletController implements Initializable {

    private Stage stage;
    @FXML
    public void launchGame() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Game.fxml"));

        Pane pane = loader.load();
        GameController gc = loader.getController();
        gc.setStage(stage);
        stage.setScene(new Scene(pane));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
