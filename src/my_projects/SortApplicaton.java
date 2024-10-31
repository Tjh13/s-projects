package my_projects;

import java.awt.EventQueue;

import javax.swing.JScrollPane;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class SortApplicaton {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortApplicaton window = new SortApplicaton();
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
	public SortApplicaton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 833, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea ta = new JTextArea();
		JScrollPane scroll = new JScrollPane (ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scroll);
		scroll.setBounds(250, 11, 557, 616);
		frame.setVisible (true);
		
		JCheckBox chckbxAscending = new JCheckBox("Ascending?");
		chckbxAscending.setBounds(81, 99, 97, 23);
		frame.getContentPane().add(chckbxAscending);
		
		String line = "";
		BufferedReader br = null;
		ArrayList<String> linesList = new ArrayList<String>();
		
		// open file located under src folder, forced to use try-catch
		try {
			
			br = new BufferedReader(new FileReader("DeathList.csv"));
			
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
		
		Death[] deaths = new Death[linesList.size()];
		String[] dates = new String[linesList.size()];
		String[] places = new String[linesList.size()];
		String[] ages = new String[linesList.size()];
				
		for (int i=0; i<linesList.size()-1; i++) {
			
			dates[i] = (linesList.get(i).split(",")[0]);
			places[i] = (linesList.get(i).split(",")[1]);
			ages[i] = (linesList.get(i).split(",")[5]);
			Death myDeath = new Death(dates[i], places[i], ages[i]);
			deaths[i] = myDeath;
			
		}
		
		JButton btnDate = new JButton("Sort by Date!");
		btnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxAscending.isSelected() == true) {
					
					boolean swapped = true;

					while (swapped == true)  {
								
						swapped = false;
	
						// code to keep passing, comparing and swapping
						for (int i=0; i<deaths.length-2; i++)  {
									
							// if string is later alphabetically, swap
							if (deaths[i].date.compareTo(deaths[i+1].date) > 0)  {
										
								swap(deaths, i, i+1);
								swapped = true;
						
							}
							
						}
						
					}
							
					
				}
						
				else {
							
					boolean swapped = true;

					while (swapped == true)  {
								
						swapped = false;
							
						// code to keep passing, comparing and swapping
						for (int i=0; i<deaths.length-2; i++)  {
									
							// if string is earlier alphabetically, swap
							if (deaths[i].date.compareTo(deaths[i+1].date) < 0)  {
										
										swap(deaths, i, i+1);
										swapped = true;
							}
						
						}
					
					}
					
				}
				
				printDeaths(deaths, ta);
			
			}
		});
		btnDate.setBounds(30, 129, 179, 23);
		frame.getContentPane().add(btnDate);
		
		JButton btnPlace = new JButton("Sort by Place!");
		btnPlace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxAscending.isEnabled() == true) {
					
					boolean swapped = true;

					while (swapped == true)  {
								
						swapped = false;
							
						// code to keep passing, comparing and swapping
						for (int i=0; i<deaths.length-2; i++)  {
									
							// if string is later alphabetically, swap
							if (deaths[i].place.compareTo(deaths[i+1].place) > 0)  {
										
								swap(deaths, i, i+1);
								swapped = true;
						
							}
							
						}
						
					}
							
					
				}
						
				else {
							
					boolean swapped = true;

					while (swapped == true)  {
								
						swapped = false;
							
						// code to keep passing, comparing and swapping
						for (int i=0; i<deaths.length-2; i++)  {
									
							// if string is earlier alphabetically, swap
							if (deaths[i].place.compareTo(deaths[i+1].place) < 0)  {
										
										swap(deaths, i, i+1);
										swapped = true;
							}
						
						}
					
					}
					
				}
				
				printDeaths(deaths, ta);
				
			}
		});
		btnPlace.setBounds(30, 163, 179, 23);
		frame.getContentPane().add(btnPlace);
		
		JButton btnAge = new JButton("Sort by Age!");
		btnAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxAscending.isEnabled() == true) {
					
					boolean swapped = true;

					while (swapped == true)  {
								
						swapped = false;
							
						// code to keep passing, comparing and swapping
						for (int i=0; i<deaths.length-2; i++)  {
									
							// if string is later alphabetically, swap
							if (deaths[i].age.compareTo(deaths[i+1].age) > 0)  {
										
								swap(deaths, i, i+1);
								swapped = true;
						
							}
							
						}
						
					}
							
					
				}
						
				else {
							
					boolean swapped = true;

					while (swapped == true)  {
								
						swapped = false;
							
						// code to keep passing, comparing and swapping
						for (int i=0; i<deaths.length-2; i++)  {
									
							// if string is earlier alphabetically, swap
							if (deaths[i].age.compareTo(deaths[i+1].age) < 0)  {
										
										swap(deaths, i, i+1);
										swapped = true;
							}
						
						}
					
					}
					
				}
				
				printDeaths(deaths, ta);
				
			}
		});
		btnAge.setBounds(30, 197, 179, 23);
		frame.getContentPane().add(btnAge);
		
	}
	
	public static void swap(Death[] a, int x, int y)  {
		
		Death temp = a[x];
		a[x] = a[y];
		a[y] = temp;

	}
	
	public static void printDeaths(Death[] a, JTextArea ta)  {
		
		String myString = "";
		for (int i=0; i<a.length-1; i++) {
			
			myString = myString + a[i].toString() + "\n";
			
		}
		
		ta.setText(myString);
	
	}
	
}
