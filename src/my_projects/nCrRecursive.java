package my_projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nCrRecursive {

	private JFrame frame;
	private JTextField textR;
	private JTextField textN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nCrRecursive window = new nCrRecursive();
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
	public nCrRecursive() {
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
		
		JLabel lblNewLabel = new JLabel("nCr");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(193, 11, 82, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblThisProgramCalculates = new JLabel("This program calculates the possible number of combinations given a certain number");
		lblThisProgramCalculates.setBounds(10, 36, 414, 35);
		frame.getContentPane().add(lblThisProgramCalculates);
		
		JLabel lblOfItemsTo = new JLabel("of items being chosen out of a certain number of total items");
		lblOfItemsTo.setBounds(58, 53, 414, 35);
		frame.getContentPane().add(lblOfItemsTo);
		
		JLabel lblItems = new JLabel("Items being chosen:");
		lblItems.setBounds(10, 130, 157, 35);
		frame.getContentPane().add(lblItems);
		
		textR = new JTextField();
		textR.setBounds(177, 137, 34, 20);
		frame.getContentPane().add(textR);
		textR.setColumns(10);
		
		JLabel lblTotalItemsTo = new JLabel("Total items to choose from:");
		lblTotalItemsTo.setBounds(10, 99, 157, 35);
		frame.getContentPane().add(lblTotalItemsTo);
		
		textN = new JTextField();
		textN.setColumns(10);
		textN.setBounds(177, 106, 34, 20);
		frame.getContentPane().add(textN);
		
		JLabel lblDesc = new JLabel("Welcome!");
		lblDesc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc.setBounds(47, 184, 326, 45);
		frame.getContentPane().add(lblDesc);
		
		JButton btnCalculate = new JButton("Calculate Combinations!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Initialize variables
				boolean quit = false;
				try {
					
					int n = Integer.parseInt(textN.getText());
					int r = Integer.parseInt(textR.getText());
					int nMinusr = n - r;
					
					// Check if r is greater than n
					if (nMinusr < 0) {
						
						JOptionPane.showInternalMessageDialog(null, "Error! Please ensure that your first value is greater than your second!");
						quit = true;
						
					}
					
					// Call calcFactorial function for each value we need
					int nFact = calcFactorial(n);
					int rFact = calcFactorial(r);
					int nMinusrFact = calcFactorial(nMinusr);
					
					// Check if any numbers are negative
					if (nFact < 0 || rFact < 0 || nMinusrFact < 0) {
						
						JOptionPane.showInternalMessageDialog(null, "Error! Please only enter integers greater than or equal to 0 in the text boxes!");
						quit = true;
						
					}
					
					// Get actual result of nCr
					int result = nFact / (rFact * nMinusrFact);
					
					// Check if program has not quit, if so, print result
					if (quit == false) {
						
						lblDesc.setText("There are " + result + " possible combinations!");
						
					}
					
				}
				
				// If there is an error, catch
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Error! Please only enter integers greater than or equal to 0 in the text boxes!");
					
				}
				
			}
		});
		btnCalculate.setBounds(222, 124, 188, 23);
		frame.getContentPane().add(btnCalculate);
		
	}
	
	// DESCRIPTION: calculates the factorial of a number
	// PARAMETERS: int x
	// RETURN TYPE: int
	public static int calcFactorial(int x) {
		
		if (x < 0) {
			
			return -1;
			
		}
		
		if (x == 0 || x == 1) {
			
			return 1;
			
		}
		
		else {
			
			return x *= calcFactorial(x-1);
			
		}
		
	}
		
	
}
