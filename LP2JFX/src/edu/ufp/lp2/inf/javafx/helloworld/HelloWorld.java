package edu.ufp.lp2.inf.javafx.helloworld;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //The root node contains one child node (a button control), associated with
        //an event handler to print a message when the button is pressed
        Button btn = new Button();
        btn.setText("Say 'Hello World'");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello World!");
                Logger.getAnonymousLogger().log(Level.INFO, event.getEventType() + " on handler() (set by setOnAction() method)!!");
            }
        });

        btn.addEventHandler(ActionEvent.ACTION, (evt) -> {
            Logger.getAnonymousLogger().log(Level.INFO, evt.getEventType() + " on handler() (set by addEventHandler() method)!!");
        });

        //Set handler via convenience method
        btn.setOnMouseClicked((evt) -> {
            System.out.println(evt.getEventType() + " on handler (set by setOnMouseClicked() method)!");
        });

        //Set handler via add method
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, (evt) -> {
            System.out.println(evt.getEventType() + " on handler (set by addEventHandler() method)!");
        });


        //Assemble the gragh
        // Create the root node => StackPane
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
