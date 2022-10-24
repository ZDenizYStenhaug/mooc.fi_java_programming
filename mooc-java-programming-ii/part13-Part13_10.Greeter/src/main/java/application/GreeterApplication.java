package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        Label text = new Label("Enter your name and start.");
        TextField field = new TextField();
        Button startButt = new Button("Start");
        
        GridPane layout1 = new GridPane();
        layout1.add(text, 0, 0);
        layout1.add(field, 0, 1);
        layout1.add(startButt, 0, 2);
                
        // 1.3 styling the layout
        layout1.setPrefSize(300, 180);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
                
        Scene formScene = new Scene(layout1);
        
        startButt.setOnAction((event) -> {
            String name = field.getText();
            BorderPane layout2 = new BorderPane();
            Label greeting = new Label("Welcome " + name + "!");
            layout2.setCenter(greeting);
            Scene greetingScene = new Scene(layout2);
            window.setScene(greetingScene);
        }); 
        
        window.setScene(formScene);
        window.show();
        
    }
    
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
