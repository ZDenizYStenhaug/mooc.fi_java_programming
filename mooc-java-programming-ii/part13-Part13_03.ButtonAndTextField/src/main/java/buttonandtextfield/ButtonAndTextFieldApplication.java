package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;


public class ButtonAndTextFieldApplication extends Application {
    
    @Override
    public void start(Stage window) {
        Button button  = new Button("this be button");
        TextField text = new TextField("this be text");
        
        FlowPane cg = new FlowPane();
        cg.getChildren().add(button);
        cg.getChildren().add(text);
        
        Scene view = new Scene(cg);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
