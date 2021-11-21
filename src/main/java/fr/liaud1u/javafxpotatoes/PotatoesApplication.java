package fr.liaud1u.javafxpotatoes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class PotatoesApplication extends Application {

    private static PotatoesApplication instance;

    private Client client =  ClientBuilder.newClient();

    public static PotatoesApplication getInstance() {
        return instance;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void start(Stage stage) throws IOException {
        instance = this;
        FXMLLoader fxmlLoader = new FXMLLoader(PotatoesApplication.class.getResource("potatoes.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Gestion des variétés de Pdt");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}