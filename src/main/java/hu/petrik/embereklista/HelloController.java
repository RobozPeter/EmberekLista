package hu.petrik.embereklista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class HelloController {

    @FXML
    private ListView<Ember> emberek;

    public void initialize() {
        emberek.getItems().add(new Ember("Teszt Elek", 33));
        emberek.getItems().add(new Ember("Jane Doe", 31));
        emberek.getItems().add(new Ember("Jack Doe", 2));
    }
}
