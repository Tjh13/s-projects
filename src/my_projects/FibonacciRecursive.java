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

public class FibonacciRecursive {

	private JFrame frame;
	private JTextField textN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FibonacciRecursive window = new FibonacciRecursive();
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
	public FibonacciRecursive() {
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
		
		JLabel lblNewLabel = new JLabel("Fibonacci");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(166, 11, 141, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblThisProgramCalculates = new JLabel("This program outputs any number in the Fibonacci sequence!");
		lblThisProgramCalculates.setBounds(68, 34, 414, 35);
		frame.getContentPane().add(lblThisProgramCalculates);
		
		JLabel lblTotalItemsTo = new JLabel("?th number of Fibonacci sequence?");
		lblTotalItemsTo.setBounds(10, 106, 199, 35);
		frame.getContentPane().add(lblTotalItemsTo);
		
		textN = new JTextField();
		textN.setColumns(10);
		textN.setBounds(71, 132, 34, 20);
		frame.getContentPane().add(textN);
		
		JLabel lblDesc = new JLabel("Welcome!");
		lblDesc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc.setBounds(10, 184, 414, 45);
		frame.getContentPane().add(lblDesc);
		
		JButton btnCalculate = new JButton("Calculate Fibonacci!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					// Get variable
					int n = Integer.parseInt(textN.getText());
					
					// Check if number is negative
					if (n < 0) {
						
						JOptionPane.showInternalMessageDialog(null, "Error! Please only enter integers greater than or equal to 0 in the text boxes!");
						
					}
					
					else {
						
						// Call calcFib function, print result
						try {
							
							lblDesc.setText("Value #" + n + " of the Fibonacci sequence is " + (Integer.toString(calcFib(n))) + "!");

							
						}
						
						// If there is an error, catch
						catch (Exception f) {
							
							JOptionPane.showInternalMessageDialog(null, "Error! Please only enter integers greater than or equal to 0 in the text boxes!");
							
						}
						
					}
					
				}
				
				// If there is an error, catch
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Error! Please only enter integers greater than or equal to 0 in the text boxes!");
					
				}
				
			}
		});
		btnCalculate.setBounds(264, 112, 141, 23);
		frame.getContentPane().add(btnCalculate);
		
	}
	
	// DESCRIPTION: finds any value in the fibonnacci sequence
	// PARAMETERS: int x
	// RETURN TYPE: int
	public static int calcFib(int x) {
		
		if (x <= 0) {
			
			return -1;
			
		}
		
		if (x == 1) {
			
			return 0;
			
		}
		
		if (x == 2) {
			
			return 1;
			
		}
		
		else {
			
			return calcFib(x-1) + calcFib(x-2);
			
		}
		
	}
		
	
}
