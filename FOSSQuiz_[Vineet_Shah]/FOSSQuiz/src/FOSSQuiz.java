import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class FOSSQuiz {



	public static void main(String[] args) throws IOException {
		ArrayList selections = new ArrayList();  //Arraylist that will populate with user selections

		final JFrame f = new JFrame("FOSS Quiz");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setPreferredSize(new Dimension(500, 300));

		JLabel title = new JLabel("Welcome to the FOSS Quiz!");
		JLabel space = new JLabel(" ");
		JLabel space1 = new JLabel(" ");
		JLabel instructionsText = new JLabel("Instructions:");
		JLabel instructions1 = new JLabel("You must select an option for each question in order to continue.");
		JLabel instructions2 = new JLabel("You will not be able to return and change your answer to a question.");
		JLabel instructions3 = new JLabel("Have Fun!");

		JButton nextButton = new JButton("Next");
		JPanel viewPanel = new JPanel();
		viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

		viewPanel.add(title);
		viewPanel.add(space);
		viewPanel.add(instructionsText);
		viewPanel.add(instructions1);
		viewPanel.add(instructions2);
		viewPanel.add(space1);
		viewPanel.add(instructions3);

		viewPanel.add(nextButton);

		f.add(viewPanel);

		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.getContentPane().removeAll();
				f.getContentPane().validate();
				f.repaint();
				
				JLabel questiontitle = new JLabel();
				questiontitle.setText("Question 1");

				JLabel questionlabel = new JLabel();
				questionlabel.setText("What does FOSS stand for? ");

				ButtonGroup BG = new ButtonGroup();
				JRadioButton AC1 = new JRadioButton("Free and Open Source Software");
				JRadioButton AC2 = new JRadioButton("Free and Open Sustainable Software");
				JRadioButton AC3 = new JRadioButton("Forward and Open Sustainable Software ");
				JRadioButton AC4 = new JRadioButton("Freeware and Open Source Software ");
				AC1.setActionCommand("AC1");
				AC2.setActionCommand("AC2");
				AC3.setActionCommand("AC3");
				AC4.setActionCommand("AC4");

				BG.add(AC1);
				BG.add(AC2);
				BG.add(AC3);
				BG.add(AC4);

				JPanel viewPanel = new JPanel();
				viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

				viewPanel.add(questionlabel);
				viewPanel.add(AC1);
				viewPanel.add(AC2);
				viewPanel.add(AC3);
				viewPanel.add(AC4);

				JButton nextButton = new JButton("Next");
				viewPanel.add(nextButton);

				f.add(viewPanel);
				f.getContentPane().validate();
				f.repaint();

				nextButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						selections.add(BG.getSelection().getActionCommand());
						f.getContentPane().removeAll();
						f.getContentPane().validate();
						f.repaint();

						JLabel questiontitle = new JLabel();
						questiontitle.setText("Question 2");

						JLabel questionlabel = new JLabel();
						questionlabel.setText("Who founded the Free Software Foundation? ");

						ButtonGroup BG = new ButtonGroup();
						JRadioButton AC1 = new JRadioButton("Linus Torvalds");
						JRadioButton AC2 = new JRadioButton("Larry Page");
						JRadioButton AC3 = new JRadioButton("Richard Stallman");
						JRadioButton AC4 = new JRadioButton("Steve Jobs");
						AC1.setActionCommand("AC1");
						AC2.setActionCommand("AC2");
						AC3.setActionCommand("AC3");
						AC4.setActionCommand("AC4");

						BG.add(AC1);
						BG.add(AC2);
						BG.add(AC3);
						BG.add(AC4);

						JPanel viewPanel = new JPanel();
						viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

						viewPanel.add(questionlabel);
						viewPanel.add(AC1);
						viewPanel.add(AC2);
						viewPanel.add(AC3);
						viewPanel.add(AC4);

						JButton nextButton = new JButton("Next");
						viewPanel.add(nextButton);

						f.add(viewPanel);


						f.getContentPane().validate();
						f.repaint();

						nextButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								selections.add(BG.getSelection().getActionCommand());
								f.getContentPane().removeAll();
								f.getContentPane().validate();
								f.repaint();

								JLabel questiontitle = new JLabel();
								questiontitle.setText("Question 3");

								JLabel questionlabel = new JLabel();
								questionlabel.setText("Which of the following is a free Operating System? ");

								ButtonGroup BG = new ButtonGroup();
								JRadioButton AC1 = new JRadioButton("Windows");
								JRadioButton AC2 = new JRadioButton("GNU/Linux");
								JRadioButton AC3 = new JRadioButton("MAC OS");
								JRadioButton AC4 = new JRadioButton("UNIX");
								AC1.setActionCommand("AC1");
								AC2.setActionCommand("AC2");
								AC3.setActionCommand("AC3");
								AC4.setActionCommand("AC4");

								BG.add(AC1);
								BG.add(AC2);
								BG.add(AC3);
								BG.add(AC4);

								JPanel viewPanel = new JPanel();
								viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

								viewPanel.add(questionlabel);
								viewPanel.add(AC1);
								viewPanel.add(AC2);
								viewPanel.add(AC3);
								viewPanel.add(AC4);

								JButton nextButton = new JButton("Next");
								viewPanel.add(nextButton);

								f.add(viewPanel);


								f.getContentPane().validate();
								f.repaint();

								nextButton.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										selections.add(BG.getSelection().getActionCommand());
										f.getContentPane().removeAll();
										f.getContentPane().validate();
										f.repaint();

										JLabel questiontitle = new JLabel();
										questiontitle.setText("Question 4");

										JLabel questionlabel = new JLabel();
										questionlabel.setText("What is VLC used for? ");

										ButtonGroup BG = new ButtonGroup();
										JRadioButton AC1 = new JRadioButton("Playing Media Files");
										JRadioButton AC2 = new JRadioButton("Editing Pictures");
										JRadioButton AC3 = new JRadioButton("Running Games");
										JRadioButton AC4 = new JRadioButton("Browsing the Web");
										AC1.setActionCommand("AC1");
										AC2.setActionCommand("AC2");
										AC3.setActionCommand("AC3");
										AC4.setActionCommand("AC4");

										BG.add(AC1);
										BG.add(AC2);
										BG.add(AC3);
										BG.add(AC4);

										JPanel viewPanel = new JPanel();
										viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

										viewPanel.add(questionlabel);
										viewPanel.add(AC1);
										viewPanel.add(AC2);
										viewPanel.add(AC3);
										viewPanel.add(AC4);

										JButton nextButton = new JButton("Next");
										viewPanel.add(nextButton);

										f.add(viewPanel);


										f.getContentPane().validate();
										f.repaint();
										nextButton.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent e) {
												selections.add(BG.getSelection().getActionCommand());
												f.getContentPane().removeAll();
												f.getContentPane().validate();
												f.repaint();

												JLabel questiontitle = new JLabel();
												questiontitle.setText("Question 5");

												JLabel questionlabel = new JLabel();
												questionlabel.setText("What Organization supports the GNU Project? ");

												ButtonGroup BG = new ButtonGroup();
												JRadioButton AC1 = new JRadioButton("The Open Source Initiative");
												JRadioButton AC2 = new JRadioButton("The Free Software Foundation");
												JRadioButton AC3 = new JRadioButton("Oracle");
												JRadioButton AC4 = new JRadioButton("Sun Microsystems");
												AC1.setActionCommand("AC1");
												AC2.setActionCommand("AC2");
												AC3.setActionCommand("AC3");
												AC4.setActionCommand("AC4");

												BG.add(AC1);
												BG.add(AC2);
												BG.add(AC3);
												BG.add(AC4);

												JPanel viewPanel = new JPanel();
												viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

												viewPanel.add(questionlabel);
												viewPanel.add(AC1);
												viewPanel.add(AC2);
												viewPanel.add(AC3);
												viewPanel.add(AC4);

												JButton nextButton = new JButton("Next");
												viewPanel.add(nextButton);

												f.add(viewPanel);

												f.getContentPane().validate();
												f.repaint();
												nextButton.addActionListener(new ActionListener() {
													@Override
													public void actionPerformed(ActionEvent e) {
														selections.add(BG.getSelection().getActionCommand());
														f.getContentPane().removeAll();
														f.getContentPane().validate();
														f.repaint();

														JLabel questiontitle = new JLabel();
														questiontitle.setText("Question 6");

														JLabel questionlabel = new JLabel();
														questionlabel.setText("A license that has minimum restrictions such as the Apache license is known as: ");

														ButtonGroup BG = new ButtonGroup();
														JRadioButton AC1 = new JRadioButton("tolerant");
														JRadioButton AC2 = new JRadioButton("indulgent");
														JRadioButton AC3 = new JRadioButton("copyleft");
														JRadioButton AC4 = new JRadioButton("permissive");
														AC1.setActionCommand("AC1");
														AC2.setActionCommand("AC2");
														AC3.setActionCommand("AC3");
														AC4.setActionCommand("AC4");

														BG.add(AC1);
														BG.add(AC2);
														BG.add(AC3);
														BG.add(AC4);

														JPanel viewPanel = new JPanel();
														viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

														viewPanel.add(questionlabel);
														viewPanel.add(AC1);
														viewPanel.add(AC2);
														viewPanel.add(AC3);
														viewPanel.add(AC4);

														JButton nextButton = new JButton("Next");
														viewPanel.add(nextButton);

														f.add(viewPanel);

														f.getContentPane().validate();
														f.repaint();
														nextButton.addActionListener(new ActionListener() {
															@Override
															public void actionPerformed(ActionEvent e) {
																selections.add(BG.getSelection().getActionCommand());
																f.getContentPane().removeAll();
																f.getContentPane().validate();
																f.repaint();

																JLabel questiontitle = new JLabel();
																questiontitle.setText("Question 7");

																JLabel questionlabel = new JLabel();
																questionlabel.setText("How many freedoms are protected by free software? ");

																ButtonGroup BG = new ButtonGroup();
																JRadioButton AC1 = new JRadioButton("1");
																JRadioButton AC2 = new JRadioButton("2");
																JRadioButton AC3 = new JRadioButton("3");
																JRadioButton AC4 = new JRadioButton("4");
																AC1.setActionCommand("AC1");
																AC2.setActionCommand("AC2");
																AC3.setActionCommand("AC3");
																AC4.setActionCommand("AC4");

																BG.add(AC1);
																BG.add(AC2);
																BG.add(AC3);
																BG.add(AC4);

																JPanel viewPanel = new JPanel();
																viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

																viewPanel.add(questionlabel);
																viewPanel.add(AC1);
																viewPanel.add(AC2);
																viewPanel.add(AC3);
																viewPanel.add(AC4);

																JButton nextButton = new JButton("Next");
																viewPanel.add(nextButton);

																f.add(viewPanel);

																f.getContentPane().validate();
																f.repaint();
																nextButton.addActionListener(new ActionListener() {
																	@Override
																	public void actionPerformed(ActionEvent e) {
																		selections.add(BG.getSelection().getActionCommand());
																		f.getContentPane().removeAll();
																		f.getContentPane().validate();
																		f.repaint();

																		JLabel questiontitle = new JLabel();
																		questiontitle.setText("Question 8");

																		JLabel questionlabel = new JLabel();
																		questionlabel.setText("Audacity, a free software, is used for what main purpose? ");

																		ButtonGroup BG = new ButtonGroup();
																		JRadioButton AC1 = new JRadioButton("Word Processing");
																		JRadioButton AC2 = new JRadioButton("Video Editing");
																		JRadioButton AC3 = new JRadioButton("Music Editing");
																		JRadioButton AC4 = new JRadioButton("Picture Editing");
																		AC1.setActionCommand("AC1");
																		AC2.setActionCommand("AC2");
																		AC3.setActionCommand("AC3");
																		AC4.setActionCommand("AC4");

																		BG.add(AC1);
																		BG.add(AC2);
																		BG.add(AC3);
																		BG.add(AC4);

																		JPanel viewPanel = new JPanel();
																		viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

																		viewPanel.add(questionlabel);
																		viewPanel.add(AC1);
																		viewPanel.add(AC2);
																		viewPanel.add(AC3);
																		viewPanel.add(AC4);

																		JButton nextButton = new JButton("Next");
																		viewPanel.add(nextButton);

																		f.add(viewPanel);

																		f.getContentPane().validate();
																		f.repaint();
																		nextButton.addActionListener(new ActionListener() {
																			@Override
																			public void actionPerformed(ActionEvent e) {
																				selections.add(BG.getSelection().getActionCommand());
																				f.getContentPane().removeAll();
																				f.getContentPane().validate();
																				f.repaint();

																				JLabel questiontitle = new JLabel();
																				questiontitle.setText("Question 9");

																				JLabel questionlabel = new JLabel();
																				questionlabel.setText("What organization defines Open Source rules? ");

																				ButtonGroup BG = new ButtonGroup();
																				JRadioButton AC1 = new JRadioButton("The Open Source Initiative");
																				JRadioButton AC2 = new JRadioButton("The Open Source Board");
																				JRadioButton AC3 = new JRadioButton("The Open Source Institute");
																				JRadioButton AC4 = new JRadioButton("The Open Source Committee");
																				AC1.setActionCommand("AC1");
																				AC2.setActionCommand("AC2");
																				AC3.setActionCommand("AC3");
																				AC4.setActionCommand("AC4");

																				BG.add(AC1);
																				BG.add(AC2);
																				BG.add(AC3);
																				BG.add(AC4);

																				JPanel viewPanel = new JPanel();
																				viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

																				viewPanel.add(questionlabel);
																				viewPanel.add(AC1);
																				viewPanel.add(AC2);
																				viewPanel.add(AC3);
																				viewPanel.add(AC4);

																				JButton nextButton = new JButton("Next");
																				viewPanel.add(nextButton);

																				f.add(viewPanel);

																				f.getContentPane().validate();
																				f.repaint();
																				nextButton.addActionListener(new ActionListener() {
																					@Override
																					public void actionPerformed(ActionEvent e) {
																						selections.add(BG.getSelection().getActionCommand());
																						f.getContentPane().removeAll();
																						f.getContentPane().validate();
																						f.repaint();

																						JLabel questiontitle = new JLabel();
																						questiontitle.setText("Question 10");

																						JLabel questionlabel = new JLabel();
																						questionlabel.setText("Which was the first commercial company to put its software in Open Source?");

																						ButtonGroup BG = new ButtonGroup();
																						JRadioButton AC1 = new JRadioButton("Windows");
																						JRadioButton AC2 = new JRadioButton("Netscape");
																						JRadioButton AC3 = new JRadioButton("IBM");
																						JRadioButton AC4 = new JRadioButton("Apple");
																						AC1.setActionCommand("AC1");
																						AC2.setActionCommand("AC2");
																						AC3.setActionCommand("AC3");
																						AC4.setActionCommand("AC4");

																						BG.add(AC1);
																						BG.add(AC2);
																						BG.add(AC3);
																						BG.add(AC4);

																						JPanel viewPanel = new JPanel();
																						viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

																						viewPanel.add(questionlabel);
																						viewPanel.add(AC1);
																						viewPanel.add(AC2);
																						viewPanel.add(AC3);
																						viewPanel.add(AC4);

																						JButton nextButton = new JButton("Next");
																						viewPanel.add(nextButton);

																						f.add(viewPanel);


																						f.getContentPane().validate();
																						f.repaint();
																						nextButton.addActionListener(new ActionListener() {
																							@Override
																							public void actionPerformed(ActionEvent e) {
																								selections.add(BG.getSelection().getActionCommand());
																								f.getContentPane().removeAll();
																								f.getContentPane().validate();
																								f.repaint();

																								List<String> key = new ArrayList<>(Arrays.asList("AC1", "AC3", "AC2", "AC1", "AC2", "AC4", "AC4", "AC3", "AC1", "AC2"));

																								int numRight = 0;
																								for(int i=0; i<selections.size(); i++){
																									if(selections.get(i).equals(key.get(i))){
																										numRight++;
																									}
																								}

																								JLabel resultText = new JLabel("This concludes the FOSS Quiz, you got: ");
																								JLabel result = new JLabel(numRight + " out of 10 correct");
																								JLabel percentage = new JLabel((numRight*10)+"%");

																								JPanel viewPanel = new JPanel();
																								viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));

																								viewPanel.add(resultText);
																								viewPanel.add(result);
																								viewPanel.add(percentage);

																								f.add(viewPanel);


																								f.getContentPane().validate();
																								f.repaint();
																							}
																						});
																					}
																				});
																			}
																		});
																	}
																});
															}
														});
													}
												});
											}
										});
									}
								});			
							}
						});
					}
				});
			};

		});

		f.pack();
		f.setVisible(true);


	}
}