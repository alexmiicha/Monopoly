package monopoly.monopoly.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import monopoly.monopoly.exemple.Client;

import java.io.IOException;

public class OKButton extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("plateau.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 880, 880);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
