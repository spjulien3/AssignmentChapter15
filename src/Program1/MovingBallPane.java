package Program1;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class MovingBallPane extends Pane {
    private Circle ball;

    public MovingBallPane() {
        this.ball = new Circle(0,0,10);
    }

    public MovingBallPane(double centerX, double centerY, double radius){
        this.ball = new Circle(centerX,centerY,radius);
        getChildren().add(ball);
    }
    public void moveUp() {

        ball.setCenterY(ball.getCenterY() - 10);
    }
    public void moveDown() {

        ball.setCenterY(ball.getCenterY() + 10);
    }
    public void moveLeft(){

        ball.setCenterX(ball.getCenterX()-10);
    }
    public void moveRight(){

        ball.setCenterX(ball.getCenterX()+10);
    }

}
