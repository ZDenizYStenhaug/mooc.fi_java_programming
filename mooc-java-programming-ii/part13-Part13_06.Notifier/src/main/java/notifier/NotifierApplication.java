package notifier;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        final TextField field = new TextField();
        Button button = new Button("Update");
        final Label text = new Label();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setText(field.getText());
            }
        });
        VBox cg = new VBox();
        cg.getChildren().addAll(field, button, text);
        Scene scene = new Scene(cg);

        window.setScene(scene);
        window.show();

        
    }
    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
