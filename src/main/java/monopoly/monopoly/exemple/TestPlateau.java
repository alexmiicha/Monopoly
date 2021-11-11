package monopoly.monopoly.exemple;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class TestPlateau extends Application {

    @FXML
    private ImageView imageView;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("configurationPartie.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 880, 880);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
