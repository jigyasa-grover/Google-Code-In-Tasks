import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
class Quiz extends JFrame implements ActionListener {
	//Initialize all variables
	JPanel panel;
	JPanel title;
	JRadioButton choice1;
	JRadioButton choice2;
	JRadioButton choice3;
	JRadioButton choice4;
	ButtonGroup bg;
	JLabel lblmess;
	JButton btnext;
	String[][] quizPossibleAnswers;
	String[][] quizCorrectAnswers;
	int quizAnswerID;
	HashMap < Integer, String > map;
	//Set up the quiz window
	Quiz() {
		initializeData();
		setTitle("FOSS Quiz App");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(440, 400);
		setLocation(300, 100);
		setResizable(true);
		Container cont = getContentPane();
		cont.setLayout(null);
		cont.setBackground(Color.WHITE);
		bg = new ButtonGroup();
		choice1 = new JRadioButton("Choice1", true);
		choice2 = new JRadioButton("Choice2", false);
		choice3 = new JRadioButton("Choice3", false);
		choice4 = new JRadioButton("Choice4", false);
		bg.add(choice1);
		bg.add(choice2);
		bg.add(choice3);
		bg.add(choice4);
		lblmess = new JLabel("Choose a correct anwswer");
		lblmess.setForeground(Color.BLACK);
		lblmess.setFont(new Font("Sans_Serif", Font.BOLD, 15));
		btnext = new JButton("Next");
		btnext.setForeground(Color.WHITE);
    btnext.setFont(new Font("Sans_Serif", Font.BOLD ,17));
    btnext.setBackground(Color.DARK_GRAY);
		btnext.addActionListener(this);
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLocation(10, 60);
		panel.setSize(400, 300);
		panel.setLayout(new GridLayout(0, 1));
		title =new JPanel();
		title.setBackground(Color.WHITE);
		title.setLocation(10, 10);
		title.setSize(1000, 50);
		title.setLayout(new GridLayout(1,0));
		title.add(lblmess);
		panel.add(choice1);
		panel.add(choice2);
		panel.add(choice3);
		panel.add(choice4);
		panel.add(btnext);
		cont.add(title);
		cont.add(panel);
		setVisible(true);
		quizAnswerID = 0;
		readQuestionAnswer(quizAnswerID);
	}
	//Handle button clicks, specifically the next button
	public void actionPerformed(ActionEvent e) {
		if (btnext.getText().equals("Next")) {
			if (quizAnswerID < 9) {
				map.put(quizAnswerID, getSelection());
				quizAnswerID++;
				readQuestionAnswer(quizAnswerID);
			} else {
				map.put(quizAnswerID, getSelection());
				btnext.setText("Show results");
			}
		} else if (btnext.getText().equals("Show results")){
		blankScreen();
	} else if (btnext.getText().equals("Try again")){
		reset();
	}
}

