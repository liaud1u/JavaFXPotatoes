module fr.liaud1u.javafxbibliotheque {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.ws.rs;


    opens fr.liaud1u.javafxpotatoes;
    exports fr.liaud1u.javafxpotatoes;
    exports fr.liaud1u.javafxpotatoes.controller;
    opens fr.liaud1u.javafxpotatoes.controller;
}