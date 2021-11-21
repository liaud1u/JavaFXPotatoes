package fr.liaud1u.javafxpotatoes.controller;

import fr.liaud1u.javafxpotatoes.Potato;
import fr.liaud1u.javafxpotatoes.PotatoesApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.ws.rs.core.MediaType;
import java.util.Arrays;

public class GetPotatoController {

    @FXML
    private TextField id;

    @FXML
    private Label variety;

    @FXML
    private Label description;

    @FXML
    private Label colourSkin;

    @FXML
    private Label colourFlesh;

    @FXML
    private Label colourFlower;

    @FXML
    private Label height;


    @FXML
    public void recherche(ActionEvent actionEvent) {
        Potato potato;

        potato = PotatoesApplication.getInstance().getClient()
                    .target("http://localhost:8060/Potato/")
                    .path(id.getText())
                    .request(MediaType.APPLICATION_JSON)
                    .get(Potato.class);


        if(potato!=null) {
            variety.setText(potato.getVarietyName());
            description.setText(potato.getDescription());
            colourSkin.setText(potato.getColourOfSkin());
            colourFlesh.setText(potato.getColourOfFlesh());
            colourFlower.setText(potato.getColourOfFlower());
            height.setText(potato.getHeight());
        }
    }

}
