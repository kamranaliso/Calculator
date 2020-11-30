import java.util.Stack;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application{
	String calc = "";
	String result = "Reslut: ";
	
	int num1 = 0;
	int num2 = 0;
	String operation = "";
	
	char[] nums ;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {

		
		Label calctxt = new Label(calc);
		Label restxt = new Label(result);
		
		int btnwidth = 65;
		int btnHeight = 40;
		
		Button[] btn = new Button[10];
		
		
		for (int i = 0; i < btn.length; i++) {
			String num= Integer.toString(i);
			btn[i]= new Button(num);
			btn[i].setPrefWidth(btnwidth);
			btn[i].setPrefHeight(btnHeight);
		}
		
		btn[0].setOnAction(e-> { calc += "0"; calctxt.setText(calc);});
		btn[1].setOnAction(e-> { calc += "1"; calctxt.setText(calc);});
		btn[2].setOnAction(e-> { calc += "2"; calctxt.setText(calc);});
		btn[3].setOnAction(e-> { calc += "3"; calctxt.setText(calc);});
		btn[4].setOnAction(e-> { calc += "4"; calctxt.setText(calc);});
		btn[5].setOnAction(e-> { calc += "5"; calctxt.setText(calc);});
		btn[6].setOnAction(e-> { calc += "6"; calctxt.setText(calc);});
		btn[7].setOnAction(e-> { calc += "7"; calctxt.setText(calc);});
		btn[8].setOnAction(e-> { calc += "8"; calctxt.setText(calc);});
		btn[9].setOnAction(e-> { calc += "9"; calctxt.setText(calc);});

		Button btnDot= new Button(".");
		btnDot.setPrefWidth(btnwidth);
		btnDot.setPrefHeight(btnHeight);
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
		Button btnEquals= new Button("=");
		btnEquals.setPrefWidth(btnwidth);
		btnEquals.setPrefHeight(btnHeight);
		btnDot.setOnAction(e-> { calc += "."; calctxt.setText(calc);});

		btnMulti.setOnAction(e-> {
			operation = "*";
			num1 = Integer.parseInt(calc);
			num2 = num1;
			calc = "";

			});
		btnDiv.setOnAction(e-> {
			int rr = Integer.parseInt(operation);
			int r  = num1 + rr + num2;
			System.err.println(r);
			});

		VBox c1 = new VBox(15,btn[7],btn[4],btn[1],btnDot);
		VBox c2 = new VBox(15,btn[8],btn[5],btn[2],btn[0]);
		VBox c3 = new VBox(15,btn[9],btn[6],btn[3],btnEquals);
		VBox c4 = new VBox(15,btnMulti,btnDiv,btnSub,btnAdd);
		HBox AllBtnsBox = new HBox(15,c1,c2,c3,c4);

		VBox resultBox = new VBox(20,calctxt,restxt);
		resultBox.setPrefHeight(350);
		
		VBox root = new VBox(resultBox,AllBtnsBox);
		root.setPadding(new Insets(25));
		Scene scene = new Scene(root, 330,600);
		stage.setTitle("Claculator");
		scene.getStylesheets().add("style.css");
		stage.setScene(scene);
		stage.show();
	}

}
