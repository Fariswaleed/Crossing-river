/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenebuildertest;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.animation.PathTransition;
import javafx.scene.control.Button;
import javafx.util.Duration;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;


/**
 *
 * @author VEGA
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button b;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Levels.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
        System.out.println(b.getLayoutX());
    }
    @FXML
    private void motionAction(ActionEvent event) throws IOException {
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

       
    }    
    
}
