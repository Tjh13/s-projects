package my_projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Functions {

	private JFrame frame;
	private JTextField textPTA;
	private JTextField textPTB;
	private JTextField textQFA;
	private JTextField textQFB;
	private JTextField textQFC;
	private JTextField textDx2;
	private JTextField textDx1;
	private JTextField textDy1;
	private JTextField textDy2;
	private JTextField textValue;
	private JTextField textExponent;
	private JTextField textDegrees;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Functions window = new Functions();
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
	public Functions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Functions:");
		lblNewLabel.setBounds(333, 11, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPythagoreanTheorum = new JLabel("Pythagorean Theorum:");
		lblPythagoreanTheorum.setBounds(52, 52, 132, 14);
		frame.getContentPane().add(lblPythagoreanTheorum);
		
		JLabel lblQuadraticFormula = new JLabel("Quadratic Formula:");
		lblQuadraticFormula.setBounds(306, 52, 103, 14);
		frame.getContentPane().add(lblQuadraticFormula);
		
		JLabel lblDistance = new JLabel("Distance:");
		lblDistance.setBounds(555, 52, 65, 14);
		frame.getContentPane().add(lblDistance);
		
		textPTA = new JTextField();
		textPTA.setBounds(98, 77, 32, 20);
		frame.getContentPane().add(textPTA);
		textPTA.setColumns(10);
		
		textPTB = new JTextField();
		textPTB.setColumns(10);
		textPTB.setBounds(98, 108, 32, 20);
		frame.getContentPane().add(textPTB);
		
		JLabel lblNewLabel_1 = new JLabel("A Value:");
		lblNewLabel_1.setBounds(52, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("B Value:");
		lblNewLabel_1_1.setBounds(52, 111, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textQFA = new JTextField();
		textQFA.setColumns(10);
		textQFA.setBounds(359, 77, 32, 20);
		frame.getContentPane().add(textQFA);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("C Value:");
		lblNewLabel_1_1_1.setBounds(52, 143, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textQFB = new JTextField();
		textQFB.setColumns(10);
		textQFB.setBounds(359, 108, 32, 20);
		frame.getContentPane().add(textQFB);
		
		textQFC = new JTextField();
		textQFC.setColumns(10);
		textQFC.setBounds(359, 140, 32, 20);
		frame.getContentPane().add(textQFC);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("C Value:");
		lblNewLabel_1_1_1_1.setBounds(303, 143, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("B Value:");
		lblNewLabel_1_1_2.setBounds(303, 111, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("A Value:");
		lblNewLabel_1_1_3.setBounds(303, 77, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblPTC = new JLabel("");
		lblPTC.setBounds(98, 143, 46, 14);
		frame.getContentPane().add(lblPTC);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("X Value 1:");
		lblNewLabel_1_1_1_1_1.setBounds(294, 171, 65, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblQFX1 = new JLabel("");
		lblQFX1.setBounds(359, 171, 46, 14);
		frame.getContentPane().add(lblQFX1);
		
		JLabel lblQFX2 = new JLabel("");
		lblQFX2.setBounds(352, 191, 46, 14);
		frame.getContentPane().add(lblQFX2);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("x value 1:");
		lblNewLabel_1_1_3_1.setBounds(514, 77, 72, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("x value 2:");
		lblNewLabel_1_1_3_1_1.setBounds(514, 102, 72, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3_1_1);
		
		textDx2 = new JTextField();
		textDx2.setColumns(10);
		textDx2.setBounds(565, 99, 32, 20);
		frame.getContentPane().add(textDx2);
		
		textDx1 = new JTextField();
		textDx1.setColumns(10);
		textDx1.setBounds(565, 77, 32, 20);
		frame.getContentPane().add(textDx1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Horizontal Distance:");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2.setBounds(490, 128, 96, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JLabel lblHD = new JLabel("");
		lblHD.setBounds(596, 130, 46, 14);
		frame.getContentPane().add(lblHD);
		
		JLabel lblVD = new JLabel("");
		lblVD.setBounds(596, 149, 46, 14);
		frame.getContentPane().add(lblVD);
		
		JLabel lblTD = new JLabel("");
		lblTD.setBounds(596, 171, 46, 14);
		frame.getContentPane().add(lblTD);
		
		JLabel lblNewLabel_1_1_3_1_2 = new JLabel("y value 1:");
		lblNewLabel_1_1_3_1_2.setBounds(609, 77, 72, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3_1_2);
		
		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("y value 2:");
		lblNewLabel_1_1_3_1_1_1.setBounds(609, 102, 58, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3_1_1_1);
		
		textDy1 = new JTextField();
		textDy1.setColumns(10);
		textDy1.setBounds(661, 77, 32, 20);
		frame.getContentPane().add(textDy1);
		
		textDy2 = new JTextField();
		textDy2.setColumns(10);
		textDy2.setBounds(661, 99, 32, 20);
		frame.getContentPane().add(textDy2);
		
		JLabel lblExponent = new JLabel("Exponent:");
		lblExponent.setBounds(166, 238, 81, 14);
		frame.getContentPane().add(lblExponent);
		
		JLabel lblDegreesToRadians = new JLabel("Degrees to Radians:");
		lblDegreesToRadians.setBounds(440, 254, 124, 14);
		frame.getContentPane().add(lblDegreesToRadians);
		
		JLabel lblNewLabel_1_2 = new JLabel("Value:");
		lblNewLabel_1_2.setBounds(138, 265, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textValue = new JTextField();
		textValue.setColumns(10);
		textValue.setBounds(176, 262, 32, 20);
		frame.getContentPane().add(textValue);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Exponent:");
		lblNewLabel_1_2_1.setBounds(119, 292, 65, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		textExponent = new JTextField();
		textExponent.setColumns(10);
		textExponent.setBounds(176, 289, 32, 20);
		frame.getContentPane().add(textExponent);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Result:");
		lblNewLabel_1_1_1_3.setBounds(129, 317, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
		
		JLabel lblER = new JLabel("");
		lblER.setBounds(176, 317, 46, 14);
		frame.getContentPane().add(lblER);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Degrees:");
		lblNewLabel_1_2_2.setBounds(450, 282, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		textDegrees = new JTextField();
		textDegrees.setColumns(10);
		textDegrees.setBounds(501, 279, 32, 20);
		frame.getContentPane().add(textDegrees);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Radians:");
		lblNewLabel_1_2_2_1.setBounds(450, 317, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2_2_1);
		
		JLabel lblRadians = new JLabel("");
		lblRadians.setBounds(501, 317, 46, 14);
		frame.getContentPane().add(lblRadians);
		
		JButton btnPT = new JButton("Calculate PT!");
		btnPT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// get a and b values, use pythagorean function, catch errors
				try {
					
					double a = Double.parseDouble(textPTA.getText());
					double b = Double.parseDouble(textPTB.getText());
					pythagorean(a, b, lblPTC);
					
				}
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Error! Please enter only integers in the text boxes!");
					
				}
				
				
			}
		});
		btnPT.setBounds(31, 171, 124, 23);
		frame.getContentPane().add(btnPT);
		
		JButton btnQF = new JButton("Calculate QF!");
		btnQF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// get a, b, and c values, use quadratic function, catch errors
				try {
					
					int a = Integer.parseInt(textQFA.getText());
					int b = Integer.parseInt(textQFB.getText());
					int c = Integer.parseInt(textQFC.getText());
					quadratic(a, b, c, lblQFX1, lblQFX2);
					
				}
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Error! Please enter only integers in the text boxes!");
					
				}
				
			}
		});
		btnQF.setBounds(294, 216, 115, 23);
		frame.getContentPane().add(btnQF);
		
		JButton btnDistance = new JButton("Calculate Distance!");
		btnDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// get x1, x2, y1 and y2, use distance function, catch errors
				try {
					
					int x1 = Integer.parseInt(textDx1.getText());
					int x2 = Integer.parseInt(textDx2.getText());
					int y1 = Integer.parseInt(textDy1.getText());
					int y2 = Integer.parseInt(textDy2.getText());
					distance(x1, x2, y1, y2, lblHD, lblVD, lblTD);
					
				}
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Error! Please enter only integers in the text boxes!");
					
				}
				
			}
		});
		btnDistance.setBounds(504, 196, 177, 23);
		frame.getContentPane().add(btnDistance);
		
		JButton btnExponent = new JButton("Calculate Exponent!");
		btnExponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// get value and exponent numbers, use exponent function, catch errors
				try {
					
					int v = Integer.parseInt(textValue.getText());
					int ex = Integer.parseInt(textExponent.getText());
					exponent(v, ex, lblER);
					
				}
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Error! Please enter only integers in the text boxes!");
					
				}
				
			}
		});
		btnExponent.setBounds(94, 342, 177, 23);
		frame.getContentPane().add(btnExponent);
		
		JButton btnD2R = new JButton("Calculate D2R!");
		btnD2R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// get degree value, use d2r function, catch errors
				try {
					
					int d = Integer.parseInt(textDegrees.getText());
					d2r(d, lblRadians);
					
				}
				catch (Exception f) {
					
					JOptionPane.showInternalMessageDialog(null, "Error! Please enter only integers in the text boxes!");
					
				}
				
			}
		});
		btnD2R.setBounds(424, 342, 140, 23);
		frame.getContentPane().add(btnD2R);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("X Value 2:");
		lblNewLabel_1_1_1_1_1_1.setBounds(294, 196, 65, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Total Distance:");
		lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1.setBounds(490, 171, 96, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Vertical Distance:");
		lblNewLabel_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1.setBounds(490, 149, 96, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_2_1_1);
		

		
	}
	
	// DESCRIPTION: takes a and b values of a right angle triangle and outputs the c value (hypotenuse)
	// PARAMETERS: double a, double b, JLabel lblPTC
	// RETURN TYPE: void
	public static void pythagorean(double a, double b, JLabel lblPTC) {
		
		double c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
		c *= 100;
		Math.round(c);
		c /= 100;
		lblPTC.setText(Double.toString(c));
		
	}
	
	// DESCRIPTION: takes the a, b, and c values of a trinomial and outputs the x value
	// PARAMETERS: int a, int b, int c, JLabel lblQFX1, JLabel lblQFX2
	// RETURN TYPE: void
	public static void quadratic(int a, int b, int c, JLabel lblQFX1, JLabel lblQFX2) {
		
		double x1 = (0 - b);
		double n = (Math.pow(b, 2) - 4*a*c);
		if (n < 0) {
			
			n = (0 - n);
			n = Math.sqrt(n);
			n -= (2*n);
			
		}
		else {
			
			n = Math.sqrt(n);
			
		}
		x1 += n;
		x1 /= (2*a);
		x1 *= 100;
		Math.round(x1);
		x1 /= 100;
		
		double x2 = (0 - b);
		n = (Math.pow(b, 2) - 4*a*c);
		if (n < 0) {
			
			n = (0 - n);
			n = Math.sqrt(n);
			n -= (2*n);
			
		}
		else {
			
			n = Math.sqrt(n);
			
		}
		x2 -= n;
		x2 /= (2*a);
		x2 *= 100;
		Math.round(x2);
		x2 /= 100;
		
		lblQFX1.setText(Double.toString(x1));
		lblQFX2.setText(Double.toString(x2));
		
	}
	
	// DESCRIPTION: takes two x values and two y values and outputs the distance between them
	// PARAMETERS: int x1, int x2, int y1, int y2, JLabel lblHD, JLabel lblVD, JLabel lblTD
	// RETURN TYPE: void
	public static void distance(int x1, int x2, int y1, int y2, JLabel lblHD, JLabel lblVD, JLabel lblTD) {
		
		int x = x2 - x1;
		lblHD.setText(Integer.toString(x));
		int y = y2 - y1;
		lblVD.setText(Integer.toString(y));
		
		double z = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
		z *= 100;
		Math.round(z);
		z /= 100;
		lblTD.setText(Double.toString(z));
		
	}
	
	// DESCRIPTION: finds and outputs the value of a number to the exponent of another number
	// PARAMETERS: int v, int e, JLabel lblER
	// RETURN TYPE: void
	public static void exponent(int v, int e, JLabel lblER) {
		
		double result = Math.pow(v, e);
		lblER.setText(Double.toString(result));
		
	}
	// DESCRIPTION: converts an input number of degrees to radians and outputs result
	// PARAMETERS: int d, JLabel lblRadians
	// RETURN TYPE: void
	public static void d2r(int d, JLabel lblRadians) {
		
		double r = Math.toRadians(d);
		lblRadians.setText(Double.toString(r));
		
	}
	
}
