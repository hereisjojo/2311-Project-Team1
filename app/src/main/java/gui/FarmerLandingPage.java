package gui;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FarmerLandingPage {
	public FarmerLandingPage(Stage stage) {
		Scene userLandingScene = new Scene(new Group(), 500, 450);
		stage.setScene(userLandingScene);
		stage.setTitle("Farmer Landing Page");
		GridPane grid = new GridPane();
		Text sceneTitle = new Text("Welcome Farmer");
		sceneTitle.setFill(javafx.scene.paint.Color.GREEN);
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(sceneTitle, 0, 0, 2, 1);
		Scene scene = new Scene(grid, 500, 450);
		stage.setScene(scene);
		stage.show();
	}

}
