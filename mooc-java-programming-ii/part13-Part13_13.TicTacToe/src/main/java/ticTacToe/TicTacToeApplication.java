package ticTacToe;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {
    
    @Override
    public void start(Stage window) {
        UI ui = new UI();
        Parent layout = ui.getView();
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
