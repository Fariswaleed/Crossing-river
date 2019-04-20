/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenebuildertest;

import com.sun.javafx.geom.Curve;
import com.sun.javafx.geom.RectBounds;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.NodeOrientation;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Path;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.QuadCurve;


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
    int position=0;
    @FXML
    private ImageView k;
    @FXML
    private ImageView sheep;
    int z=0;
    
    
    
//    @FXML
//    private void bagarb(ActionEvent event) throws IOException {
//        path.getElements().add(moveTO);
//        path.getElements().add(arcTo);
//        
//    }
    
    @FXML
    private void reload(ActionEvent event) throws IOException {
        System.out.println("Reload Action");
        
    }
        @FXML
    private void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Levels.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
        
    }
        @FXML
    private void hint(ActionEvent event) throws IOException {
        System.out.println("hint Action");
        
    }
    
     @FXML
    private void moveToRaft(ActionEvent event) throws IOException {
       
        
    }
    int y=0;
    
        @FXML
    private void letsGo(ActionEvent event) throws IOException {
        
        Polyline l=new Polyline();
        Polyline l1=new Polyline();
        if(position==1)
        {
      l.getPoints().addAll(new Double[]{50.0,60.0,-190.0,60.0});
       //100.0,60.0,-150.0,60.0 //-150.0,60.0,100.0,60.0
      l1.getPoints().addAll(new Double[]{15.0,25.0,-225.0,25.0});
       //Line line =new Line(1, b.getLayoutY(),b.getLayoutX() , b.getLayoutY());
       PathTransition transition=new PathTransition();
      transition.setNode(k);
      transition.setDuration(Duration.seconds(2));
      transition.setPath(l);position=2;
      //transition.setCycleCount(-1);
      PathTransition transition1=new  PathTransition();
      if(y>=0)
      { sheep.setLayoutX(505);sheep.setLayoutY(277);y++;}
      transition1.setNode(sheep);
      transition1.setDuration(Duration.seconds(2));
      transition1.setPath(l1);z=1;
      transition1.play();
      transition.play();
                           System.out.println(sheep.getLocalToParentTransform()+"-->"+sheep.getLayoutY());

        }
      
       else if(position==2)
        {
        l.getPoints().addAll(new Double[]{-190.0,60.0,50.0,60.0});//100.0,60.0,-150.0,60.0 //-150.0,60.0,100.0,60.0
       //Line line =new Line(1, b.getLayoutY(),b.getLayoutX() , b.getLayoutY());
       l1.getPoints().addAll(new Double[]{-225.0,25.0,15.0,25.0}); 
       PathTransition transition=new PathTransition();
      transition.setNode(k);
      transition.setDuration(Duration.seconds(2));
      transition.setPath(l);position=1;
      //transition.setCycleCount(-1);
      PathTransition transition1=new  PathTransition();sheep.setLayoutX(500);sheep.setLayoutY(275);
      transition1.setNode(sheep);
      transition1.setDuration(Duration.seconds(2));
      transition1.setPath(l1);
      transition1.play();
         z=0;
      transition.play();
        System.out.println(sheep.getLocalToParentTransform()+"-->"+sheep.getLayoutY());
        
        }
        
        
        
        
    }
     
   
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {System.out.println(sheep.getLayoutX()+"-->"+sheep.getLayoutY());
    
        QuadCurve curve=new QuadCurve(70, 13, -50, -100,-123, 48); 
        
      sheep.setOnMouseClicked(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            
            if(position==0)
            {   if(y>1)
      { sheep.setLayoutX(700);sheep.setLayoutY(250);y++;}
                curve.setLayoutX(-40);
        curve.setLayoutY(10);
                curve.setStartX(70);
            curve.setStartY(13);
            curve.setControlX(-50);
            curve.setControlY(-100);
            curve.setEndX(-123);
            curve.setEndY(48);
            PathTransition transition=new PathTransition();
            transition.setNode(sheep);
            transition.setDuration(Duration.seconds(0.9));
            transition.setPath(curve);System.out.println(sheep.getLocalToParentTransform()+"-->"+sheep.getLayoutY());
            transition.play();
                position=1;
            }
            else if(position==1)
            {if(y>=1&&z==0)
      { sheep.setLayoutX(690);sheep.setLayoutY(250);y++;}
        if(y>=1&&z==1)
      { sheep.setLayoutX(500);sheep.setLayoutY(250);y++;}
                curve.setStartX(-123);
            curve.setStartY(48);
            curve.setControlX(-50);
            curve.setControlY(-100);
            curve.setEndX(70);
            curve.setEndY(13);
            PathTransition transition=new PathTransition();
            transition.setNode(sheep);
            transition.setDuration(Duration.seconds(0.9));
            transition.setPath(curve);System.out.println(sheep.getLocalToParentTransform()+"-->"+sheep.getLayoutY());
            transition.play();position=0;}
            
            else if(position==3)
               {z=1;
                   curve.setLayoutX(150);
        curve.setLayoutY(0);
                   curve.setStartX(-140);
            curve.setStartY(20);
            curve.setControlX(-50);
            curve.setControlY(-100);
            curve.setEndX(87);
            curve.setEndY(55);
            PathTransition transition=new PathTransition();
            transition.setNode(sheep);
            transition.setDuration(Duration.seconds(0.9));
            transition.setPath(curve);
            transition.play();position=2;
                   System.out.println(sheep.getLocalToParentTransform()+"-->"+sheep.getLayoutY());
                    }
            else if(position==2)
               {sheep.setLayoutX(50);sheep.setLayoutY(250);
                   curve.setLayoutX(150);
        curve.setLayoutY(0);
                   curve.setStartX(87);
            curve.setStartY(55);
            curve.setControlX(-50);
            curve.setControlY(-100);
            curve.setEndX(-140);
            curve.setEndY(20);
            PathTransition transition=new PathTransition();
            transition.setNode(sheep);
            transition.setDuration(Duration.seconds(0.9));
            transition.setPath(curve);
            transition.play();position=3;
                                      System.out.println(sheep.getLocalToParentTransform()+"-->"+sheep.getLayoutY());
z=1;
                   
                    }
            
            
            
            
            //System.out.println(sheep.getLocalToParentTransform()+"-->"+sheep.getLayoutY());
        }
    });
       
    }    
    
}
