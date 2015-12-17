/*
Author: Shikhar Vaish
*/
package fossasiaquiz;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.animation.FadeTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.RadioButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class FossAsiaQuiz extends Application {
    private Stage stage;
    static double rem=0, remX=0, remY=0; // they store values for "root em"
    public String questions[] = {
                                    "The project was called 'Green by the creator. They named it after the creator's favourite coffee. Identify the project.",
                                    "Which social networking site, owned by Google, was shut down in September 2014 ?",
                                    "Which one of these is the founder of Python ?",
                                    "Daniel Ek is best known for ?",
                                    "X was Co-founded by Massimo Banzi. X is famous for its use in IoT and open source tech. Identify X.",
                                    "What is described as a fast memory that transparently improves the performance of a larger storage device",
                                    "What was the code name of the CIA's consulting project that Larry Ellison and Ed Oates were working on ?",
                                    "What is the location-based check-ins application company founded by Dennis Crowley and Naveen Selvadurai ?",
                                    "What is an intentional hidden message, inside joke, or feature in a work of video game called ?",
                                    "It originated from the Old Norse meaning 'Candle, Torch'. What product of Amazon means to set something on fire ?",
                                    "Which programme by Bruce Artwick is the longest-running software product line for Microsoft and was renamed in 2010 ?",
                                    "Red, The Blues, Mathilda, Chuck, Bomb, Hal, Terence, Bubbles, Stella and Ice are all types of what ?"
                                };
    public String[][] answers = new String [][] { { "    CoffeeScript    ", "      Espresso      "    , "        Java        ", "     Cappuccino     "},
                                             { "    Google Plus     ", "       Orkut        "    , "      MySpace       ", "    Google Buzz     "},  
                                             { "  Guido van Rossum  ", "    Phuc Dang "    , "  Dennis Ritchie      ", "    Sean Parker    "},
                                             { "       Napster      ", "       Spotify      "    , "       Python       ", "      ShareIT       "},
                                             { "       Arduino      ", "    Raspberry Pi   "    , "     BeagleBone     ", "       Nanode       "},
                                             { "         RAM        ", "        Backup      "    , "      Cloud Storage       ", "       Cache        "},
                                             { "         NSA        ", "       Oracle       "    , "     Project Ara    ", "      Manhattan     "},
                                             { "    TekTrak    ", "    Four Square     ", "    UpNext    ", "       Topguest     "},
                                             { "    Easter Egg    ",  "     Cheat Code     ", "        Game Tester     ", "         Bug        "},
                                             { "       Kindle       ", "     Fire Phone     ", "    PaperWhite    ", "    Flamethrower    "},
                                             { "        Halo        ", "      SkyDrive      ", "   Fligh Simulator  ", "     Holo Lens     "},
                                             { "       Dragons      ", "       Smurfs       ", "     Angry Birds    ", "       Cells       "}  
                                                };
                                              
    public int index = 0, size = 12;
    public int correctAnswers[] = { 2, 1, 0, 1, 0, 3, 1, 1, 0, 0, 2, 2};    // The index of the array represents question number in the String questions array
                                                                            //The data at each index is the index of correct answer in String answers array
    
    public static int userAnswers[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};  // The index of the array represents question number in the String questions array.
                                                                                          // When user selects an option for a question, the choice for the respective question
                                                                                          // will be the index of one in the String answers in answers array

    @Override
    public void start(Stage primaryStage) {    
        
        rem = javafx.scene.text.Font.getDefault().getSize(); 
        remX = 1000/rem;
        remY = 600/rem;
        
        stage=primaryStage;      
        stage.setTitle("FossAsia Quiz");
        Scene scene= Opening();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
  
    public Scene Opening()
    {       
        final GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10));
        grid.setId("grid");
        
        //Header Title
        Label title1 = new Label("FOSSASIA");        
        Label title2 = new Label("QUIZ");
        title1.setId("title");
        title2.setId("title");
        grid.add(title1, 0, 0);
        grid.add(title2, 0, 1);
        
        Button beginBtn=new Button("Click to Begin");
        beginBtn.setId("beginBtn");
        beginBtn.setOnAction(new EventHandler<ActionEvent>()
        {
           @Override
           public void handle(ActionEvent e)
           {
               
               stage.setScene(quiz());  
           }
        });
        grid.add(beginBtn, 0, 3);
        grid.getStylesheets().add(FossAsiaQuiz.class.getResource("FossAsiaQuizCSS.css").toExternalForm());      
      
        return new Scene(grid, remX*rem, remY*rem);
    }
    public FadeTransition fadeOut(GridPane grid)
    {
               FadeTransition ft = new FadeTransition(Duration.millis(250), grid);
               ft.setFromValue(1);
               ft.setToValue(0);
               ft.setCycleCount(1);
               ft.play();
               return ft;
    }
     public FadeTransition fadeIn(GridPane grid)
    {
               FadeTransition ft = new FadeTransition(Duration.millis(250), grid);
               ft.setFromValue(0.27);
               ft.setToValue(1);
               ft.setCycleCount(1);
               ft.play();
               return ft;
    }
    
    public Scene quiz()
    {
      
       AnchorPane anchorPane = new AnchorPane();        
       anchorPane.getStylesheets().add(FossAsiaQuiz.class.getResource("FossAsiaQuizCSS.css").toExternalForm()); 
        
       final DropShadow dropShadow = new DropShadow();
       dropShadow.setRadius(5.0);
       dropShadow.setOffsetX(0.0);
       dropShadow.setOffsetY(0.0);
       dropShadow.setColor(Color.color(0.0, 0.0, 0.0));
       
        final GridPane grid = baseLayout(); 
        
        FadeTransition ft = fadeIn(grid);
        ft.play();
        
        Rectangle r = new Rectangle();    
        r.setEffect(dropShadow);
        r.setHeight(150);
        r.setFill(Color.web("#333333"));
        r.widthProperty().bind(anchorPane.widthProperty());
        
        Label title = new Label("FossAsia Quiz");
        title.setId("title");        
        
        Button lBtn = getQBtn(dropShadow, "ltri.png");  
        if(index==0)
            lBtn = getQBtn(dropShadow, "blockedTri.png"); //blocked button image when moving back is not possible
       
        Button rBtn = getQBtn(dropShadow, "rtri.png");
        lBtn.setOnAction(new EventHandler<ActionEvent>() //when the button is clicked
        {
            @Override            
                public void handle(ActionEvent e)
                {
                    if(index-1>=0)
                    {
                           index--;                        
                           stage.setScene(quiz());
                    }                
                }
        });
         rBtn.setOnAction(new EventHandler<ActionEvent>() //when the button is clicked
        {
            
            @Override            
                public void handle(ActionEvent e)
                {
                    
                    if(index+1<size)
                    {
                        index++;                
                        stage.setScene(quiz());
                                            
                    }
                    else if(index+1==size)
                    {
                        stage.setScene(result());
                    }
                    
                }            
        });
        
        anchorPane.setLeftAnchor(lBtn, 75.0);
        anchorPane.setRightAnchor(rBtn, 75.0);         
        anchorPane.setBottomAnchor(lBtn, 75.0);
        anchorPane.setBottomAnchor(rBtn, 75.0);
        anchorPane.setTopAnchor(title, 45.0);
        anchorPane.setLeftAnchor(title, 15.0);
        
        anchorPane.getChildren().addAll(r, title, grid, lBtn, rBtn);
        return new Scene(anchorPane, remX*rem, remY*rem);              //return scene dimensions relative to screen dpi
    }
    protected GridPane baseLayout()
    {    
        final GridPane grid = new GridPane();
        grid.setHgap(30);
        grid.setVgap(30);
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(10));
        
       final DropShadow dropShadow = new DropShadow();
       dropShadow.setRadius(5.0);
       dropShadow.setOffsetX(0.0);
       dropShadow.setOffsetY(0.0);
       dropShadow.setColor(Color.color(0.0, 0.0, 0.0));  
        
        Text q = new Text("Q"+(index+1)+") "+questions[index]); 
        q.setWrappingWidth(remX*rem-50); //set Wrap Boundary relative to Screen DPI
        grid.setColumnSpan(q, 31);
        grid.setRowSpan(q,1);
        q.setId("question");
        grid.add(q, 1, 5);
      
        final ToggleGroup tg = new ToggleGroup(); //ToggleGroup for options for the question
        
        /*
            HBox hOpt will get options arranged Row-wise
            VBox vOpt will get the hOpt multiple times
            GridPane grid will get the VBox, hence, options are arranged in a grid/matrix            
        */
        
        HBox hOpt= new HBox(100);
        VBox vOpt= new VBox(100);        
        
        /*
            Each option has data so that it can be used to access the corresponding matrix data
        */
        RadioButton opt1 = new RadioButton(answers[index][0]);
        opt1.setUserData("0");
        opt1.setToggleGroup(tg); 
        
        RadioButton opt2 = new RadioButton(answers[index][1]);
        opt2.setUserData("1");
        opt2.setToggleGroup(tg);
        
        hOpt.getChildren().addAll(opt1, opt2);
        vOpt.getChildren().addAll(hOpt);
        hOpt = new HBox(100);
        
        RadioButton opt3 = new RadioButton(answers[index][2]);
        opt3.setUserData("2");
        opt3.setToggleGroup(tg);
        
        RadioButton opt4 = new RadioButton(answers[index][3]);
        opt4.setUserData("3");
        opt4.setToggleGroup(tg);
        
        hOpt.getChildren().addAll(opt3, opt4); 
        vOpt.getChildren().addAll(hOpt);
        grid.setColumnSpan(vOpt, 20);    
        grid.add(vOpt, 8, 6); 
        
        if(userAnswers[index] != -1) //if the user returns to previous question, the already selected options to be selected again
        {
            switch(userAnswers[index])
            {
                case 0: opt1.setSelected(true); break;
                case 1: opt2.setSelected(true); break;
                case 2: opt3.setSelected(true); break;
                case 3: opt4.setSelected(true); break;
            }
        }
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() { //when the user selects an option
                         @Override
                         public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1)
                         {                             
                             userAnswers[index] = Integer.valueOf(tg.getSelectedToggle().getUserData().toString());
                         }
                         });
        
        grid.getStylesheets().add(FossAsiaQuiz.class.getResource("FossAsiaQuizCSS.css").toExternalForm());   
        return grid;        
    }
    protected Button getQBtn(final DropShadow dropShadow, String url)
    {     
        Image tri = new Image(getClass().getResourceAsStream(url), 50, 50, false, true);         //image for button
        final ImageView iview= new ImageView(tri); 
        iview.setEffect(dropShadow);
        Button btn = new Button("",iview);
        btn.setId("qBtn");
        
        btn.setOnMouseEntered(new EventHandler<MouseEvent>()  //when the mouse hovers on the button/image
        {
         public void handle(MouseEvent me)
         {
       
        iview.setEffect(null);
        
         }
        });
        btn.setOnMouseExited(new EventHandler<MouseEvent>()   //when the mouse leaves the image/button
        {
        @Override public void handle(MouseEvent e)
        {
          iview.setEffect(dropShadow);
        }
      });
        
        return btn;
    }
    protected Scene result() //Scorecard/Result Scene
    {
        final GridPane grid = new GridPane();
        grid.setHgap(30);
        grid.setVgap(30);
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(10));
        
       final DropShadow dropShadow = new DropShadow();
       dropShadow.setRadius(5.0);
       dropShadow.setOffsetX(0.0);
       dropShadow.setOffsetY(0.0);
       dropShadow.setColor(Color.color(0.0, 0.0, 0.0));
       
        Rectangle r = new Rectangle();
        r.widthProperty().bind(grid.widthProperty());
        r.setHeight(150);
        r.setFill(Color.web("#333333"));
        r.setEffect(dropShadow);
        
        
        Label title = new Label("FossAsia Quiz Results");       
        title.setId("title");
        grid.setRowSpan(r, 3);
        grid.setColumnSpan(r, 25);
        grid.add(r, 0, 0);
        grid.setRowSpan(title, 2);
        grid.setColumnSpan(title, 31);
        grid.add(title, 0, 1);
       
        int scr=0;
        
        String str="";       
        String question, userAnswer, correctAnswer;
        for(int i=0; i<size;i++)
        {
            question=questions[i];
            if(userAnswers[i]==-1)
            {
                userAnswer = "-";
            }
            else
            userAnswer = answers[i][userAnswers[i]];
            
            correctAnswer = answers[i][correctAnswers[i]];
            if(userAnswers[i] == correctAnswers[i]) //Score Counter
            {
                scr++;
            }
            str = str+ "Question: "+question+"\n"+"Your answer: "+userAnswer+"\n"+"Correct answer: "+correctAnswer+"\n\n";           
        }
        Text score = new Text("Your Score: "+scr+"/12");
        grid.setColumnSpan(score, 24);
        grid.add(score, 1, 5);
        score.setId("question");
        
        ScrollPane sc = new ScrollPane();
        sc.setMaxHeight(350);
        sc.setContent(new Text(str));
        grid.setColumnSpan(sc, 29);
        grid.setRowSpan(sc,24);
        sc.setId("resultTable");
        grid.add(sc, 1, 1);        
       
        grid.getStylesheets().add(FossAsiaQuiz.class.getResource("FossAsiaQuizCSS.css").toExternalForm());  
        return new Scene(grid, remX*rem, remY*rem);        //return scene dimensions relative to screen dpi
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
