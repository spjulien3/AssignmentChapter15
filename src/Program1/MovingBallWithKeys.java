package Program1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;
import java.beans.EventHandler;

public class MovingBallWithKeys extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        MovingBallPane ballPane = new MovingBallPane(200,200,10);


        Button leftButton = new Button("left");
        leftButton.setOnAction(e -> ballPane.moveLeft());
        Button rightButton = new Button("right");
        rightButton.setOnAction(e -> ballPane.moveRight());
        HBox buttons = new HBox(leftButton,rightButton);

        BorderPane pane = new BorderPane();
        pane.setBottom(buttons);
        pane.setCenter(ballPane);
        Scene scene = new Scene(pane,400,400);
        scene.setOnKeyPressed(event -> {
            if(event.getCode()== KeyCode.UP){
                ballPane.moveUp();
            }
            if(event.getCode()== KeyCode.DOWN){
                ballPane.moveDown();
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
