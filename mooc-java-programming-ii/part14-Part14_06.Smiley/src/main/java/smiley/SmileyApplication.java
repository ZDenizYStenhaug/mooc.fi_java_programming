package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        painter.setFill(Color.BLACK);
        painter.fillRect(150, 150, 50, 50);
        painter.fillRect(400, 150, 50, 50);
        painter.fillRect(150, 380, 300, 50);
        painter.fillRect(100, 330, 50, 50);
        painter.fillRect(450, 330, 50, 50);
        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
