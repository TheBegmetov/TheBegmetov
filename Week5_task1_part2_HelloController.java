package t1.task1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Week5_task1_part2_HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}