package t1.task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gp= new GridPane();
        for(int i = 0;i<3;i++){
            for(int j = 0 ; j< 3;j++){
                if((int)(Math.random()*10)%2==1)
                    gp.add(new ImageView(new Image("C:\\Users\\Acer\\Desktop\\phw\\week5\\task1\\src\\main\\resources\\t1\\task1\\o.png",50,50,false,false)),i,j);
                else
                    gp.add(new ImageView(new Image("C:\\Users\\Acer\\Desktop\\phw\\week5\\task1\\src\\main\\resources\\t1\\task1\\x.png",50,50,false,false)),i,j);
            }
        }
        gp.setAlignment(Pos.CENTER);
        Scene scene = new Scene(gp, 320, 240);
        stage.setTitle(" Task 1 ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
