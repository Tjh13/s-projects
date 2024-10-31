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

public class RecursiveFractionReducer {

	private JFrame frame;
	private JTextField textN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecursiveFractionReducer window = new RecursiveFractionReducer();
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
	public RecursiveFractionReducer() {
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
		
		JLabel lblNewLabel = new JLabel("Fraction Reducer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(129, 11, 225, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblThisProgramCalculates = new JLabel("This program reduces whatever fraction you input!");
		lblThisProgramCalculates.setBounds(81, 32, 414, 35);
		frame.getContentPane().add(lblThisProgramCalculates);
		
		JLabel lblTotalItemsTo = new JLabel("Numerator of fraction:");
		lblTotalItemsTo.setBounds(10, 78, 126, 35);
		frame.getContentPane().add(lblTotalItemsTo);
		
		textN = new JTextField();
		textN.setColumns(10);
		textN.setBounds(146, 85, 34, 20);
		frame.getContentPane().add(textN);
		
		JLabel lblDesc = new JLabel("Welcome!");
		lblDesc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc.setBounds(10, 184, 414, 45);
		frame.getContentPane().add(lblDesc);
		
		JTextField textD = new JTextField();
		textD.setColumns(10);
		textD.setBounds(146, 123, 34, 20);
		frame.getContentPane().add(textD);
		
		JButton btnReduce = new JButton("Reduce Fraction!");
		btnReduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					// Get variables
					int n = Integer.parseInt(textN.getText());
					int d = Integer.parseInt(textD.getText());
					
					// Call reduce function
					int reduction = reduce(n, d);
					
					// Find reduced fraction
					n /= reduction;
					d /= reduction;
					
					// Check for negative inputs 
					if (n < 0) {
						
						JOptionPane.showInternalMessageDialog(null, "Error! Please only enter integers greater than or equal to 0 in the text boxes!");
						
					}
					
					else {
						
						// Print result
						try {
							
							lblDesc.setText("The reduced version of your fraction is " + n + "/" + d + "!");

							
						}
						catch (Exception f) {
							
							JOptionPane.showInternalMessageDialog(null, "Error! Please only enter integers greater than or equal to 0 in the text boxes!");
							
						}
						
					}
					
				}
				
				// If there was an error, catch
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Error! Please only enter integers greater than or equal to 0 in the text boxes!");
					
				}
				
				
			}
		});
		btnReduce.setBounds(264, 112, 141, 23);
		frame.getContentPane().add(btnReduce);
		
		JLabel lblDenominatorOfFraction = new JLabel("Denominator of fraction:");
		lblDenominatorOfFraction.setBounds(10, 116, 126, 35);
		frame.getContentPane().add(lblDenominatorOfFraction);
		
		
	}
	
	// DESCRIPTION: reduces a fraction as best as possible
	// PARAMETERS: int n, int d
	// RETURN TYPE: int
	public static int reduce(int n, int d) {
		
		int remainder;

	    if ((remainder = n % d) == 0) {
	    	
	        return d;
	        
	    }
	    else {
	    	
	        return reduce(d, remainder);
	        
	    }
		
	}
}