	public void initializeData() {
		//quizPossibleAnswers stores pairs of question and its possible answers
		quizPossibleAnswers = new String[10][5];

		quizPossibleAnswers[0][0] = "What does FOSS stand for?";
		quizPossibleAnswers[0][1] = "Free Open Software Sources";
		quizPossibleAnswers[0][2] = "Freely Open Source Software";
		quizPossibleAnswers[0][3] = "Free Open Source Software";
		quizPossibleAnswers[0][4] = "Fried Oyster and Shrimp Sandwich";

		quizPossibleAnswers[1][0] = "What operating system is an example of FOSS?";
		quizPossibleAnswers[1][1] = "Windows";
		quizPossibleAnswers[1][2] = "Linux";
		quizPossibleAnswers[1][3] = "Mac OS";
		quizPossibleAnswers[1][4] = "None of these are open source.";

		quizPossibleAnswers[2][0] = "Who was the founder of the Free Software movement?";
		quizPossibleAnswers[2][1] = "Bill Gates";
		quizPossibleAnswers[2][2] = "Steve Jobs";
		quizPossibleAnswers[2][3] = "Rishab Aiyer Ghosh";
		quizPossibleAnswers[2][4] = "Richard Stallman";

		quizPossibleAnswers[3][0] = "What year was FOSSASIA founded?";
		quizPossibleAnswers[3][1] = "2003";
		quizPossibleAnswers[3][2] = "2008";
		quizPossibleAnswers[3][3] = "2009";
		quizPossibleAnswers[3][4] = "2001";

		quizPossibleAnswers[4][0] = "Which is an example of a site that distributes FOSS?";
		quizPossibleAnswers[4][1] = "Github";
		quizPossibleAnswers[4][2] = "Bitbucket";
		quizPossibleAnswers[4][3] = "Sourceforge";
		quizPossibleAnswers[4][4] = "All of the above";

		quizPossibleAnswers[5][0] = "Which open source project was announced in 1983?";
		quizPossibleAnswers[5][1] = "GNU Project";
		quizPossibleAnswers[5][2] = "MIT Open Source Project";
		quizPossibleAnswers[5][3] = "Linux";
		quizPossibleAnswers[5][4] = "Google";

		quizPossibleAnswers[6][0] = "Which is an example of a FOSS?";
		quizPossibleAnswers[6][1] = "Adobe Photoshop";
		quizPossibleAnswers[6][2] = "Bitcoin";
		quizPossibleAnswers[6][3] = "Spotify";
		quizPossibleAnswers[6][4] = "Skype";

		quizPossibleAnswers[7][0] = "Where is FOSSASIA 2016 hosted?";
		quizPossibleAnswers[7][1] = "Singapore";
		quizPossibleAnswers[7][2] = "India";
		quizPossibleAnswers[7][3] = "Israel";
		quizPossibleAnswers[7][4] = "Vietnam";

		quizPossibleAnswers[8][0] = "Which mobile operating system is an example of FOSS?";
		quizPossibleAnswers[8][1] = "iOS";
		quizPossibleAnswers[8][2] = "Android";
		quizPossibleAnswers[8][3] = "Blackberry";
		quizPossibleAnswers[8][4] = "All of the above";

		quizPossibleAnswers[9][0] = "Where did Linus Torvalds go to college?";
		quizPossibleAnswers[9][1] = "Washington State University";
		quizPossibleAnswers[9][2] = "Harvard University";
		quizPossibleAnswers[9][3] = "Stanford University";
		quizPossibleAnswers[9][4] = "University of Helsinki";

		//quizCorrectAnswers stores pairs of question and its correct answer
		quizCorrectAnswers = new String[10][2];

		quizCorrectAnswers[0][0] = "What does FOSS stand for?";
		quizCorrectAnswers[0][1] = "Free Open Source Software";

		quizCorrectAnswers[1][0] = "What operating system is an example of FOSS?";
		quizCorrectAnswers[1][1] = "Linux";

		quizCorrectAnswers[2][0] = "Who was the founder of the Free Software movement?";
		quizCorrectAnswers[2][1] = "Richard Stallman";

		quizCorrectAnswers[3][0] = "What year was FOSSASIA founded?";
		quizCorrectAnswers[3][1] = "2009";

		quizCorrectAnswers[4][0] = "Which is an example of a site that distributes FOSS?";
		quizCorrectAnswers[4][1] = "All of the above";

		quizCorrectAnswers[5][0] = "Which open source project was announced in 1983?";
		quizCorrectAnswers[5][1] = "GNU Project";

		quizCorrectAnswers[6][0] = "Which is an example of a FOSS?";
		quizCorrectAnswers[6][1] = "Bitcoin";

		quizCorrectAnswers[7][0] = "Where is FOSSASIA 2016 hosted?";
		quizCorrectAnswers[7][1] = "Singapore";

		quizCorrectAnswers[8][0] = "Which mobile operating system is an example of FOSS?";
		quizCorrectAnswers[8][1] = "Android";

		quizCorrectAnswers[9][0] = "Where did Linus Torvalds go to college?";
		quizCorrectAnswers[9][1] = "University of Helsinki";
		map = new HashMap < Integer, String > ();
	}
	//Get what the user selects as the answer
	public String getSelection() {
		String selectedChoice = null;
		Enumeration < AbstractButton > buttons = bg.getElements();
		while (buttons.hasMoreElements()) {
			JRadioButton temp = (JRadioButton) buttons.nextElement();
			if (temp.isSelected()) {
				selectedChoice = temp.getText();
			}
		}
		return (selectedChoice);
	}
	//Display question and answer choices
	public void readQuestionAnswer(int questionID) {
		lblmess.setText("  " + quizPossibleAnswers[questionID][0]);
		choice1.setText(quizPossibleAnswers[questionID][1]);
		choice2.setText(quizPossibleAnswers[questionID][2]);
		choice3.setText(quizPossibleAnswers[questionID][3]);
		choice4.setText(quizPossibleAnswers[questionID][4]);
    choice1.setSelected(true);
	}
	public void blankScreen(){
		int numc = calCorrectAnswer();
		lblmess.setText("Your score is: " + numc +"/10");
		panel.remove(choice1);
		panel.remove(choice2);
		panel.remove(choice3);
		panel.remove(choice4);
		btnext.setText("Try again");
	}
	//Resets the game
	public void reset() {
		panel.remove(btnext);
		panel.add(choice1);
		panel.add(choice2);
		panel.add(choice3);
		panel.add(choice4);
		panel.add(btnext);
		quizAnswerID = 0;
		map.clear();
		readQuestionAnswer(quizAnswerID);
		btnext.setText("Next");
	}
	//Calculate the number of correct answers
	public int calCorrectAnswer() {
		int questionNumber = 10;
		int count = 0;
		for (int questionID = 0; questionID < questionNumber; questionID++)
		if (quizCorrectAnswers[questionID][1].equals(map.get(questionID))) count++;
		return count;
	}
}
//Initialize the app
public class QuizApp {
	public static void main(String args[]) {
		new Quiz();
	}
}
