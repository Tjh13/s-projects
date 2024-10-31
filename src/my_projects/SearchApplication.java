package my_projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SearchApplication {

	private JFrame frame;
	private JTextField textInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchApplication window = new SearchApplication();
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
	public SearchApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// array and variable initialization
		ArrayList<String> linesList = new ArrayList<String>();
		ArrayList<Song> songList = new ArrayList<Song>();
		String line = "";
		String myLine = "";
		int myInt = 0;
		BufferedReader br = null;
		
		// open file located under src folder, forced to use try-catch
		try {
			
			br = new BufferedReader(new FileReader("SongList.txt"));
			
			// read contents of text file, line-by-line until end of file
			// add contents to ArrayList
			while ((line = br.readLine()) != null) {
				
				linesList.add(line);
				
			}
			
			br.close();
			
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		for (int i=0; i<linesList.size(); i++) {
			
			// create new name, album, artist and year for each Song
			String name = "";
			String album = "";
			String artist = "";
			String year = "";
			
			// declare varibales
			myLine = linesList.get(i);
			myInt = 0;
			
			// repeat 4 times, once for name, once for album, once for artist, once for year
			for (int j=0; j<4; j++) {
				
				switch(j) {
				
				// differentiate between name, album, artist and year cases
				// name:
				case 0:
					
					// while character added to string is not a space, add character to string and repeat
					while (true) {
						
						if (myLine.charAt(myInt) == 32) {
							
							myInt++;
							break;
							
						}

						else {
							
							name = name + myLine.charAt(myInt);
							myInt++;
							
						}
						
					}
					
					break;
					
				
				// album:
				case 1:
					
					while (true) {
						
						if (myLine.charAt(myInt) == 32) {
							
							myInt++;
							break;
							
						}
						else {
							
							album = album + myLine.charAt(myInt);
							myInt++;
							
						}
						
					}
					
					break;
					
			
				// artist:
				case 2:
					
					while (true) {
						
						if (myLine.charAt(myInt) == 32) {
							
							myInt++;
							break;
							
						}
						else {
							
							artist = artist + myLine.charAt(myInt);
							myInt++;
							
						}
						
					}
					
					break;
					
				// year:	
				default:
					
					while (true) {
						
						if (myLine.charAt(myInt) == 32) {
							
							myInt++;
							break;
							
						}
						else {
							
							year = year + myLine.charAt(myInt);
							myInt++;
							
						}
						
					}
					
					break;
					
				}
				
			}
			
			// create new song using created variables
			Song mySong = new Song(name, album, artist, year);
			songList.add(mySong);
			
		}
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Song Identifier!");
		lblTitle.setBounds(167, 11, 129, 14);
		frame.getContentPane().add(lblTitle);
		
		textInput = new JTextField();
		textInput.setBounds(167, 49, 86, 20);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		JLabel lblSearchCriteria = new JLabel("Search Criteria:");
		lblSearchCriteria.setBounds(64, 52, 129, 14);
		frame.getContentPane().add(lblSearchCriteria);
		
		JLabel lbl2 = new JLabel("Name:");
		lbl2.setBounds(64, 101, 54, 14);
		frame.getContentPane().add(lbl2);
		
		JLabel lblSearchCriteria_1_1 = new JLabel("Album:");
		lblSearchCriteria_1_1.setBounds(64, 125, 64, 14);
		frame.getContentPane().add(lblSearchCriteria_1_1);
		
		JLabel lblSearchCriteria_1_1_1 = new JLabel("Artist:");
		lblSearchCriteria_1_1_1.setBounds(64, 148, 64, 14);
		frame.getContentPane().add(lblSearchCriteria_1_1_1);
		
		JLabel lblSearchCriteria_1_1_1_1 = new JLabel("Year:");
		lblSearchCriteria_1_1_1_1.setBounds(64, 172, 73, 14);
		frame.getContentPane().add(lblSearchCriteria_1_1_1_1);
		
		JLabel lblName = new JLabel("");
		lblName.setBounds(144, 101, 152, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblAlbum = new JLabel("");
		lblAlbum.setBounds(144, 123, 152, 14);
		frame.getContentPane().add(lblAlbum);
		
		JLabel lblArtist = new JLabel("");
		lblArtist.setBounds(144, 148, 152, 14);
		frame.getContentPane().add(lblArtist);
		
		JLabel lblYear = new JLabel("");
		lblYear.setBounds(144, 172, 152, 14);
		frame.getContentPane().add(lblYear);
		
		JLabel lblDesc = new JLabel("");
		lblDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc.setBounds(62, 201, 321, 29);
		frame.getContentPane().add(lblDesc);
		
		JButton btnSearch = new JButton("Search!");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// variable declaration
				boolean inputFound = false;
				String userInput = textInput.getText();
				userInput = userInput.toLowerCase();
				
				// for each song, check if user input is equal to name, album, artist or year
				for (int j=0; j<songList.size(); j++) {
					
					// if it is, output corresponding song information
					if (songList.get(j).name.equals(userInput) || songList.get(j).album.equals(userInput) || songList.get(j).artist.equals(userInput) || songList.get(j).year.equals(userInput)) {
						
						inputFound = true;
						lblName.setText(songList.get(j).name);
						lblAlbum.setText(songList.get(j).album);
						lblArtist.setText(songList.get(j).artist);
						lblYear.setText(songList.get(j).year);
						lblDesc.setText("Input found!");
						break;
						
					}	
					
				}
				
				// if song is not found, clear text labels and output that input was not found
				if (inputFound == false) {
					
					lblDesc.setText("Input not found!");
					lblName.setText("");
					lblAlbum.setText("");
					lblArtist.setText("");
					lblYear.setText("");
					
				}
				
			}
		});
		btnSearch.setBounds(259, 48, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnClear = new JButton("Clear!");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// clear all text boxes
				textInput.setText("");
				lblDesc.setText("");
				lblName.setText("");
				lblAlbum.setText("");
				lblArtist.setText("");
				lblYear.setText("");
				
			}
		});
		btnClear.setBounds(202, 241, 85, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit!");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exit program
				System.exit(0);
				
			}
		});
		btnExit.setBounds(297, 241, 89, 23);
		frame.getContentPane().add(btnExit);
		
		
		
		
	}
}
