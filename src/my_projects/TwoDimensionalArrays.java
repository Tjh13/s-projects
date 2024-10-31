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

public class TwoDimensionalArrays {

	private JFrame frame;
	private JTextField textFName;
	private JTextField textLName;
	private JTextField textTest1;
	private JTextField textTest2;
	private JTextField textTest3;
	private JTextField textTest4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoDimensionalArrays window = new TwoDimensionalArrays();
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
	public TwoDimensionalArrays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[][] studentArray = new String[15][6];
		String[][] studentAverage = new String[15][3];
		String[][] testAverage = new String[15][4];
				
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Grades");
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
		
		JLabel lblNewLabel_2 = new JLabel("Test 1:");
		lblNewLabel_2.setBounds(89, 106, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Test 2:");
		lblNewLabel_2_1.setBounds(89, 131, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Test 3:");
		lblNewLabel_2_1_1.setBounds(89, 159, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Test 4:");
		lblNewLabel_2_1_1_1.setBounds(89, 184, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		textTest1 = new JTextField();
		textTest1.setBounds(130, 103, 39, 20);
		frame.getContentPane().add(textTest1);
		textTest1.setColumns(10);
		
		textTest2 = new JTextField();
		textTest2.setColumns(10);
		textTest2.setBounds(130, 131, 39, 20);
		frame.getContentPane().add(textTest2);
		
		textTest3 = new JTextField();
		textTest3.setColumns(10);
		textTest3.setBounds(130, 156, 39, 20);
		frame.getContentPane().add(textTest3);
		
		textTest4 = new JTextField();
		textTest4.setColumns(10);
		textTest4.setBounds(130, 181, 39, 20);
		frame.getContentPane().add(textTest4);
		
		JLabel lblStudents = new JLabel("0");
		lblStudents.setBounds(140, 209, 70, 14);
		frame.getContentPane().add(lblStudents);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setText("First Name:\tLast Name:\tTest 1:\tTest 2:\tTest 3:\tTest 4:");
		txtArea.setFont(new Font("SansSerif", Font.PLAIN, 10));
		txtArea.setBounds(21, 260, 455, 249);
		frame.getContentPane().add(txtArea);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// use list function
				list(txtArea, lblStudents, studentArray);
				
			}
		});
		btnList.setBounds(223, 155, 75, 23);
		frame.getContentPane().add(btnList);
		
		JButton btnTestAverage = new JButton("Test Average");
		btnTestAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// use testAverage function
				testAverage(txtArea, testAverage, studentArray, lblStudents);
				
			}
		});
		btnTestAverage.setBounds(326, 155, 150, 23);
		frame.getContentPane().add(btnTestAverage);
		
		JButton btnStudentAverage = new JButton("Student Average");
		btnStudentAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// use studentAverage function
				studentAverage(lblStudents, studentAverage, studentArray, txtArea);
				
			}
		});
		btnStudentAverage.setBounds(326, 122, 150, 23);
		frame.getContentPane().add(btnStudentAverage);
		
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
				add(lblStudents, studentArray, textFName, textLName, textTest1, textTest2, textTest3, textTest4);
				
			}
		});
		btnAdd.setBounds(223, 122, 75, 23);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Students:");
		lblNewLabel_2_1_1_1_1.setBounds(75, 209, 70, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
		

		
	}
	
	
	
	// DESCRIPTION: finds the average mark that one student achieved based on their four tests
	// PARAMETERS: JLabel lblStudents, String[][] studentAverage, String[][] studentArray, JTextArea txtArea
	// RETURN TYPE: void
	public static void studentAverage(JLabel lblStudents, String[][] studentAverage, String[][] studentArray, JTextArea txtArea) {
		
		try {
			
			txtArea.setText("First Name:\tLast Name:\tAverage:");
			int students = Integer.parseInt(lblStudents.getText());
			double test1;
			double test2;
			double test3;
			double test4;
			
			for(int i=0; i<students; i++) {
				
				studentAverage[i][0] = studentArray[i][0];
				studentAverage[i][1] = studentArray[i][1];
				test1 = Double.parseDouble(studentArray[i][2]);
				test2 = Double.parseDouble(studentArray[i][3]);
				test3 = Double.parseDouble(studentArray[i][4]);
				test4 = Double.parseDouble(studentArray[i][5]);
				studentAverage[i][2] = Double.toString((test1 + test2 + test3 + test4) / 4);
				
			}
			
			for (int i=0; i<students; i++) {
				
				txtArea.append("\n");
				for (int k=0; k<=2; k++) {
					
					txtArea.append(studentAverage[i][k]);
					txtArea.append("\t");
					
				}					
				
			}
			
		}
		catch (Exception v) {
			
			JOptionPane.showInternalMessageDialog(null, "Error! Please restart and enter only integers for each of the test marks!");

			
		}
		
		
	}
	
	
	
	// DESCRIPTION: finds the class average for each of the four tests
	// PARAMETERS: JTextArea txtArea, String[][] testAverage, String[][] studentArray, JLabel lblStudents
	// RETURN TYPE: void
	public static void testAverage(JTextArea txtArea, String[][] testAverage, String[][] studentArray, JLabel lblStudents) {
		
		try {
			
			txtArea.setText("Test 1:\tTest 2:\tTest 3:\tTest 4:");
			int students = Integer.parseInt(lblStudents.getText());
			double testAvg1;
			int testSum1 = 0;
			double testAvg2;
			int testSum2 = 0;
			double testAvg3;
			int testSum3 = 0;
			double testAvg4;
			int testSum4 = 0;
			for (int m=0; m<students; m++) {
				
				testSum1 += Integer.parseInt(studentArray[m][2]);
				testSum2 += Integer.parseInt(studentArray[m][3]);
				testSum3 += Integer.parseInt(studentArray[m][4]);
				testSum4 += Integer.parseInt(studentArray[m][5]);
				
			}
			
			testAvg1 = testSum1 / students;
			testAvg2 = testSum2 / students;
			testAvg3 = testSum3 / students;
			testAvg4 = testSum4 / students;
			
			testAvg1 *= 100;
			testAvg1 = Math.round(testAvg1);
			testAvg1 /= 100;
			
			testAvg2 *= 100;
			testAvg2 = Math.round(testAvg2);
			testAvg2 /= 100;
			
			testAvg3 *= 100;
			testAvg3 = Math.round(testAvg3);
			testAvg3 /= 100;
			
			testAvg4 *= 100;
			testAvg4 = Math.round(testAvg4);
			testAvg4 /= 100;
			
			for (int n=0; n<students; n++) {
				
				testAverage[n][0] = Double.toString(testAvg1);
				testAverage[n][1] = Double.toString(testAvg2);
				testAverage[n][2] = Double.toString(testAvg3);
				testAverage[n][3] = Double.toString(testAvg4);
				
			}
			
			for (int p=0; p<students; p++) {
				
				txtArea.append("\n");
				for (int q=0; q<=3; q++) {
					
					txtArea.append(testAverage[p][q]);
					txtArea.append("\t");
					
				}					
				
			}
			
		}
		catch (Exception u) {
			
			JOptionPane.showInternalMessageDialog(null, "Error! Please restart and enter only integers for each of the test marks!");
			
		}
		
		
	}
	
	
	
	
	// DESCRIPTION: lists the first names, last names, and the four test marks for each student
	// PARAMETERS: JTextArea txtArea, JLabel lblStudents, String[][] studentArray
	// RETURN TYPE: void
	public static void list(JTextArea txtArea, JLabel lblStudents, String[][] studentArray) {
		
		txtArea.setText("First Name:\tLast Name:\tTest 1:\tTest 2:\tTest 3:\tTest 4:");
		int students = Integer.parseInt(lblStudents.getText());
		for (int i=0; i<students; i++) {
			
			txtArea.append("\n");
			for (int k=0; k<=5; k++) {
				
				txtArea.append(studentArray[i][k]);
				txtArea.append("\t");
				
				
			}					
			
		}
		
	}
	
	
	
	
	// DESCRIPTION: allows you to add a new student to the array
	// PARAMETERS: JLabel lblStudents, String[][] studentArray, JTextField textFName, JTextField textLName, JTextField textTest1, JTextField textTest2, JTextField textTest3, JTextField textTest4
	// RETURN TYPE: void
	public static void add(JLabel lblStudents, String[][] studentArray, JTextField textFName, JTextField textLName, JTextField textTest1, JTextField textTest2, JTextField textTest3, JTextField textTest4) {
		
		int students = Integer.parseInt(lblStudents.getText());
		if (students == 15) {
			
			students = 0;
			lblStudents.setText(Integer.toString(students));
			for (int i=0; i<15; i++) {
				
				for (int j=0; j<6; j++) {
					
					studentArray[i][j] = "";
					
				}
				
			}
			
		}
		students++;
		lblStudents.setText(Integer.toString(students));
		
		studentArray[students-1][0] = textFName.getText();
		studentArray[students-1][1] = textLName.getText();
		studentArray[students-1][2] = textTest1.getText();
		studentArray[students-1][3] = textTest2.getText();
		studentArray[students-1][4] = textTest3.getText();
		studentArray[students-1][5] = textTest4.getText();
		
	}
	
	
	
	
	
	
}
