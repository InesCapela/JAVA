package edu.ufp.lp2.inf.javafx.login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The GUI may be built programmatically or by combining CSS (cascade style sheets) and xml (fxml).
 * <p>
 * It is also possible to use only CSS over inline code styles, separating the design from the content.
 * That will be easier for a designer to have control over the styles without having to modify content.
 * <p>
 * Use style classes (e.g. .label, .button, etc.) to define the look of all its associated components.
 * Alternatively, create IDs for each component node (e.g. setID("#welcome-text") method of the Node class)
 * and define its properties in the css file.
 */
public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Login");

        //The scene is created with the GridPane as the root node
        //It will have 6 2 cols and 6 rows
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //Set gap between components (horizontal and vertical)
        grid.setHgap(10);
        grid.setVgap(10);
        //Set padding (space around an element's content)
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Text that cannot be edited
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        // ============ Set id to be able to apply style ============
        scenetitle.setId("welcome-text");
        //Add scenetitle to col=0, row=1, spanning 2 cols and 1 row
        grid.add(scenetitle, 0, 0, 2, 1);

        //Label for username
        Label lableUsername = new Label("User Name:");
        //Add lableUsername to col=0, row=1
        grid.add(lableUsername, 0, 1);

        //Create Text for username
        TextField userTextField = new TextField();
        //Add userTextField to col=1, row=1
        grid.add(userTextField, 1, 1);

        Label labelPasswd = new Label("Password:");
        //Add labelPasswd to col=0, row=2
        grid.add(labelPasswd, 0, 2);

        PasswordField passwordField = new PasswordField();
        //Add passwordField to col=1, row=2
        grid.add(passwordField, 1, 2);

        //Button for submitting login
        Button btnSignIn = new Button("Sign in");
        HBox hboxForBtn = new HBox(10);
        hboxForBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hboxForBtn.getChildren().add(btnSignIn);
        //Add hboxForBtn to col=1, row=4
        grid.add(hboxForBtn, 1, 4);

        final Text textActionTarget = new Text();
        //Add textActionTarget to col=1, row 6
        grid.add(textActionTarget, 1, 6);

        //Handle the btn event with convenience method
        /* btnSignIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //actiontarget.setFill(Color.FIREBRICK);
                textActionTarget.setId("actiontarget-text");
                textActionTarget.setText("Sign in button pressed");
                Logger.getAnonymousLogger().log(Level.INFO, "Sign in button pressed");
            }
        });*/

        //Handle the btn event with convenience method
        //Use lambda function to handle btnSignIn action events
        btnSignIn.setOnAction((e) -> {
            //actiontarget.setFill(Color.FIREBRICK);
            // ============ Set id to be able to apply style ============
            //textActionTarget.setId("actiontarget-text");
            textActionTarget.setText("Sign in button pressed");
            Logger.getAnonymousLogger().log(Level.INFO, e.getEventType() + ": Sign in button pressed");
        });

        primaryStage.setOnCloseRequest((e) -> {
            Logger.getAnonymousLogger().log(Level.INFO, e.getEventType() + ": window closing...");
        });

        /*
         * ================================================================================
         * The JavaFX Stage class is the top-level JavaFX container.
         * The JavaFX Scene class is the container for all content.
         * The content of the scene is represented as a hierarchical scene graph of nodes.
         * ================================================================================
         */
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        //Load the CSS for the scene
        scene.getStylesheets().add(Login.class.getResource("login.css").toExternalForm());
        //Show the Login gui
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
