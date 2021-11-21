package fr.liaud1u.javafxpotatoes.controller;

import fr.liaud1u.javafxpotatoes.Potato;
import fr.liaud1u.javafxpotatoes.PotatoesApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class AddPotatoController {

    @FXML
    private TextField variety;

    @FXML
    private TextField description;

    @FXML
    private TextField colourSkin;

    @FXML
    private TextField colourFlesh;

    @FXML
    private TextField colourFlower;

    @FXML
    private TextField height;

    @FXML
    public void add(ActionEvent actionEvent) {

        Potato potato = new Potato(variety.getText(),description.getText(),"","","",colourSkin.getText(),colourFlesh.getText(),"","",height.getText(),colourFlower.getText());
        PotatoesApplication.getInstance().getClient()
                .target("http://localhost:8060/Potato/")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.json(potato));

    }
}
