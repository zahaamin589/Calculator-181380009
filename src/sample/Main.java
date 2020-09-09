package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;


public class Main extends Application {
    private Label answer;
    private Button Cbtn , Powerbtn , Squarebtn,Plusbtn,
            Dividebtn , Dotbtn, Zerobtn ,Onebtn,
            Minibtn , Twobtn , Threebtn ,  Fourbtn , Fivebtn ,
            Sixbtn , Sevenbtn , Eightbtn, Ninebtn ,
            Multiplybtn , Combinebtn, Equalbtn;
    private HBox root1 , root2 , root3 , root4 , root5 , root6;
    private VBox mainRoot;
    @Override
    public void start(Stage primaryStage) throws Exception {
        answer = new Label("0");
        root1 = new HBox(40, answer);
        answer.setFont(new Font(32));
        root1.setAlignment(Pos.CENTER_RIGHT);
        Cbtn = new Button("C");
        Cbtn.setPrefWidth(120);
        Cbtn.setPrefHeight(60);
        Powerbtn = new Button("x^2");
        Powerbtn.setPrefHeight(60);
        Powerbtn.setPrefWidth(120);
        Squarebtn = new Button("Sqrt");
        Squarebtn.setPrefWidth(120);
        Squarebtn.setPrefHeight(60);
        Dividebtn = new Button("/");
        Dividebtn.setPrefWidth(120);
        Dividebtn.setPrefHeight(60);
        root2 = new HBox(Cbtn, Powerbtn, Squarebtn, Dividebtn);
        root2.setAlignment(Pos.BOTTOM_CENTER);
        Sevenbtn = new Button("7");
        Sevenbtn.setPrefHeight(60);
        Sevenbtn.setPrefWidth(120);
        Eightbtn = new Button("8");
        Eightbtn.setPrefWidth(120);
        Eightbtn.setPrefHeight(60);
        Ninebtn = new Button("9");
        Ninebtn.setPrefHeight(60);
        Ninebtn.setPrefWidth(120);

        Multiplybtn = new Button("*");
        Multiplybtn.setPrefWidth(120);
        Multiplybtn.setPrefHeight(60);
        root3 = new HBox(Sevenbtn, Eightbtn, Ninebtn, Multiplybtn);
        root3.setAlignment(Pos.BOTTOM_CENTER);
        Fourbtn = new Button("4");
        Fourbtn.setPrefHeight(60);
        Fourbtn.setPrefWidth(120);
        Fivebtn = new Button("5");
        Fivebtn.setPrefHeight(60);
        Fivebtn.setPrefWidth(120);
        Sixbtn = new Button("6");
        Sixbtn.setPrefHeight(60);
        Sixbtn.setPrefWidth(120);

        Minibtn = new Button("-");
        Minibtn.setPrefHeight(60);
        Minibtn.setPrefWidth(120);
        root4 = new HBox(Fourbtn, Fivebtn, Sixbtn, Minibtn);
        root4.setAlignment(Pos.BOTTOM_CENTER);
        Onebtn = new Button("1");
        Onebtn.setPrefHeight(60);
        Onebtn.setPrefWidth(120);
        Twobtn = new Button("2");
        Twobtn.setPrefHeight(60);
        Twobtn.setPrefWidth(120);
        Threebtn = new Button("3");
        Threebtn.setPrefHeight(60);
        Threebtn.setPrefWidth(120);
        Plusbtn = new Button("+");
        Plusbtn.setPrefHeight(60);Plusbtn.setPrefWidth(120);

        root5 = new HBox(Onebtn, Twobtn, Threebtn, Plusbtn);
        root5.setAlignment(Pos.BOTTOM_CENTER);
        Combinebtn = new Button("+/-");
        Combinebtn.setPrefHeight(60);
        Combinebtn.setPrefWidth(120);
        Zerobtn = new Button("0");
        Zerobtn.setPrefHeight(60);
        Zerobtn.setPrefWidth(120);
        Dotbtn = new Button(".");
        Dotbtn.setPrefHeight(60);
        Dotbtn.setPrefWidth(120);
        Equalbtn = new Button("=");
        Equalbtn.setPrefHeight(60);
        Equalbtn.setPrefWidth(120);
        root6 = new HBox(Combinebtn, Zerobtn, Dotbtn, Equalbtn);
        root6.setAlignment(Pos.BOTTOM_CENTER);
        getAllValue setValue = new getAllValue();
        Onebtn.setOnAction(setValue);
        Twobtn.setOnAction(setValue);
        Threebtn.setOnAction(setValue);
        Fourbtn.setOnAction(setValue);
        Fivebtn.setOnAction(setValue);
        Sixbtn.setOnAction(setValue);
        Sevenbtn.setOnAction(setValue);
        Eightbtn.setOnAction(setValue);
        Ninebtn.setOnAction(setValue);
        Zerobtn.setOnAction(setValue);
        action action = new action();
        Dividebtn.setOnAction(action);
        Cbtn.setOnAction(action);
        Squarebtn.setOnAction(action);
        Powerbtn.setOnAction(action);
        Equalbtn.setOnAction(action);
        Multiplybtn.setOnAction(action);
        Minibtn.setOnAction(action);
        Plusbtn.setOnAction(action);
        mainRoot = new VBox(root1, root2, root3, root4, root5, root6);
        Scene scene = new Scene(mainRoot, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("-181380009-Calculator");
        primaryStage.show();
    }
    private  class  getAllValue implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==Sevenbtn){
                answer.setText("7");
            }
            else  if(event.getSource()==Eightbtn){
                answer.setText("8");
            }
            if(event.getSource()==Ninebtn){
                answer.setText("9");
            }
            else  if(event.getSource()==Fourbtn){
                answer.setText("4");
            }
            if(event.getSource()==Fivebtn){
                answer.setText("5");
            }
            else  if(event.getSource()==Sixbtn){
                answer.setText("6");
            }
            if(event.getSource()==Onebtn){
                answer.setText("1");
            }
            else  if(event.getSource()==Twobtn){
                answer.setText("2");
            }
            if(event.getSource()==Threebtn){
                answer.setText("3");
            }
            else  if(event.getSource()==Zerobtn){
                answer.setText("0");
            }
        }
    }
    public class action implements EventHandler<ActionEvent>{
        double  v, number;
        String str;
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == Cbtn) {
                answer.setText("0");
            } else if (event.getSource() == Powerbtn) {
                v = getDouble(answer);
                v = Math.pow(v, 2);
                answer.setText(v + "");
            } else if (event.getSource() == Squarebtn) {
                v = getDouble(answer);
                System.out.println(v);
                v = Math.sqrt(v);
                answer.setText(v + "");
            } else if (event.getSource() == Dividebtn) {
                v = getDouble(answer);
                answer.setText(null);
                str = "divide";

            } else if (event.getSource() == Multiplybtn) {
                v = getDouble(answer);
                answer.setText(null);
                str = "multiply";
            } else if (event.getSource() == Minibtn) {
                v = getDouble(answer);
                answer.setText(null);
                str = "minus";
            } else if (event.getSource() == Plusbtn) {
                v = getDouble(answer);
                answer.setText(null);
                str = "plus";
            } else if (event.getSource() == Equalbtn) {
                if (str.equals("divide")) {
                    number = getDouble(answer);
                    String n = v / number + "";
                    if (n.equalsIgnoreCase("Infinity")) {
                        answer.setText("Error");
                    } else
                        answer.setText(setResltOfLabel(v / number));

                } else if (str.equals("multiply")) {
                    number = getDouble(answer);
                    answer.setText(setResltOfLabel(v * number));

                } else if (str.equals("minus")) {
                    number = getDouble(answer);
                    answer.setText(setResltOfLabel(v - number));
                } else if (str.equals("plus")) {
                    number = getDouble(answer);
                    answer.setText(setResltOfLabel(v + number));
                }
            }
        }
    }
    public  double getDouble(Label label){

        return Double.parseDouble(answer.getText().toString());
    }

    public String setResltOfLabel(double v)
    {

        return  v+"";
    }
    public static void main(String[] args) {
        launch(args);
    }
}