package my_projects;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.ArrayList;


public class AirlinePoints {

	private JFrame frame;
	private JTextField textFName;
	private JTextField textLName;
	private static JTextField textWeek1;
	private static JTextField textWeek2;
	private static JTextField textWeek3;
	private static JTextField textWeek4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirlinePoints window = new AirlinePoints();
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
	public AirlinePoints() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ArrayList<ArrayList<String>> namesArray = new ArrayList<ArrayList<String>>();
				
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Airline Points");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(169, 11, 95, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name: ");
		lblNewLabel_1.setBounds(35, 57, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFName = new JTextField();
		textFName.setBounds(100, 54, 86, 20);
		frame.getContentPane().add(textFName);
		textFName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name: ");
		lblNewLabel_1_1.setBounds(237, 57, 75, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textLName = new JTextField();
		textLName.setBounds(300, 54, 86, 20);
		frame.getContentPane().add(textLName);
		textLName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Week 1:");
		lblNewLabel_2.setBounds(75, 106, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Week 2:");
		lblNewLabel_2_1.setBounds(75, 134, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Week 3:");
		lblNewLabel_2_1_1.setBounds(75, 159, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Week 4:");
		lblNewLabel_2_1_1_1.setBounds(75, 184, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		textWeek1 = new JTextField();
		textWeek1.setBounds(130, 103, 39, 20);
		frame.getContentPane().add(textWeek1);
		textWeek1.setColumns(10);
		
		textWeek2 = new JTextField();
		textWeek2.setColumns(10);
		textWeek2.setBounds(130, 131, 39, 20);
		frame.getContentPane().add(textWeek2);
		
		textWeek3 = new JTextField();
		textWeek3.setColumns(10);
		textWeek3.setBounds(130, 156, 39, 20);
		frame.getContentPane().add(textWeek3);
		
		textWeek4 = new JTextField();
		textWeek4.setColumns(10);
		textWeek4.setBounds(130, 181, 39, 20);
		frame.getContentPane().add(textWeek4);
		
		JLabel lblNames = new JLabel("0");
		lblNames.setBounds(140, 209, 70, 14);
		frame.getContentPane().add(lblNames);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setText("First Name:\tLast Name:\tWeek 1:\tWeek 2:\tWeek 3:\tWeek 4:");
		txtArea.setFont(new Font("SansSerif", Font.PLAIN, 10));
		txtArea.setBounds(21, 260, 455, 249);
		frame.getContentPane().add(txtArea);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// use list function
				list(txtArea, namesArray);
				
			}
		});
		btnList.setBounds(223, 155, 75, 23);
		frame.getContentPane().add(btnList);
		
		JButton btnTotalPoints = new JButton("Total Points");
		btnTotalPoints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// use totalPoints function
				totalPoints(txtArea, namesArray);
				
			}
		});
		btnTotalPoints.setBounds(326, 134, 150, 23);
		frame.getContentPane().add(btnTotalPoints);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exit
				System.exit(0);
				
			}
		});
		btnExit.setBounds(228, 205, 59, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// use add function
				add(lblNames, txtArea, namesArray, textFName, textLName, textWeek1, textWeek2, textWeek3, textWeek4);
				
			}
		});
		btnAdd.setBounds(223, 122, 75, 23);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Names:");
		lblNewLabel_2_1_1_1_1.setBounds(75, 209, 70, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
		

		
	}
	
	
	
	// DESCRIPTION: finds the total number of points each person has
	// PARAMETERS: JTextArea txtArea, String[][] testAverage, String[][] nameRow, JLabel lblNames
	// RETURN TYPE: void
	public static void totalPoints(JTextArea txtArea, ArrayList<ArrayList<String>> namesArray) {
		
		try {
			
			txtArea.setText("First Name:\tLast Name:\tTotal Points:\tBonus Points:\n");
			for (int i=0; i<namesArray.size(); i++) {
				
				int bp = 0;
				ArrayList<String> pointsRow = new ArrayList<String>();
				txtArea.append(namesArray.get(i).get(0));
				txtArea.append("\t");
				txtArea.append(namesArray.get(i).get(1));
				txtArea.append("\t");
				int tp = (Integer.parseInt(namesArray.get(i).get(2)) + Integer.parseInt(namesArray.get(i).get(3)) + Integer.parseInt(namesArray.get(i).get(4)) + Integer.parseInt(namesArray.get(i).get(5)));
				txtArea.append(Integer.toString(tp));
				txtArea.append("\t");
				while (tp >= 5000) {
					
					bp += 1000;
					tp -= 5000;
					
				}
				pointsRow.add(Integer.toString(bp));
				txtArea.append("\n");
				
			}
				
		}
		catch (Exception u) {
			
			JOptionPane.showInternalMessageDialog(null, "Error! Please restart and enter only integers for each of the weeks!");
			
		}
		
		
	}
	
	
	
	
	// DESCRIPTION: lists the first names, last names, and the four test marks for each student
	// PARAMETERS: JTextArea txtArea, JLabel lblNames, String[][] nameRow
	// RETURN TYPE: void
	public static void list(JTextArea txtArea, ArrayList<ArrayList<String>> namesArray) {
		
		txtArea.setText("First Name:\tLast Name:\tTest 1:\tTest 2:\tTest 3:\tTest 4:");
		
		for(int i=0; i<namesArray.size(); i++) {
			
			txtArea.append("\n");
			
			for(int j=0; j<6; j++) {
				
				txtArea.append(namesArray.get(i).get(j));
				txtArea.append("\t");
				
			}
			
		}
		
	}
	
	
	
	
	// DESCRIPTION: allows you to add a new name to the array
	// PARAMETERS: JLabel lblNames, String[][] nameRow, JTextField textFName, JTextField textLName, JTextField textTest1, JTextField textTest2, JTextField textTest3, JTextField textTest4
	// RETURN TYPE: void
	public static void add(JLabel lblNames, JTextArea txtArea, ArrayList<ArrayList<String>> namesArray, JTextField textFName, JTextField textLName, JTextField textWeek1, JTextField textWeek2, JTextField textWeek3, JTextField textWeek4) {
		
		ArrayList<String> nameRow = new ArrayList<String>();
		int names = Integer.parseInt(lblNames.getText());
		names++;
		lblNames.setText(Integer.toString(names));
		txtArea.setText("Name added!");
		
		nameRow.add(textFName.getText());
		nameRow.add(textLName.getText());
		nameRow.add(textWeek1.getText());
		nameRow.add(textWeek2.getText());
		nameRow.add(textWeek3.getText());
		nameRow.add(textWeek4.getText());
		
		namesArray.add(nameRow);
		
	}
	
}
