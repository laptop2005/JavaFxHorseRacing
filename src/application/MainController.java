package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController implements Initializable{

	@FXML Pane pane_track;
	@FXML ImageView imageView_horse1;
	@FXML ImageView imageView_horse2;
	@FXML ImageView imageView_horse3;
	@FXML ImageView imageView_horse4;
	@FXML ImageView imageView_horse5;
	@FXML ImageView imageView_horse6;
	@FXML ImageView imageView_horse7;
	@FXML ImageView imageView_horse8;
	@FXML ImageView imageView_horse9;
	@FXML ImageView imageView_horse10;
	
	private Horse[] horses = new Horse[10];
	
	private List<String> finishLine = new ArrayList<String>();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	public void onclickStartRacing(ActionEvent event){
		horses[0] = new Horse(imageView_horse1,"1번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[1] = new Horse(imageView_horse2,"2번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[2] = new Horse(imageView_horse3,"3번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[3] = new Horse(imageView_horse4,"4번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[4] = new Horse(imageView_horse5,"5번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[5] = new Horse(imageView_horse6,"6번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[6] = new Horse(imageView_horse7,"7번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[7] = new Horse(imageView_horse8,"8번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[8] = new Horse(imageView_horse9,"9번말",(int)pane_track.getWidth(),this.finishLine,this);
		horses[9] = new Horse(imageView_horse10,"10번말",(int)pane_track.getWidth(),this.finishLine,this);
		for(Horse horse:horses){
			horse.start();
		}
	}
	
	public void showResult(){
		String rank = "";
		for(int i=0;i<finishLine.size();i++){
			rank += (i+1)+"위는 "+finishLine.get(i)+"\n";
		}
		
		Label label = new Label(rank);
		label.setPrefWidth(200);
		label.setPrefHeight(300);
		
		Scene scene = new Scene(label);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}

}
