package fr.liaud1u.javafxpotatoes.controller;

import fr.liaud1u.javafxpotatoes.PotatoesApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.ws.rs.core.MediaType;

public class DeletePotatoController {

    @FXML
    private TextField id;

    @FXML
    public void delete(ActionEvent actionEvent) {
        PotatoesApplication.getInstance().getClient()
                .target("http://localhost:8060/Potato/")
                .path(id.getText())
                .request(MediaType.APPLICATION_JSON)
                .delete();

       id.setText("");
    }
}
