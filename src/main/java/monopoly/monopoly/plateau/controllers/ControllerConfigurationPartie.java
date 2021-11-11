package monopoly.monopoly.plateau.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import monopoly.monopoly.exemple.Client;

public class ControllerConfigurationPartie {

    @FXML
    private ChoiceBox choixNombreJoueur;

    public void validerFormulaire(MouseEvent mouseEvent) {
        System.out.println(choixNombreJoueur.getValue());
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
        choixNombreJoueur.setValue(2);
    }
}



