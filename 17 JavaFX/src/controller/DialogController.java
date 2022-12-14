package controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DialogController implements Initializable {

	@FXML
	private Button btnPopup;
	@FXML
	private Button btnCustom;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	private Stage primaryStage;

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	// 파일 열기 다이얼로그 실행
	public void handleOpenFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"),
				new ExtensionFilter("Image Files", "*.png", "*.jpg", "*jpg"),
				new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"), new ExtensionFilter("All Files", "*.*"));

		File selectedFile = fileChooser.showOpenDialog(primaryStage);
		if (selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}

	// 파일 저장 다이얼로그 실행
	public void handleSaveFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().add(new ExtensionFilter("All Files", "*.*"));
		File selectedFile = fileChooser.showSaveDialog(primaryStage);
		if (selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}

	// 디렉토리 선택 다이얼로그 실행
	public void handleDirectoryChooser(ActionEvent e) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDir = directoryChooser.showDialog(primaryStage);
		if (selectedDir != null) {
			System.out.println(selectedDir.getPath());
		}
	}

	// 팝업 선택 다이얼로그 실행
	public void handlePopup(ActionEvent e) throws Exception {
		Popup popup = new Popup();

		HBox hbox = (HBox) FXMLLoader.load(getClass().getResource("../dialog/Popup.fxml"));

		ImageView imageView = (ImageView) hbox.lookup("#imgMessage");

		imageView.setImage(new Image(getClass().getResource("../images/aqua1.gif").toString()));
		imageView.setOnMouseClicked(event -> popup.hide());

		Label lblMessage = (Label) hbox.lookup("#lblMessage");
		lblMessage.setText("메시지가 왔습니다.");
		
		System.out.println("test");
		popup.getContent().add(hbox);
		popup.setAutoHide(true);
		popup.show(primaryStage);
	}

	// 커스텀 다이얼로그 실행
	public void handleCustom(ActionEvent e) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("확인");

		AnchorPane anchorPane = (AnchorPane) FXMLLoader.load(getClass().getResource("../dialog/CustomDialog.fxml"));
		Label txtTitle = (Label) anchorPane.lookup("#txtTitle");
		txtTitle.setText("확인하셨습니까?");
		Button btnOk = (Button) anchorPane.lookup("#btnOk");
		btnOk.setOnAction(event -> dialog.close());

		Scene scene = new Scene(anchorPane);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();

	}

}
