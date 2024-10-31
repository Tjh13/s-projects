package my_projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SleepCalculatorGUI {

	private JFrame frame;
	private JTextField textBDay;
	private JTextField textBMonth;
	private JTextField textBYear;
	private JTextField textTYear;
	private JTextField textTMonth;
	private JTextField textTDay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SleepCalculatorGUI window = new SleepCalculatorGUI();
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
	public SleepCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sleep Calculator!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(150, 11, 164, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your birthday!");
		lblNewLabel_1.setBounds(24, 53, 112, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter today's date!");
		lblNewLabel_2.setBounds(301, 53, 123, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Day");
		lblNewLabel_3.setBounds(101, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Month");
		lblNewLabel_3_1.setBounds(101, 130, 46, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Year");
		lblNewLabel_3_1_1.setBounds(101, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Year");
		lblNewLabel_3_1_1_1.setBounds(296, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Month");
		lblNewLabel_3_1_1_1_1.setBounds(296, 130, 46, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("Day");
		lblNewLabel_3_1_1_1_2.setBounds(296, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_1_2);
		
		textBDay = new JTextField();
		textBDay.setBounds(55, 85, 36, 20);
		frame.getContentPane().add(textBDay);
		textBDay.setColumns(10);
		
		textBMonth = new JTextField();
		textBMonth.setColumns(10);
		textBMonth.setBounds(55, 127, 36, 20);
		frame.getContentPane().add(textBMonth);
		
		textBYear = new JTextField();
		textBYear.setColumns(10);
		textBYear.setBounds(55, 174, 36, 20);
		frame.getContentPane().add(textBYear);
		
		textTYear = new JTextField();
		textTYear.setColumns(10);
		textTYear.setBounds(338, 174, 36, 20);
		frame.getContentPane().add(textTYear);
		
		textTMonth = new JTextField();
		textTMonth.setColumns(10);
		textTMonth.setBounds(338, 127, 36, 20);
		frame.getContentPane().add(textTMonth);
		
		textTDay = new JTextField();
		textTDay.setColumns(10);
		textTDay.setBounds(338, 85, 36, 20);
		frame.getContentPane().add(textTDay);
		
		JLabel lblDaysResult = new JLabel("You have been alive for... ");
		lblDaysResult.setBounds(101, 212, 241, 14);
		frame.getContentPane().add(lblDaysResult);
		
		JButton btnExit = new JButton("Exit!");
		btnExit.setBounds(169, 126, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblHoursResult = new JLabel("You have slept for...");
		lblHoursResult.setBounds(101, 237, 241, 14);
		frame.getContentPane().add(lblHoursResult);
		
		JButton btnCalculate = new JButton("Calculate!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// catch invalid inputs
				try {
					
					// initialize variables
					boolean cancel = false;
					int testTDay = Integer.parseInt(textTDay.getText());
					int testTMonth = Integer.parseInt(textTMonth.getText());
					int testTYear = Integer.parseInt(textTYear.getText());
					int testBDay = Integer.parseInt(textBDay.getText());
					int testBMonth = Integer.parseInt(textBMonth.getText());
					int testBYear = Integer.parseInt(textBYear.getText());
					int tDay = testTDay;
					int tMonth = testTMonth;
					int tYear = testTYear;
					int bDay = testBDay;
					int bMonth = testBMonth;
					int bYear = testBYear;
					int daysToTYear = 0;
					int daysToTMonth = 0;
					int daysToBYear = 0;
					int daysToBMonth = 0;
					int totalTDays = 0;
					int totalBDays = 0;
					int finalDays = 0;
					int finalHours = 0;
					
					// check to make sure current day is valid
					if (1 <= testTDay && testTDay <= 31) {						
					}
					
					else {						
						JOptionPane.showInternalMessageDialog(null, "Invalid entry! Please enter valid dates!");
						cancel = true;
					}
					
					// check to make sure birth day is valid
					if (1 <= testBDay && testBDay <= 31) {						
					}
					
					else {
						JOptionPane.showInternalMessageDialog(null, "Invalid entry! Please enter valid dates!");
						cancel = true;
					}
					
					// check to make sure current month is valid
					if (1 <= testTMonth && testTMonth <= 12) {	
					}
					
					else {
						JOptionPane.showInternalMessageDialog(null, "Invalid entry! Please enter valid dates!");	
						cancel = true;
					}
					
					// check to make sure birth month is valid
					if (1 <= testBMonth && testBMonth <= 12) {
					}
					
					else {	
						JOptionPane.showInternalMessageDialog(null, "Invalid entry! Please enter valid dates!");
						cancel = true;
					}
					
					
					// check to make sure birth year is valid
					if (1 <= testTYear && testTYear <= 2023) {	
					}
					
					else {
						JOptionPane.showInternalMessageDialog(null, "Invalid entry! Please enter valid dates!");		
						cancel = true;
					}
					
					// check to make sure current year is valid
					if (1 <= testBYear && testBYear <= 2023) {
					}
					
					else {	
						JOptionPane.showInternalMessageDialog(null, "Invalid entry! Please enter valid dates!");	
						cancel = true;
					}
					
					// calculate how many years you've been alive for and how long you've slept
					if (cancel == false) {
						
						daysToTYear = 365 * (tYear-1);
						daysToTMonth = 30 * (tMonth-1);
						totalTDays = daysToTYear + daysToTMonth + tDay;
						daysToBYear = 365 * (bYear-1);
						daysToBMonth = 30 * (bMonth-1);
						totalBDays = daysToBYear + daysToBMonth + bDay;
						finalDays = totalTDays - totalBDays;
						finalHours = finalDays * 8;
						
						lblDaysResult.setText("You have been alive for... " + finalDays + " days!");
						lblHoursResult.setText("You have slept for..." + finalHours + " hours!");
						
					}

					
				}	
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Invalid entry! Please enter integers in each of the designated text fields!");
					
				}
				
				
				
				
			}
		});
		btnCalculate.setBounds(169, 84, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
	}
	
}
