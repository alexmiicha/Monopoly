package monopoly.monopoly.plateau.scenes;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import monopoly.monopoly.exemple.Client;

import java.io.IOException;

public class MenuSelectionPersonnage extends Application {

    @FXML
    private ImageView imageView;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("menuSelectionPersonnage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 880, 880);
        stage.setTitle("Monopoly Crypto");
        stage.setScene(scene);
        stage.show();
    }

}
