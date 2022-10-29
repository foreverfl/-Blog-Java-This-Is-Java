package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Character;

public class ViewControlExampleController implements Initializable {

	@FXML
	private ListView<String> listView;
	@FXML
	private TableView<Character> tableView;
	@FXML
	private ImageView imageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(FXCollections.observableArrayList("아쿠아", "치토리", "히후미", "없음", "없음", "없음", "없음"));

		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// 변경된 인덱스의 행 선택
				tableView.getSelectionModel().select(newValue.intValue());

				// 변경된 인덱스 위치로 스크롤
				tableView.scrollTo(newValue.intValue());

			}

		});

		ObservableList<Character> characterList = FXCollections.observableArrayList(

				new Character("아쿠아", "aqua1.gif"), new Character("치토리", "chidori1.png"),
				new Character("히후미", "exit.jpg"), new Character("없음", ""), new Character("없음", ""),
				new Character("없음", ""), new Character("없음", ""));

		TableColumn tcCharacter = tableView.getColumns().get(0);
		tcCharacter.setCellValueFactory(new PropertyValueFactory("character"));
		tcCharacter.setStyle("-fx-alignmnet: CENTER");

		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER");

		tableView.setItems(characterList);

		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Character>() {

			@Override
			public void changed(ObservableValue<? extends Character> observable, Character oldValue,
					Character newValue) {
				if (newValue != null) {
					imageView
							.setImage(new Image(getClass().getResource("../images/" + newValue.getImage()).toString()));

				}

			}

		});
	}

	public void handleBtnOkAction(ActionEvent e) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView 캐릭터: " + item);

		Character character = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView 캐릭터: " + character.getCharacter());
		System.out.println("ImageView 캐릭터: " + character.getImage());
	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}

}
