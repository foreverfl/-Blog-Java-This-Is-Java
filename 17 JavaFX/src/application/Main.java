package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import container.AnchorPaneExample;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

	public Main() {
		System.out.println(Thread.currentThread().getName() + " → Main() 메소드");
	}

	@Override
	public void init() {
		System.out.println(Thread.currentThread().getName() + " → init() 메소드");
	}

	@Override
	public void start(Stage primaryStage) {
		System.out.println(Thread.currentThread().getName() + " → start() 메소드");
		try {

			VBox root = new VBox();
			root.setPadding(new Insets(10, 10, 10, 10));
			root.setSpacing(20);

			/*
			 * 이벤트
			 */
			Label eventTitle = new Label();
			eventTitle.setText("이벤트");
			eventTitle.setFont(new Font(20));

			HBox events = new HBox();
			events.setSpacing(10);

			// 이벤트 버튼1
			Button btn1 = new Button("버튼1");
			btn1.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					System.out.println("버튼1 클릭");
				}

			});

			events.getChildren().add(btn1);

			// 이벤트 버튼2
			Button btn2 = new Button("버튼2");
			btn2.setOnAction(event -> System.out.println("버튼2 클릭"));

			events.getChildren().add(btn2);

			root.getChildren().addAll(eventTitle, events);

			/*
			 * 컨테이너
			 */
			Label containerTitle = new Label();
			containerTitle.setText("컨테이너");
			containerTitle.setFont(new Font(20));

			VBox containers = new VBox();
			containers.setSpacing(10);

			// AnchorPane
			HBox anchorPanes = new HBox();
			anchorPanes.setSpacing(10);

			// AnchorPane with Java
			Button btnAnchorPaneJava = new Button("AnchorPane with Java");
			btnAnchorPaneJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					AnchorPaneExample anchorPaneExample = new AnchorPaneExample();
					anchorPaneExample.AnchorPaneTest(primaryStage);

				}
			});

			// AnchorPane with FXML
			Button btnAnchorPaneFXML = new Button("AnchorPane with FXML");
			btnAnchorPaneFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					try {
						URL fxmlPath = new File("src/container/AnchorPaneExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}

				}
			});

			anchorPanes.getChildren().addAll(btnAnchorPaneJava, btnAnchorPaneFXML);
			containers.getChildren().add(anchorPanes);

			// HBox and VBox
			HBox hBoxAndVBox = new HBox();
			hBoxAndVBox.setSpacing(10);
			// HBox and VBox with Java
			Button hBoxAndVBoxJava = new Button("HBox and VBox with Java");
			hBoxAndVBoxJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

				}
			});
			// HBox and VBox with FXML
			Button hBoxAndVBoxFXML = new Button("HBox and VBox with FXML");
			hBoxAndVBoxFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/container/HBoxAndVBoxExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});

			hBoxAndVBox.getChildren().addAll(hBoxAndVBoxJava, hBoxAndVBoxFXML);
			containers.getChildren().add(hBoxAndVBox);

			// BorderPane
			HBox borderPane = new HBox();
			borderPane.setSpacing(10);
			// BorderPane with Java
			Button borderPaneJava = new Button("BorderPane with Java");
			borderPaneJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

				}
			});

			// BorderPane with FXML
			Button borderPaneFXML = new Button("BorderPane with FXML");
			borderPaneFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/container/BorderPaneExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});

			borderPane.getChildren().addAll(borderPaneJava, borderPaneFXML);
			containers.getChildren().add(borderPane);

			// FlowPane
			HBox flowPane = new HBox();
			flowPane.setSpacing(10);
			// FlowPane with Java
			Button flowPaneJava = new Button("FlowPane with Java");
			flowPaneJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					System.out.println("FlowPane with Java");
				}
			});
			// FlowPane with FXML
			Button flowPaneFXML = new Button("FlowPane with FXML");
			flowPaneFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/container/FlowPaneExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});

			flowPane.getChildren().addAll(flowPaneJava, flowPaneFXML);
			containers.getChildren().add(flowPane);

			// TilePane
			HBox tilePane = new HBox();
			tilePane.setSpacing(10);
			// TilePane with Java
			Button tilePaneJava = new Button("TilePane with Java");
			tilePaneJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

				}
			});
			// TilePane with FXML
			Button tilePaneFXML = new Button("TilePane with FXML");
			tilePaneFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/container/TilePaneExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});

			tilePane.getChildren().addAll(tilePaneJava, tilePaneFXML);
			containers.getChildren().add(tilePane);

			// GridPane
			HBox gridPane = new HBox();
			gridPane.setSpacing(10);
			// GridPane with Java
			Button gridPaneJava = new Button("GridPane with Java");
			gridPaneJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

				}
			});
			// GridPane with FXML
			Button gridPaneFXML = new Button("GridPane with FXML");
			gridPaneFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

				}
			});

			gridPane.getChildren().addAll(gridPaneJava, gridPaneFXML);
			containers.getChildren().add(gridPane);

			root.getChildren().addAll(containerTitle, containers);

			/*
			 * id 사용
			 */
			Label usingIdTitle = new Label();
			usingIdTitle.setText("아이디 사용하기");
			usingIdTitle.setFont(new Font(20));

			HBox usingId = new HBox();
			usingId.setSpacing(10);

			// id 사용 예시
			Button btnUsingId = new Button("아이디 사용하기");
			btnUsingId.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/controllerExample/usingIdExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}

			});

			usingId.getChildren().add(btnUsingId);

			root.getChildren().addAll(usingIdTitle, usingId);

			/*
			 * 속성 감시와 바인딩
			 */
			Label observingAndBindingTitle = new Label();
			observingAndBindingTitle.setText("속성 감시와 바인딩");
			observingAndBindingTitle.setFont(new Font(20));

			HBox observingAndBinding = new HBox();
			observingAndBinding.setSpacing(10);

			// 속성 감시
			Button observing = new Button("속성 감시");
			observing.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/observingAndBinding/Observing.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}

			});

			// 바인딩
			Button binding = new Button("바인딩");
			binding.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/observingAndBinding/Binding.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}

			});

			// Bindings 클래스
			Button bindingsClass = new Button("바인딩 클래스");
			bindingsClass.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/observingAndBinding/BindingsClass.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}

			});

			observingAndBinding.getChildren().addAll(observing, binding, bindingsClass);

			root.getChildren().addAll(observingAndBindingTitle, observingAndBinding);

			/*
			 * 컨트롤
			 */
			Label controlTitle = new Label();
			controlTitle.setText("컨트롤");
			controlTitle.setFont(new Font(20));

			VBox controls = new VBox();
			controls.setSpacing(10);

			// 버튼 컨트롤
			HBox buttonControl = new HBox();
			buttonControl.setSpacing(10);

			// 버튼 컨트롤(자바)
			Button buttonControlJava = new Button("Button Control with Java");
			buttonControlJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});
			// 버튼 컨트롤(FXML)
			Button buttonControlFXML = new Button("Button Control with FXML");
			buttonControlFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/controllerExample/ButtonControlExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});

			buttonControl.getChildren().addAll(buttonControlJava, buttonControlFXML);

			controls.getChildren().add(buttonControl);

			// 입력 컨트롤
			HBox inputControl = new HBox();
			inputControl.setSpacing(10);

			// 입력 컨트롤(자바)
			Button inputControlJava = new Button("Input Control with Java");
			inputControlJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});
			// 입력 컨트롤(FXML)
			Button inputControlFXML = new Button("Input Control with FXML");
			inputControlFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/controllerExample/InputControlExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}

				}
			});

			inputControl.getChildren().addAll(inputControlJava, inputControlFXML);

			controls.getChildren().add(inputControl);

			// 뷰 컨트롤
			HBox viewControl = new HBox();
			viewControl.setSpacing(10);

			// 뷰 컨트롤(자바)
			Button viewControlJava = new Button("View Control with Java");
			viewControlJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});
			// 뷰 컨트롤(FXML)
			Button viewControlFXML = new Button("View Control with FXML");
			viewControlFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					try {
						URL fxmlPath = new File("src/controllerExample/ViewControlExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});

			viewControl.getChildren().addAll(viewControlJava, viewControlFXML);

			controls.getChildren().add(viewControl);

			// 미디어 컨트롤
			HBox mediaControl = new HBox();
			mediaControl.setSpacing(10);

			// 미디어 컨트롤(자바)
			Button mediaControlJava = new Button("Media Control with Java");
			mediaControlJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});
			// 미디어 컨트롤(FXML)
			Button mediaControlFXML = new Button("Media Control with FXML");
			mediaControlFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					try {
						URL fxmlPath = new File("src/controllerExample/MediaViewControlExample.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});

			mediaControl.getChildren().addAll(mediaControlJava, mediaControlFXML);

			controls.getChildren().add(mediaControl);

			// 차트 컨트롤
			HBox chartControl = new HBox();
			chartControl.setSpacing(10);

			// 차트 컨트롤(자바)
			Button chartControlJava = new Button("Chart Control with Java");
			chartControlJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});
			// 차트 컨트롤(FXML)
			Button chartControlFXML = new Button("Chart Control with FXML");
			chartControlFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});

			chartControl.getChildren().addAll(chartControlJava, chartControlFXML);

			controls.getChildren().add(chartControl);

			root.getChildren().addAll(controlTitle, controls);

			/*
			 * 메뉴바와 툴바
			 */
			Label menubarAndToolbarTitle = new Label();
			menubarAndToolbarTitle.setText("메뉴바와 툴바");
			menubarAndToolbarTitle.setFont(new Font(20));

			// 예시
			HBox menubarAndToolbar = new HBox();
			menubarAndToolbar.setSpacing(10);

			// 메뉴바와 툴바(자바)
			Button menubarAndToolbarJava = new Button("Menubar And Toolbar with Java");
			menubarAndToolbarJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});
			// 메뉴바와 툴바(FXML)
			Button menubarAndToolbarFXML = new Button("Menubar And Toolbar Control with FXML");
			menubarAndToolbarFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					try {
						URL fxmlPath = new File("src/menubarAndToolbar/menubarAndToolbar.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});
			menubarAndToolbar.getChildren().addAll(menubarAndToolbarJava, menubarAndToolbarFXML);

			root.getChildren().addAll(menubarAndToolbarTitle, menubarAndToolbar);

			/*
			 * 다이얼로그
			 */
			Label dialogTitle = new Label();
			dialogTitle.setText("다이얼로그");
			dialogTitle.setFont(new Font(20));

			// 예시
			HBox dialog = new HBox();
			dialog.setSpacing(10);

			// 다이얼로그(자바)
			Button dialogJava = new Button("Dialog with Java");
			dialogJava.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});
			// 다이얼로그(FXML)
			Button dialogFXML = new Button("Dialog with FXML");
			dialogFXML.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					try {
						URL fxmlPath = new File("src/dialog/Dialog.fxml").toURI().toURL();
						FXMLLoader fxmlLoader = new FXMLLoader();
						Parent parent = fxmlLoader.load(fxmlPath);
						Stage stage = new Stage();
						stage.initModality(Modality.APPLICATION_MODAL);
						stage.initOwner(primaryStage);
						stage.setScene(new Scene(parent));
						stage.show();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			});
			dialog.getChildren().addAll(dialogJava, dialogFXML);

			root.getChildren().addAll(dialogTitle, dialog);

			/*
			 * 외부 CSS 적용하기
			 */

			// border
			// background
			// font
			// shadow

			/*
			 * 스레드 동시성
			 */
			// Platform.runLater()

			// Task 클래스

			/*
			 * 서비스 클래스
			 */
			// 예시

			/*
			 * 화면 이동과 애니메이션
			 */
			// 화면 이동
			// 애니메이션

			/*
			 * 종료하기
			 */
			Button btnExit = new Button();
			btnExit.setText("종료하기");
			btnExit.setOnAction(event -> Platform.exit());

			root.getChildren().add(btnExit);

			// 마지막에 한 번에 출력함
			Scene scene = new Scene(root);

			primaryStage.setTitle("JavaFX 학습 프로그램");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() {
		System.out.println(Thread.currentThread().getName() + " → stop() 메소드");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " → 메인 메소드");
		launch(args);
	}
}
