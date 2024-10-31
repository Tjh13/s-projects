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

public class RollerCoaster {

	private JFrame frame;
	private JTextField textHeight;
	private JTextField textBack;
	private JTextField textHeart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RollerCoaster window = new RollerCoaster();
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
	public RollerCoaster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// initialize number and sum variables, use traceTable function
		int number = 11;
		int sum = 0;

		traceTable(number, sum);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Can You Ride This Roller Coaster?");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 11, 377, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textHeight = new JTextField();
		textHeight.setForeground(new Color(255, 0, 0));
		textHeight.setBounds(136, 51, 86, 20);
		frame.getContentPane().add(textHeight);
		textHeight.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Height (in cm):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 54, 116, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Back Trouble? (Y/N)");
		lblNewLabel_1_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 91, 116, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textBack = new JTextField();
		textBack.setForeground(new Color(255, 0, 0));
		textBack.setColumns(10);
		textBack.setBounds(136, 88, 86, 20);
		frame.getContentPane().add(textBack);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Heart Trouble? (Y/N)");
		lblNewLabel_1_1_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(0, 127, 126, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textHeart = new JTextField();
		textHeart.setForeground(new Color(255, 0, 0));
		textHeart.setColumns(10);
		textHeart.setBounds(136, 124, 86, 20);
		frame.getContentPane().add(textHeart);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBackground(new Color(240, 240, 240));
		lblResult.setForeground(new Color(255, 0, 0));
		lblResult.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(28, 170, 377, 30);
		frame.getContentPane().add(lblResult);
		
		JButton btnNewButton = new JButton("Calculate!");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// take height, back trouble and heart trouble input from user and put into calculate function, use calculate function, catch errors
				try {
					
					int height = Integer.parseInt(textHeight.getText());
					String backTrouble = textBack.getText();
					String heartTrouble = textHeart.getText();
					
					calculate(height, backTrouble, heartTrouble, lblResult);
					
				}
				
				catch (Exception f)
				{
					
					JOptionPane.showInternalMessageDialog(null, "Invalid entry! Please enter an integer for \"Enter Height (in cm):\" and Y or N for \"Heart Trouble\" abd \"Back Trouble?\"!");

					
				}
				
				
			}
		});
		btnNewButton.setBounds(84, 211, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
	
	// DESCRIPTION: creates a trace table, outputs result
	// PARAMETERS: int n, int s
	// RETURN TYPE: void
	public static void traceTable(int n, int s) {
		
		while (n >= 0)  {
		    n--;
		    s += n * 5;

		    System.out.println("myNum: " + n + ", mySum: " + s);
		}
		
	}
	
	// DESCRIPTION: uses height, back trouble and heart trouble inputted by user to calculate whether they can ride the roller coaster or not
	// PARAMETERS: int h, String bt, String ht, JLabel lblResult
	// RETURN TYPE: void
	public static void calculate(int h, String bt, String ht, JLabel lblResult) {
		
		if ((h >= 122) && (h <= 188)) {
			
			if (bt.equalsIgnoreCase("N") || bt.equalsIgnoreCase("n")) {
					
				if (ht.equalsIgnoreCase("N") || ht.equalsIgnoreCase("n")) {
					
					lblResult.setText("It is okay for you to ride this roller coaster! Enjoy!");
					
				}
				
				else if (ht.equalsIgnoreCase("Y") || ht.equalsIgnoreCase("y")) {
					
					lblResult.setText("Sorry, it is not safe for you to ride this roller coaster.");
					
				}
				
				else {
					
					lblResult.setText("Please enter \"Y\" or \"N\" in the designated text boxes!");
					
				}
					
			}
			
			else if (bt.equalsIgnoreCase("Y") || bt.equalsIgnoreCase("y")) {
				
				lblResult.setText("Sorry, it is not safe for you to ride this roller coaster.");
				
			}
			
			else {
				
				lblResult.setText("Please enter \"Y\" or \"N\" in the designated text boxes!");
				
			}
			
		}
		
		else {
			
			lblResult.setText("Sorry, it is not safe for you to ride this roller coaster.");
			
		}
		
	}	
	
}