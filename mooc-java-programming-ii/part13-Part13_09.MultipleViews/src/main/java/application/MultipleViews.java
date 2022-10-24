package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public void start(Stage window) {
        
        Button firstToSecond = new Button("To the second view!");
        Button secondToThird = new Button("To the third view!");
        Button thirdToFirst = new Button("To the first view!");
        
        Label firstText = new Label("First view!");
        Label secondText = new Label("Second view!");
        Label thirdText = new Label("Third view!");
        
        BorderPane layout1 = new BorderPane();
        layout1.setTop(firstText);
        layout1.setCenter(firstToSecond);
        
        VBox layout2 = new VBox();
        layout2.getChildren().addAll(secondToThird, secondText);
        
        GridPane layout3 = new GridPane();
        layout3.add(thirdText, 0, 0);
        layout3.add(thirdToFirst, 1, 1);
        
        Scene first = new Scene(layout1);
        Scene second = new Scene(layout2);
        Scene third = new Scene(layout3);
        
        firstToSecond.setOnAction((event) -> {
                window.setScene(second);
        });
        secondToThird.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(third);
            }
        }); 
        thirdToFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(first);
            }
        });
        
        window.setScene(first);
        window.show();
        
    }
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
