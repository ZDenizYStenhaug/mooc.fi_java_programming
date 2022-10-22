package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {
    
    @Override
    public void start(Stage window) {
        Button button = new Button("This be a button.");
        Label text= new Label("this be text");
        
        FlowPane cg = new FlowPane();
        cg.getChildren().add(text);
        cg.getChildren().add(button);
        
        Scene view = new Scene(cg);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
