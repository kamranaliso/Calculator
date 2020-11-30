import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application{

	int num1;
	int num2;
	int res;
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {

		Label resultlbl = new Label("Result: ");
		Label resulttxt = new Label("");
		HBox resultbox = new HBox(10,resultlbl,resulttxt);
		
		TextField num1txt = new TextField();
		TextField num2txt = new TextField();
		
		HBox inputFields = new HBox(10,num1txt,num2txt);
		
		int btnwidth = 45;
		int btnHeight = 30;
		
		Button btnMulti= new Button("*");
		btnMulti.setPrefWidth(btnwidth);
		btnMulti.setPrefHeight(btnHeight);
		Button btnDiv= new Button("/");
		btnDiv.setPrefWidth(btnwidth);
		btnDiv.setPrefHeight(btnHeight);
		Button btnSub= new Button("-");
		btnSub.setPrefWidth(btnwidth);
		btnSub.setPrefHeight(btnHeight);
		Button btnAdd= new Button("+");
		btnAdd.setPrefWidth(btnwidth);
		btnAdd.setPrefHeight(btnHeight);
		
		HBox operations = new HBox(10,btnMulti,btnDiv,btnSub,btnAdd);

		btnMulti.setOnAction(e-> {
			
		});
		btnDiv.setOnAction(e-> {
			num1 = Integer.parseInt(num1txt.getText());
			num2 = Integer.parseInt(num2txt.getText());
			res = num1 / num2;
			String restxt = Integer.toString(res);
			resulttxt.setText(restxt);
		});
		btnSub.setOnAction(e-> {
			num1 = Integer.parseInt(num1txt.getText());
			num2 = Integer.parseInt(num2txt.getText());
			res = num1 - num2;
			String restxt = Integer.toString(res);
			resulttxt.setText(restxt);
		});
		btnAdd.setOnAction(e-> {
			
			num2 = Integer.parseInt(num2txt.getText());
			res = num1 + num2;
			String restxt = Integer.toString(res);
			resulttxt.setText(restxt);
		});
		
		Button btncopy = new Button("Result as Input");
		btncopy.setPrefWidth(230);
		btncopy.setPrefHeight(btnHeight);
		
		btncopy.setOnAction(e-> {
			num1 =  res;
			String newnum1 = Integer.toString(num1);
			num1txt.setText(newnum1);
			num2txt.setText("");
		});

		VBox root = new VBox(20,resultbox,inputFields,operations,btncopy);
		root.setPadding(new Insets(25));
		Scene scene = new Scene(root, 250,220);
		stage.setTitle("Claculator");
		stage.setScene(scene);
		stage.show();
	}
}
