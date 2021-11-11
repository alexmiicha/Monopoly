module monopoly.monopoly {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens monopoly.monopoly.exemple to javafx.graphics;
    exports monopoly.monopoly.exemple;

    opens monopoly.monopoly.jeu to javafx.graphics;
    exports monopoly.monopoly.jeu;

    opens monopoly.monopoly.test to javafx.graphics;
    exports monopoly.monopoly.test;

    opens monopoly.monopoly.plateau.scenes to javafx.graphics;
    exports monopoly.monopoly.plateau.scenes;

    opens monopoly.monopoly.plateau.controllers to javafx.fxml;
    exports monopoly.monopoly.plateau.controllers;

}