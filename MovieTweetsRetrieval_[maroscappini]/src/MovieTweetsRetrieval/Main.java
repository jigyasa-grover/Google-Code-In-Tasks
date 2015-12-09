package MovieTweetsRetrieval;


import static javafx.application.Application.launch;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author MarioAkio
 */
public class Main extends Application {
    
    

    /**
     * @param args the command line arguments
     */
  
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane mainPane = (Pane) FXMLLoader.load(Main.class.getResource("laybody.fxml"));
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.show();
	}
    
}
