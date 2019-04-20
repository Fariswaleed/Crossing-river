/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenebuildertest;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Muhammmad Akram
 */
public class LeveloneSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button raftMotion;
    @FXML
    int x=0;
    @FXML
    private void reload(ActionEvent event) throws IOException {
        System.out.println("Reload Action");
        
    }
        @FXML
    private void Back(ActionEvent event) throws IOException {
        System.out.println("Back Action");
        
    }
        @FXML
    private void hint(ActionEvent event) throws IOException {
        System.out.println("hint Action");
        
    }
        @FXML
    private void letsGo(ActionEvent event) throws IOException {
        
        Polyline l=new Polyline();
        if(x==0)
        {
      l.getPoints().addAll(new Double[]{100.0,60.0,-150.0,60.0});//100.0,60.0,-150.0,60.0 //-150.0,60.0,100.0,60.0
       //Line line =new Line(1, b.getLayoutY(),b.getLayoutX() , b.getLayoutY());
       PathTransition transition=new PathTransition();
      transition.setNode(raftMotion);
      transition.setDuration(Duration.seconds(2));
      transition.setPath(l);x=1;
      //transition.setCycleCount(-1);
      
         
      transition.play();}
        
       else if(x==1)
        {
        l.getPoints().addAll(new Double[]{-150.0,60.0,100.0,60.0});//100.0,60.0,-150.0,60.0 //-150.0,60.0,100.0,60.0
       //Line line =new Line(1, b.getLayoutY(),b.getLayoutX() , b.getLayoutY());
       PathTransition transition=new PathTransition();
      transition.setNode(raftMotion);
      transition.setDuration(Duration.seconds(2));
      transition.setPath(l);x=0;
      //transition.setCycleCount(-1);
      
         
      transition.play();
        
        
        }
        
        
        
        
    }
     
   
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      //       Circle circle =new Circle(100);
       
    }    
    
}
