package monopoly.monopoly.exemple;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuSelectionPersonnage {

    @FXML
    private Button buttonValider;

    @FXML
    private TextField choixPseudo;

    public void validerFormulaire(MouseEvent mouseEvent) {
        System.out.println(choixPseudo.getText());
        Node source = (Node)  mouseEvent.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(Client.class.getResource("plateau.fxml"));
            Parent root1 = (Parent) fxmlLoader2.load();
            Stage stage2 = new Stage();
            stage2.setScene(new Scene(root1));
            stage2.show();

            //Ajout de la page en attente des autres joueurs
            Stage dialog = new Stage();
            dialog.initOwner(stage);
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.showAndWait();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
