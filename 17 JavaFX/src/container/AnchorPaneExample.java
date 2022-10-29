package container;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AnchorPaneExample {

	public void AnchorPaneTest(Stage primaryStage) {

		AnchorPane anchorPane = new AnchorPane();

		VBox box1 = new VBox();
		anchorPane.setTopAnchor(box1, 0.0);
		anchorPane.setLeftAnchor(box1, 0.0);
		box1.prefHeight(100);
		box1.prefWidth(100);
		box1.setStyle("-fx-background-color: red;");

		VBox box2 = new VBox();
		box2.setLayoutX(100);
		box2.setLayoutY(100);
		box2.prefHeight(100);
		box2.prefWidth(100);
		box2.setStyle("-fx-background-color: blue;");

		VBox box3 = new VBox();
		box3.setLayoutX(200);
		box3.setLayoutY(200);
		box3.prefHeight(100);
		box3.prefWidth(100);
		box3.setStyle("-fx-background-color: green;");

		anchorPane.getChildren().addAll(box1, box2, box3);

		Scene scene = new Scene(anchorPane, 300, 300);
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(primaryStage);
		stage.setScene(scene);
		stage.show();
	}
}
