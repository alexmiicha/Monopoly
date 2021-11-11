package monopoly.monopoly.exemple;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;

public class Client extends Application {
    static final int port = 1234;

    @FXML
    private ImageView imageView;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("plateau.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 880, 880);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", port);
        System.out.println("SOCKET = " + socket);

        BufferedReader plec = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

        PrintWriter pred = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream())),
                true);

        System.out.println(plec.readLine());

        launch();
    }
}