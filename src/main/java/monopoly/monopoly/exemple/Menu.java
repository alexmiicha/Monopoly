package monopoly.monopoly.exemple;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class Menu{

    @FXML
    private ChoiceBox test;

    public void testClick(MouseEvent mouseEvent) {
        System.out.println(test.getValue());
        Node source = (Node)  mouseEvent.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(Client.class.getResource("menuSelectionPersonnage.fxml"));
            Parent root1 = (Parent) fxmlLoader2.load();
            Stage stage2 = new Stage();
            stage2.setScene(new Scene(root1));
            stage2.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize(){
        test.setValue(2);
    }
}
