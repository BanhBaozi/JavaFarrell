package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Main extends Application {

    private SequentialTransition sequentialTransition;

    @Override
    public void start(Stage primaryStage){ //Then, set the stage by setting the title, adding a Group, and background color by replacing the existing default start() method.
        primaryStage.setTitle("Using JavaFX to Use Transition and Timeline Animation");
        final Scene scene = new Scene(new Group(), 600, 400);
        scene.setFill(Color.CADETBLUE);

        //creates a circle and a rectangle

        final Circle circ = new Circle(50);

        circ.setFill(Color.RED);
        Rectangle rec = new Rectangle(25,25,50,50);
        rec.setArcHeight(25);
        rec.setArcWidth(15);
        rec.setFill(Color.BLANCHEDALMOND);
        rec.setTranslateX(250);
        rec.setTranslateY(50);
        ((Group)scene.getRoot()).getChildren().addAll(circ, rec);
        primaryStage.setScene(scene);
        primaryStage.show();

        // instantiate the Timeline class
        // Set the CycleCount to indefinite, which allows the application to run until the User exits the program.
        //Assigning true to the setAutoReverse property causes the application to reverse after the application has completed a cycle.
        //KeyValues and KeyFrames set the direction and duration of the circle object.
        //The play() method tells the application to play the animation.

        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        final KeyValue kv = new
                KeyValue(circ.centerYProperty(), 500, Interpolator.EASE_BOTH);
        final KeyFrame kf = new KeyFrame(Duration.millis(5000), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();

        //create a fade transition for the rectangle.

        FadeTransition ft = new FadeTransition(Duration.millis(3000), rec);

        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        FadeTransition fadeTransition =
                new FadeTransition(Duration.millis(1000), rec);
        fadeTransition.setFromValue(1.0f);
        fadeTransition.setToValue(0.3f);
        fadeTransition.setCycleCount(1);
        fadeTransition.setAutoReverse(true);


        //The path transition code sets the path of the circle, and sets it up to play.
        // The MoveTo() and CubicCurveTo() methods use coordinates to move the circle in the desired path.
        // This is possible because a Group container was used.


        Path path = new Path();

        path.getElements().add(new MoveTo(20,20));
        path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(path);
        pathTransition.setNode(circ);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();

        //The next statements animate the rectangle.
        // The rectangle will move sideways along the X axis.

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(2000), rec);
        translateTransition.setFromX(50);
        translateTransition.setToX(375);
        translateTransition.setCycleCount(1);
        translateTransition.setAutoReverse(true);

        //These statements rotate the triangle.

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(2000), rec);
        rotateTransition.setByAngle(180f);
        rotateTransition.setCycleCount(4);
        rotateTransition.setAutoReverse(true);

        //These statement enable the scale transition

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(2000), rec);
        scaleTransition.setFromX(1);
        scaleTransition.setFromY(1);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setCycleCount(1);
        scaleTransition.setAutoReverse(true);

        //The final section of code simply sets the sequential order of the animation.

        sequentialTransition = new SequentialTransition();

        sequentialTransition.getChildren().addAll(
                fadeTransition,
                translateTransition,
                rotateTransition,
                scaleTransition);

        sequentialTransition.setCycleCount(Timeline.INDEFINITE);
        sequentialTransition.setAutoReverse(true);
        sequentialTransition.play();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
