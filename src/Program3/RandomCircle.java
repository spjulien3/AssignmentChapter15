package Program3;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.beans.EventHandler;
import java.util.Random;

public class RandomCircle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle c = new Circle(200,200,20);


        c.setRadius(20);
        c.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        c.setOnMouseClicked(e -> circleUpdate(c));
        pane.getChildren().add(c);
        Scene scene = new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
    public void circleUpdate(Circle c){
        Random random = new Random();
        c.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        c.setCenterX(random.nextInt(400));
        c.setCenterY(random.nextInt(400));


    }

}
