package fr.liaud1u.javafxpotatoes.controller;

import fr.liaud1u.javafxpotatoes.PotatoesApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PotatoesController {

    @FXML
    public void openAddPotatoView(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PotatoesApplication.class.getResource("addPotato.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Ajouter une variété");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openUpdatePotatoView(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PotatoesApplication.class.getResource("updatePotato.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Mettre à jour une variété");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openDeletePotatoView(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PotatoesApplication.class.getResource("deletePotato.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Supprimer une variété");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openSearchPotatoView(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PotatoesApplication.class.getResource("getPotato.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Rechercher une variété");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}