package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        TextArea ta = new TextArea();
        final Label letters = new Label("Letters: 0");
        final Label words = new Label("Words: 0");
        final Label longestWord = new Label("The longest word is: ");
        
        ta.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> change, String oldValue, String newValue) {
                letters.setText("Letters: " + newValue.length());
                String[] parts = newValue.split(" ");
                words.setText("Words: " + parts.length);
                String longest = "";
                for (int i = 0; i < parts.length; i++) {
                     if (parts[i].length() > longest.length()) {
                         longest = parts[i];
                     }
                }
                longestWord.setText("The longest word is: " + longest);
            }
        });
        
        layout.setCenter(ta);
        
        HBox texts = new HBox();
        texts.setSpacing(5);
        texts.getChildren().add(letters);
        texts.getChildren().add(words);
        texts.getChildren().add(longestWord);
        
        layout.setBottom(texts);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
    }

}
