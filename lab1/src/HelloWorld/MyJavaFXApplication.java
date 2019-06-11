package HelloWorld;
 
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.layout.HBox;
import javafx.scene.shape.ClosePath;
import static javafx.scene.paint.Color.RED;
import static javafx.scene.paint.Color.YELLOW;
import static javafx.scene.paint.Color.BLUE;

public class MyJavaFXApplication extends Application {
       
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) {
                
        // Creating Star
        Path star = new Path();
                star.getElements().addAll(new MoveTo(30, 0),
                new LineTo(0, 30),
                new LineTo(60, 30),
                new ClosePath(),
                new MoveTo(0, 10),
                new LineTo(60, 10),
                new LineTo(30, 40),
                new MoveTo(30,40),
                new LineTo(30,60),
                new ClosePath());
               
        star.setStroke(YELLOW);
        star.setFill(YELLOW);
                
        Group root = new Group(star);
 
        // Creating Polygon
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
        		20.0, 10.0, 
        		40.0, 10.0, 
        		50.0, 20.0,          
        		40.0, 30.0, 
        		20.0, 30.0,                   
        		10.0, 20.0, 
            });
        root.getChildren().add(polygon);
        polygon.setFill(BLUE);
        
        Scene scene = new Scene(root);
        scene.setFill(RED);
        stage.setScene(scene);
        stage.setTitle("Lab 1");
        stage.show();
    }
}
