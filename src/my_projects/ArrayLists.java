package my_projects;

import java.awt.EventQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArrayLists {

	private JFrame frame;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayLists window = new ArrayLists();
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
	public ArrayLists() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ArrayList<String> namesArray = new ArrayList<String>();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 683, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Names:");
		lblNewLabel.setBounds(169, 11, 95, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name: ");
		lblNewLabel_1.setBounds(10, 56, 95, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 97, 647, 249);
		txtArea.setText("");
		txtArea.setFont(new Font("SansSerif", Font.PLAIN, 10));
		frame.getContentPane().add(txtArea);
		
		textName = new JTextField();
		textName.setBounds(79, 53, 86, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblNamesValue = new JLabel("0");
		lblNamesValue.setBounds(635, 56, 46, 14);
		frame.getContentPane().add(lblNamesValue);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// check if maximum number of names has been reached, reset txtArea if true
				int names = Integer.parseInt(lblNamesValue.getText());
				if (names == 15) {
					
					names = 0;
					lblNamesValue.setText(Integer.toString(names));
					namesArray.clear();
					
				}
				
				// check if name already exists
				if (namesArray.contains(textName.getText())) {
					
					txtArea.setText("Name already exists. Please enter a different one!");
					
				}
				
				// if it doesn't, add new name to array, let user know
				else {
					
					names++;
					lblNamesValue.setText(Integer.toString(names));
					namesArray.add(textName.getText());
					txtArea.setText("Name added!");
					
				}
				

			}
		});
		btnAdd.setBounds(175, 52, 66, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// check if name is in array, remove name from array, decrease number of names by 1
				int names = Integer.parseInt(lblNamesValue.getText());
				String removeName = textName.getText();
				if (namesArray.contains(removeName)) {
					
					for (int i=0; i<names; i++) {
						
						if (namesArray.get(i).equals(removeName)) {
							
							namesArray.remove(i);
							
						}
						
					}
					names--;
					lblNamesValue.setText(Integer.toString(names));
					txtArea.setText("Name removed!");
					
				}
				
				// if name is not available, let user know
				else {
					
					txtArea.setText("Name not available. Please enter an exact copy of an entered name.");
					
				}
				
			}
		});
		btnRemove.setBounds(251, 52, 86, 23);
		frame.getContentPane().add(btnRemove);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtArea.setText("");
				int names = Integer.parseInt(lblNamesValue.getText());
				for (int i=0; i<names; i++) {
					
					txtArea.append(namesArray.get(i));
					txtArea.append("\n");
					
				}
				
			}
		});
		btnList.setBounds(347, 52, 66, 23);
		frame.getContentPane().add(btnList);
		
		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// sort names in array
				int names = Integer.parseInt(lblNamesValue.getText());
				
				Collections.sort(namesArray);
				txtArea.setText("Names sorted!");
				
			}
		});
		btnSort.setBounds(423, 52, 66, 23);
		frame.getContentPane().add(btnSort);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// exit
				System.exit(0);
				
			}
		});
		btnExit.setBounds(499, 52, 66, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("Names:");
		lblNewLabel_2.setBounds(592, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
	}
}
