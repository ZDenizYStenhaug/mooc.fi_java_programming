package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {
        Button jokeButt = new Button("Joke");
        Button answerButt = new Button("Answer");
        Button explanationButt = new Button("Explanation");
        
        String jokeText = "What do you call a bear with no teeth?";
        String answerText = "A gummy bear.";
        String explanationText = "gummies don't have sharpies..";
        
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        menu.getChildren().addAll(jokeButt, answerButt, explanationButt);
        
        
        jokeButt.setOnAction((event) -> layout.setCenter(createView(jokeText)));
        answerButt.setOnAction((event) -> layout.setCenter(createView(answerText)));
        explanationButt.setOnAction((event) -> layout.setCenter(createView(explanationText)));
        
        layout.setTop(menu);
        layout.setCenter(createView(jokeText));
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
    }
    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(100, 200);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }
    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
