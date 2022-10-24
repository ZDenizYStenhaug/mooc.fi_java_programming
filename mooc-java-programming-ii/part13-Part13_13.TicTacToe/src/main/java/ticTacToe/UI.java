/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author mrlemon
 */
public class UI {
    
    private boolean xTurn;
    private Label text;
    private Button[][] buttons;
    private boolean endGame;
    
    public UI() {
        xTurn = true;
        text = new Label("Turn: X");
        buttons = createButtons();
        endGame = false;
    }
    
    public Button createButton() {
        Button button = new Button(" ");
        button.setFont(Font.font("Monospaced", 40));
        button.setOnAction((event) -> {
            if (!button.getText().equals(" ")) {
            } else if (xTurn) {
                button.setText("X");
                text.setText("Turn: O");
                xTurn = false;
            } else {
                button.setText("O");
                text.setText("Turn: X");
                xTurn = true;
            }
            // check if game is finished
            if (isGameFinished()) {
                text.setText("The end!");
            }
        });
        return button;
    }
    
    private boolean isGameFinished() {
        // check for rows
        for (int y = 0; y < 3; y++) {
            if (buttons[0][y].getText().equals(" ")) {
                continue;
            }
            if (buttons[0][y].getText().equals(buttons[1][y].getText()) &&
                buttons[0][y].getText().equals(buttons[2][y].getText())) {
                return true;
            }
        }
        // check for columns 
        for (int x = 0; x < 3; x++) {
            if (buttons[x][0].getText().equals(" ")) {
                continue;
            }
            if (buttons[x][0].getText().equals(buttons[x][1].getText()) &&
                buttons[x][0].getText().equals(buttons[x][2].getText())) {
                return true;
            }
        }
        // check for diagonals
        if (!buttons[0][0].getText().equals(" ")) {
            if (buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[0][0].getText().equals(buttons[2][2].getText())) {
            return true;
            }
        }
        
        if (!buttons[2][0].getText().equals(" ")) {
            if (buttons[2][0].getText().equals(buttons[1][1].getText()) &&
            buttons[2][0].getText().equals(buttons[0][2].getText())) {
            return true;
            }
        }
        return false;
    }
    
    private Button[][] createButtons() {
        buttons = new Button[3][3];
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                buttons[i][k] = createButton();
            }
        }
        return buttons;
    }
    
    private GridPane drawButtons() {
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                gp.add(buttons[i][k], i, k);
            }
        }
        return gp;
    }
    
    public Parent getView() {
        BorderPane layout = new BorderPane();
        layout.setPrefSize(310, 350);
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        
        text.setFont(new Font(30));
        layout.setTop(text);
        layout.setCenter(drawButtons());
        return layout;
    }
    
}
