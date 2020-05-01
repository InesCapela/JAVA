package edu.ufp.lp2.inf.javafx.figgeodraw;

import javafx.application.Application;

import javafx.event.EventTarget;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DrawCircles extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group rootGroup = new Group();
        Scene scene = new Scene(rootGroup, 800, 600, Color.GRAY);
        primaryStage.setScene(scene);

        //Add circles to the circlesGroup
/*        Group circlesGroup = new Group();
        for (int i = 0; i < 3; i++) {
            Circle circle = new Circle(150, Color.web("blue", 0.05));
            circle.setStrokeType(StrokeType.OUTSIDE);
            circle.setStroke(Color.web("white", 0.16));
            circle.setStrokeWidth(4);
            circlesGroup.getChildren().add(circle);
        }
        rootGroup.getChildren().add(circlesGroup);*/
        //These events will be generated/handled by the scene itself
        scene.addEventFilter(MouseEvent.MOUSE_RELEASED, evtScene -> {
            double centerX = evtScene.getSceneX();
            double centerY = evtScene.getSceneY();
            Logger.getAnonymousLogger().log(Level.INFO, "Mouse released on scene: (" + centerX + ", " + centerY + ")");
            Circle c = new Circle(centerX, centerY, 10);
            c.setFill(Color.BLUE);
            String id = "" + rootGroup.getChildren().size();
            c.setId(id);
            Logger.getAnonymousLogger().log(Level.INFO, "Create circle id=" + c.getId());
            rootGroup.getChildren().add(c);

            //These events will be generated/handled by EACH circle
            c.addEventFilter(MouseEvent.MOUSE_RELEASED, (evtCircle) -> {
                EventTarget evtCircleTarget = evtCircle.getTarget();
                if (evtCircleTarget instanceof Circle) {
                    Circle circleTarget = (Circle) evtCircleTarget;
                    Color circleTargetColor = (Color) circleTarget.getFill();
                    Logger.getAnonymousLogger().log(Level.INFO, "Mouse released on circle: id=" + circleTarget.getId() + "; color=" + circleTargetColor);

                    if (c.getFill().equals(circleTargetColor)) {
                        circleTarget.setFill(Color.WHITE);
                        Logger.getAnonymousLogger().log(Level.INFO, "Mouse released on circle: id=" + circleTarget.getId() + "; change color=" + circleTarget.getFill().toString());
                        //If setting c circle color here, it will only change on next click on c circle
                        //c.setFill(Color.WHITE);
                    }
                }

            });


            //Prevent event to be consumed by dispatch chain nodes inside rootGroup or afterwards inside circlesGroup
            //evtScene.consume();
        });

        //Show interface
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
