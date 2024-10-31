package my_projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SearchAlgorithm2 {

	private JFrame frame;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchAlgorithm2 window = new SearchAlgorithm2();
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
	public SearchAlgorithm2() {
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
		
		JLabel lblNewLabel = new JLabel("Student Grades");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(127, 11, 173, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Searchable Name:");
		lblNewLabel_1.setBounds(53, 56, 154, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setBounds(206, 53, 86, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Student name: ");
		lblNewLabel_2.setBounds(102, 104, 94, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblStudentName = new JLabel("");
		lblStudentName.setBounds(206, 104, 254, 14);
		frame.getContentPane().add(lblStudentName);
		
		JLabel lblNewLabel_2_1 = new JLabel("Student grade:");
		lblNewLabel_2_1.setBounds(102, 129, 94, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblStudentGrade = new JLabel("");
		lblStudentGrade.setBounds(206, 129, 254, 14);
		frame.getContentPane().add(lblStudentGrade);
		
		JLabel lblDesc = new JLabel("");
		lblDesc.setBounds(99, 217, 229, 30);
		frame.getContentPane().add(lblDesc);
		
		JButton btnNewButton = new JButton("Search!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// variable declarations
				int counter = 0;
				int searchResult;
				String nameInput = (textName.getText());
				ArrayList<String> listLines = new ArrayList<String>();
				ArrayList<Student> studentList = new ArrayList<Student>();
				String line = "";
				BufferedReader br = null;
				
				try  {
				
					// open file located in src folder
					br = new BufferedReader(new FileReader("StudentGrades.txt"));
					
					// read each line of text file all the way to end of file, add each line to bookLines array
					while((line = br.readLine()) != null)  {
						
						listLines.add(line);
					}
					
					// close the file
					br.close();
				}
				
				catch (Exception f)  {
					
					f.printStackTrace();
				}
				
				// create new "Student" objects using content of bookLines
				for (int i=0; i<listLines.size(); i=i+2) {
					
					Student myStudent = new Student(listLines.get(i), listLines.get(i+1));
					studentList.add(myStudent);
					
				}
				
				// call search function
				searchResult = search(studentList, nameInput, lblStudentName, lblStudentGrade, counter);
				
				// output result
				if (searchResult == 0)
					lblDesc.setText("Student found!");
					
				else {
					
					lblDesc.setText("Student not found!");
					lblStudentName.setText("");
					lblStudentGrade.setText("");
					
				}
					
				
				
			}
		});
		btnNewButton.setBounds(35, 183, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// clear all text boxes and certain labels
				lblDesc.setText("");
				lblStudentName.setText("");
				lblStudentGrade.setText("");
				textName.setText("");
				
			}
		});
		btnClear.setBounds(162, 183, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// exit
				System.exit(0);
				
			}
		});
		btnExit.setBounds(292, 183, 89, 23);
		frame.getContentPane().add(btnExit);
		

	}
	
	// DESCRIPTION: searches for inputted reference number in book list, outputs corresponding book and author names if found
	// PARAMETERS: ArrayList<Book> bookList, String inputNum, JLabel lblBookName, JLabel lblAuthorName, int counter
	// RETURN TYPE: int
	public static int search(ArrayList<Student> studentList, String nameInput, JLabel lblStudentName, JLabel lblStudentGrade, int counter) {
		
		try {
			
			// create string for full name, first name and last name, set full name and nameInput to all lowercase
			String studentN = studentList.get(counter).n;
			studentN = studentN.toLowerCase();
			nameInput = nameInput.toLowerCase();
			String studentFN = "";
			String studentLN = "";
			
			// set first name to all characters in full name up until space, set last name to all characters afterwards
			for (int i=0; i<studentN.length(); i++) {
				
				studentFN = studentFN.concat(Character.toString(studentN.charAt(i)));
				if (studentFN.contains(" ")) {
					
					studentFN = studentFN.replace(" ", "");
					studentLN = studentN.substring(i);
					studentLN = studentLN.replace(" ", "");
					break;
					
				}
				
			}			
				
			// check if name inputted is same as either first name or last name
			if (nameInput.compareTo(studentFN) == 0 || nameInput.compareTo(studentLN) == 0) {
					
				 lblStudentName.setText(studentList.get(counter).n);
				 lblStudentGrade.setText(studentList.get(counter).g);
				 return 0;				
			
			}
			
			// recall function
			else {
				
				counter++;
				return search(studentList, nameInput, lblStudentName, lblStudentGrade, counter);
				
			}
			
		}
		
		// error case
		catch (Exception e) {	
			
			return -1;
	
		}	
		
		
			 
		
	}
}
