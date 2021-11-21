package fr.liaud1u.javafxpotatoes.controller;

import fr.liaud1u.javafxpotatoes.Potato;
import fr.liaud1u.javafxpotatoes.PotatoesApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;

public class UpdatePotatoController {

    @FXML
    private TextField id;

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
    public void update(ActionEvent actionEvent) {
        Potato potato = new Potato(variety.getText(),description.getText(),"","","",colourSkin.getText(),colourFlesh.getText(),"","",height.getText(),colourFlower.getText());
        PotatoesApplication.getInstance().getClient()
                .target("http://localhost:8060/Potato/")
                .path("{id}")
                .resolveTemplate("id", id.getText())
                .request(MediaType.APPLICATION_JSON)
                .put(Entity.json(potato));

    }

    @FXML
    public void get(ActionEvent actionEvent) {
        Potato potato;

        potato = PotatoesApplication.getInstance().getClient()
                .target("http://localhost:8060/Potato/")
                .path(id.getText())
                .request(MediaType.APPLICATION_JSON)
                .get(Potato.class);


        variety.setText(potato.getVarietyName());
        description.setText(potato.getDescription());
        colourSkin.setText(potato.getColourOfSkin());
        colourFlesh.setText(potato.getColourOfFlesh());
        colourFlower.setText(potato.getColourOfFlower());
        height.setText(potato.getHeight());
    }
}
