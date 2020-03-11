package scrable;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

 
public class Testjfx extends Application{
	//faudra changer de verison sur java ou javafx

	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage a) throws Exception {
		a.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        a.setScene(new Scene(root, 300, 250));
        a.show();
		
	}

}
