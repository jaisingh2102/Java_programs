import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {

        // Controls
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Submit");
        Label result = new Label();

        // Event Handling
        button.setOnAction(e -> {
            String name = textField.getText();
            result.setText("Hello, " + name + "!");
        });

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(label, textField, button, result);

        // Scene
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("JavaFX Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}