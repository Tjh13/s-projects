package my_projects;

import java.lang.Math;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;

public class BowlingGame {

	private JFrame frame;
	private JTextField textFrame;
	private JTextField textThrow;
	private JTextField textPoints;
	private JTextField textPinsLeft;
	private JTextField textPinsHit;
	private JTextField textStrikes;
	private JTextField textSpares;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BowlingGame window = new BowlingGame();
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
	public BowlingGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		boolean gameOver = false;
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 64, 128));
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 538, 223);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bowling!");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(207, 0, 110, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFrame = new JLabel("Frame: ");
		lblFrame.setForeground(new Color(255, 255, 255));
		lblFrame.setFont(new Font("Verdana", Font.BOLD, 11));
		lblFrame.setBounds(10, 50, 54, 14);
		frame.getContentPane().add(lblFrame);
		
		JLabel lblThrow = new JLabel("Throw: ");
		lblThrow.setForeground(new Color(255, 255, 255));
		lblThrow.setFont(new Font("Verdana", Font.BOLD, 11));
		lblThrow.setBounds(10, 75, 54, 14);
		frame.getContentPane().add(lblThrow);
		
		JLabel lblPoints = new JLabel("Points: ");
		lblPoints.setForeground(new Color(255, 255, 255));
		lblPoints.setFont(new Font("Verdana", Font.BOLD, 11));
		lblPoints.setBounds(10, 100, 54, 14);
		frame.getContentPane().add(lblPoints);
		
		JLabel lblExclamation = new JLabel("");
		lblExclamation.setForeground(new Color(255, 255, 255));
		lblExclamation.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblExclamation.setHorizontalAlignment(SwingConstants.CENTER);
		lblExclamation.setBounds(158, 141, 170, 32);
		frame.getContentPane().add(lblExclamation);
		
		JButton btnBowl = new JButton("Bowl!");
		btnBowl.setForeground(new Color(0, 64, 128));
		btnBowl.setBackground(new Color(0, 128, 255));
		btnBowl.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		btnBowl.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				try {
					
					// initialize variables
					int frameNum = Integer.parseInt(textFrame.getText());
					int throwNum = Integer.parseInt(textThrow.getText());
					int points = Integer.parseInt(textPoints.getText());
					int pinsHit = Integer.parseInt(textPinsHit.getText());
					int pinsLeft = Integer.parseInt(textPinsLeft.getText());
					int strikes = Integer.parseInt(textStrikes.getText());
					int spares = Integer.parseInt(textSpares.getText());
					
					// use roll method
					roll(frameNum, throwNum, points, pinsHit, pinsLeft, gameOver, strikes, spares, lblExclamation, textFrame, textThrow, textPoints, textPinsHit, textPinsLeft, textStrikes, textSpares);
					
				}
				
				catch (Exception f) {
					
					// tell user game is over
					JOptionPane.showInternalMessageDialog(null, "The game is over! Please exit in order to play again!");
					
				}
				
				
				
			}
		});
		btnBowl.setBounds(377, 72, 98, 23);
		frame.getContentPane().add(btnBowl);
		
		textFrame = new JTextField();
		textFrame.setText("1");
		textFrame.setBounds(71, 49, 39, 20);
		frame.getContentPane().add(textFrame);
		textFrame.setColumns(10);
		
		textThrow = new JTextField();
		textThrow.setText("1");
		textThrow.setColumns(10);
		textThrow.setBounds(71, 72, 39, 20);
		frame.getContentPane().add(textThrow);
		
		textPoints = new JTextField();
		textPoints.setText("0");
		textPoints.setColumns(10);
		textPoints.setBounds(71, 97, 39, 20);
		frame.getContentPane().add(textPoints);
		
		JLabel lblPinsHit = new JLabel("Pins hit:");
		lblPinsHit.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPinsHit.setForeground(new Color(255, 255, 255));
		lblPinsHit.setFont(new Font("Verdana", Font.BOLD, 11));
		lblPinsHit.setBounds(120, 50, 54, 14);
		frame.getContentPane().add(lblPinsHit);
		
		JLabel lblPinsLeft = new JLabel("Pins left:");
		lblPinsLeft.setForeground(new Color(255, 255, 255));
		lblPinsLeft.setFont(new Font("Verdana", Font.BOLD, 11));
		lblPinsLeft.setBounds(120, 100, 65, 14);
		frame.getContentPane().add(lblPinsLeft);
		
		textPinsLeft = new JTextField();
		textPinsLeft.setText("10");
		textPinsLeft.setColumns(10);
		textPinsLeft.setBounds(179, 98, 26, 20);
		frame.getContentPane().add(textPinsLeft);
		
		textPinsHit = new JTextField();
		textPinsHit.setText("0");
		textPinsHit.setColumns(10);
		textPinsHit.setBounds(179, 48, 26, 20);
		frame.getContentPane().add(textPinsHit); 
		
		JLabel lblStrikes = new JLabel("Strikes:");
		lblStrikes.setForeground(Color.WHITE);
		lblStrikes.setFont(new Font("Verdana", Font.BOLD, 11));
		lblStrikes.setBounds(224, 51, 54, 14);
		frame.getContentPane().add(lblStrikes);
		
		JLabel lblSpares = new JLabel("Spares:");
		lblSpares.setForeground(Color.WHITE);
		lblSpares.setFont(new Font("Verdana", Font.BOLD, 11));
		lblSpares.setBounds(224, 101, 54, 14);
		frame.getContentPane().add(lblSpares);
		
		textStrikes = new JTextField();
		textStrikes.setText("0");
		textStrikes.setColumns(10);
		textStrikes.setBounds(275, 48, 26, 20);
		frame.getContentPane().add(textStrikes);
		
		textSpares = new JTextField();
		textSpares.setText("0");
		textSpares.setColumns(10);
		textSpares.setBounds(275, 98, 26, 20);
		frame.getContentPane().add(textSpares);
	
	
	}	
			
	
	// DESCRIPTION: simulates one roll in a game of bowling
	// PARAMETERS: int fn, int tn, int p, int ph, int pl, boolean go, int st, int sp, JLabel lblExclamation, JTextField textFrame, JTextField textThrow, JTextField textPoints, JTextField textPinsHit, JTextField textPinsLeft, JTextField textStrikes, JTextField textSpares
	// RETURN TYPE: void
	public static void roll(int fn, int tn, int p, int ph, int pl, boolean go, int st, int sp, JLabel lblExclamation, JTextField textFrame, JTextField textThrow, JTextField textPoints, JTextField textPinsHit, JTextField textPinsLeft, JTextField textStrikes, JTextField textSpares) {
		
			
			// check if the frame number is less than or equal to 10
			if (fn <= 10) {
				
				// if it is the first throw of a frame, create a new Bowling Class
				if (tn == 1) {
					
						Bowling bowl1 = new Bowling(10, Math.round(Math.random() * 10));
						
						// if all 10 pins were hit, add 20 points and go to next frame
						if (bowl1.pinsHit == 10)
						{
							
							p += 20;
							lblExclamation.setText("Strike!");
							st++;
							textStrikes.setText(Integer.toString(st));
							fn++;
							
						}
						
						// if all 10 pins weren't hit, add corresponding points, set new pinsHit and pinsLeft values, and go to next throw
						else {
							
							p += Math.round(bowl1.pinsHit);
							ph = Math.round(bowl1.pinsHit);
							pl = 10 - ph;
							lblExclamation.setText("You hit " + ph + " pin(s)!");
							
							tn++;
							
						}
						
						// output result to textFields
						textFrame.setText(Integer.toString(fn));
						textThrow.setText(Integer.toString(tn));
						textPoints.setText(Integer.toString(p));
						textPinsHit.setText(Integer.toString(ph));
						textPinsLeft.setText(Integer.toString(pl));
							
				}
				
				// if it is the second throw of a frame, create new Bowling Class using new pinsLeft and pinsHit values
				else {
					
					Bowling bowl2 = new Bowling(pl, Math.round(Math.random() * pl));
					
					// if all the pins left were hit, increase points by 15 for the frame
					if (bowl2.pinsHit == bowl2.pinsLeft) {
						
						p += (15 - ph);
						lblExclamation.setText("Spare!");
						sp++;
						textSpares.setText(Integer.toString(sp));
						
					}
					
					// if not all the pins left were hit, increase points by number of pins hit
					else {
						
						ph = Math.round(bowl2.pinsHit);
						p += Math.round(bowl2.pinsHit);
						lblExclamation.setText("You hit " + ph + " pin(s)!");

						
					}
					
					// if game isn't over, go to next frame, set throwNumber back to 1, output result to GUI
					fn++;
					tn--;
					
					if (fn != 11) {
						
						textFrame.setText(Integer.toString(fn));
						textThrow.setText(Integer.toString(tn));
						
					}
					
					// if game is over, let user know
					else {
						
						textFrame.setText("Game!");
						textThrow.setText("Game!");
						
					}

					textPoints.setText(Integer.toString(p));
					textPinsHit.setText("0");
					textPinsLeft.setText("10");
					
				}
				
				
				
			}
			
			
		
	}
}