package Program2;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBuilder;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;


public class Airplane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {



        Pane pane = new Pane();

        double X2 = 200;
        double Y2 = 200;
        ImageView airplane = new ImageView(new Image(new FileInputStream("209087.png")));
        Line line = new Line();

        double X = 300;
        double Y = 300;
        line.setStartX(X);
        line.setStartY(Y);
        line.setEndX(X+400);
        line.setEndY(Y+400);
        //slope is at -1 so the angle of a landing is at 45 degrees

        line.setStroke(Color.TRANSPARENT);


        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(8000));
        pt.setPath(line);

        pt.setNode(airplane);
        pt.play();

        Button pause = new Button("Pause");
        pause.setOnAction(e-> pt.pause());

        Button resume = new Button("Resume");
        resume.setOnAction(e-> pt.play());

        HBox hBox= new HBox(pause,resume);
        pane.getChildren().addAll(line,airplane,hBox);

        Scene scene = new Scene(pane,800,800);
        primaryStage.setScene(scene);
        primaryStage.show();




    }
}
