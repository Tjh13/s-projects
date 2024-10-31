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

public class SearchAlgorithm {

	private JFrame frame;
	private JTextField textRefNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchAlgorithm window = new SearchAlgorithm();
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
	public SearchAlgorithm() {
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
		
		JLabel lblNewLabel = new JLabel("STFX Learning Commons");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(127, 11, 173, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter book reference # here!");
		lblNewLabel_1.setBounds(35, 56, 198, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textRefNum = new JTextField();
		textRefNum.setBounds(206, 53, 86, 20);
		frame.getContentPane().add(textRefNum);
		textRefNum.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Book name: ");
		lblNewLabel_2.setBounds(35, 104, 94, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblBookName = new JLabel("");
		lblBookName.setBounds(127, 104, 254, 14);
		frame.getContentPane().add(lblBookName);
		
		JLabel lblNewLabel_2_1 = new JLabel("Book author:");
		lblNewLabel_2_1.setBounds(35, 129, 94, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblAuthorName = new JLabel("");
		lblAuthorName.setBounds(127, 128, 254, 14);
		frame.getContentPane().add(lblAuthorName);
		
		JLabel lblDesc = new JLabel("");
		lblDesc.setBounds(99, 217, 229, 30);
		frame.getContentPane().add(lblDesc);
		
		JButton btnNewButton = new JButton("Search!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// variable declarations
				int counter = 0;
				int searchResult;
				String inputNum = (textRefNum.getText());
				ArrayList<String> bookLines = new ArrayList<String>();
				ArrayList<Book> bookList = new ArrayList<Book>();
				String line = "";
				BufferedReader br = null;
				
				try  {
				
					// open file located in src folder
					br = new BufferedReader(new FileReader("BookList11.txt"));
					
					// read each line of text file all the way to end of file, add each line to bookLines array
					while((line = br.readLine()) != null)  {
						
						bookLines.add(line);
					}
					
					// close the file
					br.close();
				}
				
				catch (Exception f)  {
					
					f.printStackTrace();
				}
				
				// create new "Book" objects using content of bookLines
				for (int i=0; i<bookLines.size(); i=i+3) {
					
					Book myBook = new Book(bookLines.get(i), bookLines.get(i+1), bookLines.get(i+2));
					bookList.add(myBook);
					
				}
				
				// call search function
				searchResult = search(bookList, inputNum, lblBookName, lblAuthorName, counter);
				
				// output result
				if (searchResult == 0)
					lblDesc.setText("Book found!");
					
				else
					lblDesc.setText("Book not found!");
				
				
			}
		});
		btnNewButton.setBounds(35, 183, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// clear all text boxes and certain labels
				lblDesc.setText("");
				lblBookName.setText("");
				lblAuthorName.setText("");
				textRefNum.setText("");
				
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
	public static int search(ArrayList<Book> bookList, String inputNum, JLabel lblBookName, JLabel lblAuthorName, int counter) {
		
		// error case
		if (Integer.parseInt(inputNum) < 1 || Integer.parseInt(inputNum) > 100)
			return -1; 
		
		// stop case
		else if (inputNum.compareTo(bookList.get(counter).refNum) == 0) {
				
			 lblBookName.setText(bookList.get(counter).name);
			 lblAuthorName.setText(bookList.get(counter).author);
			 return 0;				
		
		}
		
		// recall function
		else {
			
			counter++;
			return search(bookList, inputNum, lblBookName, lblAuthorName, counter);
			
		}
			 
		
	}
}
