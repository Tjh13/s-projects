package my_projects;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.lang.Math;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MatchingGame {
	
	// Variable Declarations
	
	// To hold values: 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7
	ArrayList<Integer> orderedCards = new ArrayList<>();
	ArrayList<Integer> gameBoard = new ArrayList<>();
	int cardsFlipped = 0;
	
	boolean card1Flipped = false;
	boolean card2Flipped = false;
	boolean card3Flipped = false;
	boolean card4Flipped = false;
	boolean card5Flipped = false;
	boolean card6Flipped = false;
	boolean card7Flipped = false;
	boolean card8Flipped = false;
	boolean card9Flipped = false;
	boolean card10Flipped = false;
	boolean card11Flipped = false;
	boolean card12Flipped = false;
	boolean card13Flipped = false;
	boolean card14Flipped = false;
	boolean card15Flipped = false;
	boolean card16Flipped = false;
	
	boolean card1Done = false;
	boolean card2Done = false;
	boolean card3Done = false;
	boolean card4Done = false;
	boolean card5Done = false;
	boolean card6Done = false;
	boolean card7Done = false;
	boolean card8Done = false;
	boolean card9Done = false;
	boolean card10Done = false;
	boolean card11Done = false;
	boolean card12Done = false;
	boolean card13Done = false;
	boolean card14Done = false;
	boolean card15Done = false;
	boolean card16Done = false;
	
	boolean gameStart = false;
	
	int pic1Found = 0;
	int pic2Found = 0;
	int pic3Found = 0;
	int pic4Found = 0;
	int pic5Found = 0;
	int pic6Found = 0;
	int pic7Found = 0;
	int pic8Found = 0;
	
	int attempts = 0;
	
	ImageIcon pic1 = new ImageIcon(getClass().getResource("/resources/ram.jpg"));
	ImageIcon pic2 = new ImageIcon(getClass().getResource("/resources/case.jpg"));
	ImageIcon pic3 = new ImageIcon(getClass().getResource("/resources/dvd.jpg"));
	ImageIcon pic4 = new ImageIcon(getClass().getResource("/resources/harddrive.jpg"));
	ImageIcon pic5 = new ImageIcon(getClass().getResource("/resources/keyboard.jpg"));
	ImageIcon pic6 = new ImageIcon(getClass().getResource("/resources/mice.jpg"));
	ImageIcon pic7 = new ImageIcon(getClass().getResource("/resources/monitor.jpg"));
	ImageIcon pic8 = new ImageIcon(getClass().getResource("/resources/printer.jpg"));
	ImageIcon back = new ImageIcon(getClass().getResource("/resources/cardback.jpg"));
	ImageIcon done = new ImageIcon(getClass().getResource("/resources/done.jpg"));

	private JFrame frame;
	private JTextField txtAttempts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchingGame window = new MatchingGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MatchingGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 426, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMainTitle = new JLabel("Troy's Matching Game!");
		lblMainTitle.setBounds(10, 11, 226, 31);
		lblMainTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblMainTitle);
		
		JButton card1 = new JButton("");
		card1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// if card is clicked, make sure the game has started, that
				// cards haven't already been flipped, that this card hasn't 
				// already been flipped, and that this card hasn't already been matched.
				// If these conditions are all met, check gameBoard array to see what 
				// picture corresponds to this card, and show that card. Increase the 
				// number of that type of card that has been found by 1. 
				
				// card1:
				if (gameStart == true && cardsFlipped < 2 && card1Flipped == false && card1Done == false) {
					
					if (gameBoard.get(0) == 0) {
						
						card1.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(0) == 1) {
						
						card1.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(0) == 2) {
						
						card1.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(0) == 3) {
		
						card1.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(0) == 4) {
		
						card1.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(0) == 5) {
		
						card1.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(0) == 6) {
				
						card1.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(0) == 7) {
		
						card1.setIcon(pic8);
						pic8Found++;
		
					}
					
					// increase cardsFlipped by 1, set card1Flipped to true
					cardsFlipped++;
					card1Flipped = true;
					
					// upon clicking the second card of a turn, increase # of attempts by 1
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card1.setBounds(10, 53, 90, 100);
		frame.getContentPane().add(card1);
		
		JButton card2 = new JButton("");
		card2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card2:
				if (gameStart == true && cardsFlipped < 2 && card2Flipped == false && card2Done == false) {
					
					if (gameBoard.get(1) == 0) {
						
						card2.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(1) == 1) {
						
						card2.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(1) == 2) {
						
						card2.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(1) == 3) {
		
						card2.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(1) == 4) {
		
						card2.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(1) == 5) {
		
						card2.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(1) == 6) {
				
						card2.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(1) == 7) {
		
						card2.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card2Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card2.setBounds(110, 53, 90, 100);
		frame.getContentPane().add(card2);
		
		JButton card3 = new JButton("");
		card3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card3:
				if (gameStart == true && cardsFlipped < 2 && card3Flipped == false && card3Done == false) {
					
					if (gameBoard.get(2) == 0) {
						
						card3.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(2) == 1) {
						
						card3.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(2) == 2) {
						
						card3.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(2) == 3) {
		
						card3.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(2) == 4) {
		
						card3.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(2) == 5) {
		
						card3.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(2) == 6) {
				
						card3.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(2) == 7) {
		
						card3.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card3Flipped = true;

					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
				
			}
		});
		card3.setBounds(210, 53, 90, 100);
		frame.getContentPane().add(card3);
		
		JButton card4 = new JButton("");
		card4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card4:
				if (gameStart == true && cardsFlipped < 2 && card4Flipped == false && card4Done == false) {
					

					if (gameBoard.get(3) == 0) {
						
						card4.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(3) == 1) {
						
						card4.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(3) == 2) {
						
						card4.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(3) == 3) {
		
						card4.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(3) == 4) {
		
						card4.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(3) == 5) {
		
						card4.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(3) == 6) {
				
						card4.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(3) == 7) {
		
						card4.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card4Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
				
			}
		});
		card4.setBounds(310, 53, 90, 100);
		frame.getContentPane().add(card4);
		
		JButton card5 = new JButton("");
		card5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card5:
				if (gameStart == true && cardsFlipped < 2 && card5Flipped == false && card5Done == false) {
					
					if (gameBoard.get(4) == 0) {
						
						card5.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(4) == 1) {
						
						card5.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(4) == 2) {
						
						card5.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(4) == 3) {
		
						card5.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(4) == 4) {
		
						card5.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(4) == 5) {
		
						card5.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(4) == 6) {
				
						card5.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(4) == 7) {
		
						card5.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card5Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
				
				
			}
		});
		card5.setBounds(10, 164, 90, 100);
		frame.getContentPane().add(card5);
		
		JButton card6 = new JButton("");
		card6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card6:
				if (gameStart == true && cardsFlipped < 2 && card6Flipped == false && card6Done == false) {
					
					if (gameBoard.get(5) == 0) {
						
						card6.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(5) == 1) {
						
						card6.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(5) == 2) {
						
						card6.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(5) == 3) {
		
						card6.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(5) == 4) {
		
						card6.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(5) == 5) {
		
						card6.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(5) == 6) {
				
						card6.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(5) == 7) {
		
						card6.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card6Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
				
				
			}
		});
		card6.setBounds(110, 164, 90, 100);
		frame.getContentPane().add(card6);
		
		JButton card7 = new JButton("");
		card7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card7:
				if (gameStart == true && cardsFlipped < 2 && card7Flipped == false && card7Done == false) {
					
					if (gameBoard.get(6) == 0) {
						
						card7.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(6) == 1) {
						
						card7.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(6) == 2) {
						
						card7.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(6) == 3) {
		
						card7.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(6) == 4) {
		
						card7.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(6) == 5) {
		
						card7.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(6) == 6) {
				
						card7.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(6) == 7) {
		
						card7.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card7Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card7.setBounds(210, 164, 90, 100);
		frame.getContentPane().add(card7);
		
		JButton card8 = new JButton("");
		card8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card8:
				if (gameStart == true && cardsFlipped < 2 && card8Flipped == false && card8Done == false) {
					
					if (gameBoard.get(7) == 0) {
						
						card8.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(7) == 1) {
						
						card8.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(7) == 2) {
						
						card8.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(7) == 3) {
		
						card8.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(7) == 4) {
		
						card8.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(7) == 5) {
		
						card8.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(7) == 6) {
				
						card8.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(7) == 7) {
		
						card8.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card8Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card8.setBounds(310, 164, 90, 100);
		frame.getContentPane().add(card8);
		
		JButton card9 = new JButton("");
		card9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card9:
				if (gameStart == true && cardsFlipped < 2 && card9Flipped == false && card9Done == false) {
					
					if (gameBoard.get(8) == 0) {
						
						card9.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(8) == 1) {
						
						card9.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(8) == 2) {
						
						card9.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(8) == 3) {
		
						card9.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(8) == 4) {
		
						card9.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(8) == 5) {
		
						card9.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(8) == 6) {
				
						card9.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(8) == 7) {
		
						card9.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card9Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card9.setBounds(10, 275, 90, 100);
		frame.getContentPane().add(card9);
		
		JButton card10 = new JButton("");
		card10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card10:
				if (gameStart == true && cardsFlipped < 2 && card10Flipped == false && card10Done == false) {
					
					if (gameBoard.get(9) == 0) {
						
						card10.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(9) == 1) {
						
						card10.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(9) == 2) {
						
						card10.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(9) == 3) {
		
						card10.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(9) == 4) {
		
						card10.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(9) == 5) {
		
						card10.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(9) == 6) {
				
						card10.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(9) == 7) {
		
						card10.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card10Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card10.setBounds(110, 275, 90, 100);
		frame.getContentPane().add(card10);
		
		JButton card11 = new JButton("");
		card11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card11:
				if (gameStart == true && cardsFlipped < 2 && card11Flipped == false && card11Done == false) {
					
					if (gameBoard.get(10) == 0) {
						
						card11.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(10) == 1) {
						
						card11.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(10) == 2) {
						
						card11.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(10) == 3) {
		
						card11.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(10) == 4) {
		
						card11.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(10) == 5) {
		
						card11.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(10) == 6) {
				
						card11.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(10) == 7) {
		
						card11.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card11Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card11.setBounds(210, 275, 90, 100);
		frame.getContentPane().add(card11);
		
		JButton card12 = new JButton("");
		card12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card12:
				if (gameStart == true && cardsFlipped < 2 && card12Flipped == false && card12Done == false) {
					
					if (gameBoard.get(11) == 0) {
						
						card12.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(11) == 1) {
						
						card12.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(11) == 2) {
						
						card12.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(11) == 3) {
		
						card12.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(11) == 4) {
		
						card12.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(11) == 5) {
		
						card12.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(11) == 6) {
				
						card12.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(11) == 7) {
		
						card12.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card12Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card12.setBounds(310, 275, 90, 100);
		frame.getContentPane().add(card12);
		
		JButton card13 = new JButton("");
		card13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card13:
				if (gameStart == true && cardsFlipped < 2 && card13Flipped == false && card13Done == false) {
					
					if (gameBoard.get(12) == 0) {
						
						card13.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(12) == 1) {
						
						card13.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(12) == 2) {
						
						card13.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(12) == 3) {
		
						card13.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(12) == 4) {
		
						card13.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(12) == 5) {
		
						card13.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(12) == 6) {
				
						card13.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(12) == 7) {
		
						card13.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card13Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card13.setBounds(10, 386, 90, 100);
		frame.getContentPane().add(card13);
		
		JButton card14 = new JButton("");
		card14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card14:
				if (gameStart == true && cardsFlipped < 2 && card14Flipped == false && card14Done == false) {
					
					if (gameBoard.get(13) == 0) {
						
						card14.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(13) == 1) {
						
						card14.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(13) == 2) {
						
						card14.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(13) == 3) {
		
						card14.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(13) == 4) {
		
						card14.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(13) == 5) {
		
						card14.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(13) == 6) {
				
						card14.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(13) == 7) {
		
						card14.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card14Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card14.setBounds(110, 386, 90, 100);
		frame.getContentPane().add(card14);
		
		JButton card15 = new JButton("");
		card15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card15:
				if (gameStart == true && cardsFlipped < 2 && card15Flipped == false && card15Done == false) {
					
					if (gameBoard.get(14) == 0) {
						
						card15.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(14) == 1) {
						
						card15.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(14) == 2) {
						
						card15.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(14) == 3) {
		
						card15.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(14) == 4) {
		
						card15.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(14) == 5) {
		
						card15.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(14) == 6) {
				
						card15.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(14) == 7) {
		
						card15.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card15Flipped = true;

					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
			}
		});
		card15.setBounds(210, 386, 90, 100);
		frame.getContentPane().add(card15);
		
		JButton card16 = new JButton("");
		card16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// card16:
				if (gameStart == true && cardsFlipped < 2 && card16Flipped == false && card16Done == false) {
					
					if (gameBoard.get(15) == 0) {
						
						card16.setIcon(pic1);
						pic1Found++;
						
					}
					
					else if (gameBoard.get(15) == 1) {
						
						card16.setIcon(pic2);
						pic2Found++;
						
					}
					
					else if (gameBoard.get(15) == 2) {
						
						card16.setIcon(pic3);
						pic3Found++;
						
					}
					
					else if (gameBoard.get(15) == 3) {
		
						card16.setIcon(pic4);
						pic4Found++;
		
					}
					
					else if (gameBoard.get(15) == 4) {
		
						card16.setIcon(pic5);
						pic5Found++;
		
					}
					
					else if (gameBoard.get(15) == 5) {
		
						card16.setIcon(pic6);
						pic6Found++;
			
					}
					
					else if (gameBoard.get(15) == 6) {
				
						card16.setIcon(pic7);
						pic7Found++;
		
					}
					
					else if (gameBoard.get(15) == 7) {
		
						card16.setIcon(pic8);
						pic8Found++;
		
					}
					
					cardsFlipped++;
					card16Flipped = true;
					
					
					
					if (cardsFlipped == 2) {
						
						attempts++;
						txtAttempts.setText(Integer.toString(attempts));
						
					}
					
				}
				
				
				
			}
		});
		card16.setBounds(310, 386, 90, 100);
		frame.getContentPane().add(card16);
		
		
		
		JButton btnPlay = new JButton("Play!");
		btnPlay.setBounds(10, 501, 89, 23);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// reinitialize variables
				gameStart = true; 
				
				cardsFlipped = 0;
				
				card1Flipped = false;
				card2Flipped = false;
				card3Flipped = false;
				card4Flipped = false;
				card5Flipped = false;
				card6Flipped = false;
				card7Flipped = false;
				card8Flipped = false;
				card9Flipped = false;
				card10Flipped = false;
				card11Flipped = false;
				card12Flipped = false;
				card13Flipped = false;
				card14Flipped = false;
				card15Flipped = false;
				card16Flipped = false;
				
				card1Done = false;
				card2Done = false;
				card3Done = false;
				card4Done = false;
				card5Done = false;
				card6Done = false;
				card7Done = false;
				card8Done = false;
				card9Done = false;
				card10Done = false;
				card11Done = false;
				card12Done = false;
				card13Done = false;
				card14Done = false;
				card15Done = false;
				card16Done = false;
				
				pic1Found = 0;
				pic2Found = 0;
				pic3Found = 0;
				pic4Found = 0;
				pic5Found = 0;
				pic6Found = 0;
				pic7Found = 0;
				pic8Found = 0;
				
				card1.setIcon(back);
				card2.setIcon(back);
				card3.setIcon(back);
				card4.setIcon(back);
				card5.setIcon(back);
				card6.setIcon(back);
				card7.setIcon(back);
				card8.setIcon(back);
				card9.setIcon(back);
				card10.setIcon(back);
				card11.setIcon(back);
				card12.setIcon(back);
				card13.setIcon(back);
				card14.setIcon(back);
				card15.setIcon(back);
				card16.setIcon(back);
				
				attempts = 0;
				txtAttempts.setText(Integer.toString(attempts));
				orderedCards.clear();
				gameBoard.clear();
				
				// create new orderedCards array list that holds values 0, 1, 2, 3, 4, 5, 6, 
				// and 7 twice each
				for (int i=0; i<8; i++) {
					
					for (int j=0; j<2; j++) {
						
						orderedCards.add(i);
						
					}
					
				}
				
				// create new gameBoard array list that randomizes the values in orderedCards
				int random;
				for (int i=15; i>=0; i--) {
					
					random = (int)(Math.random() * (i+1));
					gameBoard.add(orderedCards.get(random));
					orderedCards.remove(orderedCards.get(random));
					
				}
				
			}
		});
		frame.getContentPane().add(btnPlay);
		
		JButton btnGuessAgain = new JButton("Guess Again!");
		btnGuessAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// make sure two cards have been flipped
				if (cardsFlipped == 2) {
					
					// reset cardsFlipped for next round
					cardsFlipped = 0;
					
					// for each card, check if two identical pictures have been found.
					// If so, set the picture on that card to done so that it cannot be 
					// clicked any more. 
					if (card1Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {
							
							card1Done = true;
							card1.setIcon(done);
							
						}
						
						else {
							
							card1.setIcon(back);
							
						}
						
					}
					
					if (card2Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card2Done = true;
							card2.setIcon(done);
							
						}
						
						else {
							
							card2.setIcon(back);
							
						}
						
					}
					
					if (card3Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card3Done = true;
							card3.setIcon(done);
							
						}
						
						else {
							
							card3.setIcon(back);
							
						}
						
					}
					
					if (card4Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card4Done = true;
							card4.setIcon(done);
							
						}
						
						else {
							
							card4.setIcon(back);
							
						}
						
					}
					
					if (card5Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card5Done = true;
							card5.setIcon(done);
							
						}
						
						else {
							
							card5.setIcon(back);
							
						}
						
					}
					
					if (card6Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card6Done = true;
							card6.setIcon(done);
							
						}
						
						else {
							
							card6.setIcon(back);
							
						}
						
					}
					
					if (card7Flipped == true) {
						
						if (pic7Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card7Done = true;
							card7.setIcon(done);
							
						}
						
						else {
							
							card7.setIcon(back);
							
						}
						
					}
					
					if (card8Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card8Done = true;
							card8.setIcon(done);
							
						}
						
						else {
							
							card8.setIcon(back);
							
						}
						
					}
					
					if (card9Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card9Done = true;
							card9.setIcon(done);
							
						}
						
						else {
							
							card9.setIcon(back);
							
						}
						
					}
					
					if (card10Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card10Done = true;
							card10.setIcon(done);
							
						}
						
						else {
							
							card10.setIcon(back);
							
						}
						
					}
					
					if (card11Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card11Done = true;
							card11.setIcon(done);
							
						}
						
						else {
							
							card11.setIcon(back);
							
						}
						
					}
					
					if (card12Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card12Done = true;
							card12.setIcon(done);
							
						}
						
						else {
							
							card12.setIcon(back);
							
						}
						
					}
					
					if (card13Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card13Done = true;
							card13.setIcon(done);
							
						}
						
						else {
							
							card13.setIcon(back);
							
						}
						
					}
					
					if (card14Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card14Done = true;
							card14.setIcon(done);
							
						}
						
						else {
							
							card14.setIcon(back);
							
						}
						
					}
					
					if (card15Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {

							card15Done = true;
							card15.setIcon(done);
							
						}
						
						else {
							
							card15.setIcon(back);
							
						}
						
					}
					
					if (card16Flipped == true) {
						
						if (pic1Found == 2 || pic2Found == 2 || pic3Found == 2 || pic4Found == 2 || pic5Found == 2 || pic6Found == 2 || pic7Found == 2 || pic8Found == 2) {
							
							card16Done = true;
							card16.setIcon(done);
							
						}
						
						else {
							
							card16.setIcon(back);
							
						}
						
					}
		
					
					// If a picture was not found, reset its value for next round. 
					// If a picture was found, set its value to 3 so that it can no longer
					// be read in the future that this card has been found again. 
					if (pic1Found != 2) {
						
						pic1Found = 0;
						
					}
					else {
						
						pic1Found = 3;
						
					}
					
					
					if (pic1Found != 2) {
						
						pic2Found = 0;
						
					}
					else {
						
						pic2Found = 3;
						
					}
					

					if (pic3Found != 2) {
						
						pic3Found = 0;
						
					}
					else {
						
						pic3Found = 3;
						
					}
					
					
					if (pic4Found != 2) {
						
						pic4Found = 0;
						
					}
					else {
						
						pic4Found = 3;
						
					}
					
					
					if (pic5Found != 2) {
						
						pic5Found = 0;
						
					}
					else {
						
						pic5Found = 3;
						
					}
					
					
					if (pic6Found != 2) {
						
						pic6Found = 0;
						
					}
					else {
						
						pic6Found = 3;
						
					}
					
					
					if (pic7Found != 2) {
						
						pic7Found = 0;
						
					}
					else {
						
						pic7Found = 3;
						
					}
					
					
					if (pic8Found != 2) {
						
						pic8Found = 0;
						
					}
					else {
						
						pic8Found = 3;
						
					}
					
					// reset all cards
					card1Flipped = false;
					card2Flipped = false;
					card3Flipped = false;
					card4Flipped = false;
					card5Flipped = false;
					card6Flipped = false;
					card7Flipped = false;
					card8Flipped = false;
					card9Flipped = false;
					card10Flipped = false;
					card11Flipped = false;
					card12Flipped = false;
					card13Flipped = false;
					card14Flipped = false;
					card15Flipped = false;
					card16Flipped = false;
					
				}
				
				
			}
		});
		btnGuessAgain.setBounds(139, 501, 137, 23);
		frame.getContentPane().add(btnGuessAgain);
		
		JButton btnExit = new JButton("Exit!");
		btnExit.setBounds(310, 501, 89, 23);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Click Play to start, then click Guess Again after each guess!");
		lblNewLabel.setBounds(10, 535, 390, 23);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Attempts:");
		lblNewLabel_1.setBounds(256, 21, 59, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtAttempts = new JTextField();
		txtAttempts.setBounds(324, 18, 27, 20);
		frame.getContentPane().add(txtAttempts);
		txtAttempts.setColumns(10);
		
		// set all card icons to back
		card1.setIcon(back);
		card2.setIcon(back);
		card3.setIcon(back);
		card4.setIcon(back);
		card5.setIcon(back);
		card6.setIcon(back);
		card7.setIcon(back);
		card8.setIcon(back);
		card9.setIcon(back);
		card10.setIcon(back);
		card11.setIcon(back);
		card12.setIcon(back);
		card13.setIcon(back);
		card14.setIcon(back);
		card15.setIcon(back);
		card16.setIcon(back);
	}
	
}
