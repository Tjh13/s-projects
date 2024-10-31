package my_projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TicTacToe {
	
	// initialize variables
	int turnsTaken = 0; boolean xTurn = false; boolean oTurn = false; boolean x1 = false;boolean x2 = false; boolean x3 = false; boolean x4 = false; boolean x5 = false; boolean x6 = false; boolean x7 = false; boolean x8 = false; boolean x9 = false; boolean o1 = false; boolean o2 = false; boolean o3 = false; boolean o4 = false; boolean o5 = false; boolean o6 = false; boolean o7 = false; boolean o8 = false; boolean o9 = false; boolean gameOver = false; private JFrame frame; int game = 0; ImageIcon x = new ImageIcon(getClass().getResource("/resources/X.JPG")); ImageIcon o = new ImageIcon(getClass().getResource("/resources/O.JPG"));

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TicTacToe() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 389, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(135, 11, 104, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblGame = new JLabel("");
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setBounds(10, 414, 353, 24);
		frame.getContentPane().add(lblGame);
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn1 has not already been used, then use gameCheck function.
				if (xTurn == true && x1 == false && o1 == false) {btn1.setIcon(x); turnsTaken++; x1 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x1 == false && o1 == false) {btn1.setIcon(o); turnsTaken++; o1 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) {xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn1.setBounds(21, 41, 89, 87);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn2 has not already been used, then use gameCheck function.
				if (xTurn == true && x2 == false && o2 == false) { btn2.setIcon(x); turnsTaken++; x2 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x2 == false && o2 == false) {btn2.setIcon(o); turnsTaken++; o2 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) {xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn2.setBounds(135, 41, 89, 87);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn3 has not already been used, then use gameCheck function.
				if (xTurn == true && x3 == false && o3 == false) {btn3.setIcon(x); turnsTaken++; x3 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x3 == false && o3 == false) {btn3.setIcon(o); turnsTaken++; o3 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) { xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn3.setBounds(251, 41, 89, 87);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn6 has not already been used, then use gameCheck function.
				if (xTurn == true && x6 == false && o6 == false) {btn6.setIcon(x); turnsTaken++; x6 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x6 == false && o6 == false) {btn6.setIcon(o); turnsTaken++; o6 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) {xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn6.setBounds(251, 156, 89, 87);
		frame.getContentPane().add(btn6);
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn4 has not already been used, then use gameCheck function.
				if (xTurn == true && x4 == false && o4 == false) {btn4.setIcon(x); turnsTaken++; x4 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x4 == false && o4 == false) {btn4.setIcon(o); turnsTaken++; o4 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) {xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn4.setBounds(21, 156, 89, 87);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn5 has not already been used, then use gameCheck function.
				if (xTurn == true && x5 == false && o5 == false) {btn5.setIcon(x); turnsTaken++; x5 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x5 == false && o5 == false) {btn5.setIcon(o); turnsTaken++; o5 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) {xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn5.setBounds(135, 156, 89, 87);
		frame.getContentPane().add(btn5);
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn9 has not already been used, then use gameCheck function.
				if (xTurn == true && x9 == false && o9 == false) {btn9.setIcon(x); turnsTaken++; x9 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x9 == false && o9 == false) {btn9.setIcon(o); turnsTaken++; o9 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) {xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn9.setBounds(251, 271, 89, 87);
		frame.getContentPane().add(btn9);
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn7 has not already been used, then use gameCheck function.
				if (xTurn == true && x7 == false && o7 == false) {btn7.setIcon(x); turnsTaken++; x7 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x7 == false && o7 == false) {btn7.setIcon(o); turnsTaken++; o7 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) {xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn7.setBounds(21, 271, 89, 87);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if it is X's turn or O's turn and that btn8 has not already been used, then use gameCheck function.
				if (xTurn == true && x8 == false && o8 == false) {btn8.setIcon(x); turnsTaken++; x8 = true; xTurn = false; oTurn = true;}
				else if (oTurn == true && x8 == false && o8 == false) {btn8.setIcon(o); turnsTaken++; o8 = true; oTurn = false; xTurn = true;}
				game = gameCheck(lblGame, x1, x2, x3, x4, x5, x6, x7, x8, x9, o1, o2, o3, o4, o5, o6, o7, o8, o9);
				if (game == 1) {xTurn = false; oTurn = false; gameOver = true;}
				gameOver = drawCheck(lblGame, turnsTaken);
			}
		});
		btn8.setBounds(135, 271, 89, 87);
		frame.getContentPane().add(btn8);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if the game hasn't started yet, make it X's turn. If they are restarting, make it X's turn and reset all images and variables. 
				if (xTurn == false && oTurn == false && gameOver == false) {xTurn = true;}
				else {btn1.setIcon(null); btn2.setIcon(null); btn3.setIcon(null); btn4.setIcon(null); btn5.setIcon(null); btn6.setIcon(null); btn7.setIcon(null); btn8.setIcon(null); btn9.setIcon(null); turnsTaken = 0; xTurn = true; oTurn = false; x1 = false; x2 = false; x3 = false; x4 = false; x5 = false; x6 = false; x7 = false; x8 = false; x9 = false; o1 = false; o2 = false; o3 = false; o4 = false; o5 = false; o6 = false; o7 = false; o8 = false; o9 = false; gameOver = false; game = 0; lblGame.setText("");}
			}
		});
		btnX.setBounds(43, 369, 48, 45);
		frame.getContentPane().add(btnX);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if the game hasn't started yet, make it O's turn. If they are restarting, make it O's turn and reset all images and variables. 
				if (xTurn == false && oTurn == false && gameOver == false) {oTurn = true;}
				else {btn1.setIcon(null); btn2.setIcon(null); btn3.setIcon(null); btn4.setIcon(null); btn5.setIcon(null); btn6.setIcon(null); btn7.setIcon(null); btn8.setIcon(null); btn9.setIcon(null); turnsTaken = 0; xTurn = false; oTurn = true; x1 = false; x2 = false; x3 = false; x4 = false; x5 = false; x6 = false; x7 = false; x8 = false; x9 = false; o1 = false; o2 = false; o3 = false; o4 = false; o5 = false; o6 = false; o7 = false; o8 = false; o9 = false; gameOver = false; game = 0; lblGame.setText("");}
			}
		});
		btnO.setBounds(156, 369, 48, 45);
		frame.getContentPane().add(btnO);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// exit program
				System.exit(0);
			}
		});
		btnExit.setBounds(261, 369, 65, 34);
		frame.getContentPane().add(btnExit);
	}
	
	// DESCRIPTION: checks if the game is over by going through all of the possible winning scenarios
	// PARAMETERS: JLabel lblGame, boolean x1, boolean x2, boolean x3, boolean x4, boolean x5, boolean x6, boolean x7, boolean x8, boolean x9, boolean o1, boolean o2, boolean o3, boolean o4, boolean o5, boolean o6, boolean o7, boolean o8, boolean o9
	// RETURN TYPE: int
	public static int gameCheck(JLabel lblGame, boolean x1, boolean x2, boolean x3, boolean x4, boolean x5, boolean x6, boolean x7, boolean x8, boolean x9, boolean o1, boolean o2, boolean o3, boolean o4, boolean o5, boolean o6, boolean o7, boolean o8, boolean o9) {
		if (x1 == true && x4 == true && x7 == true || x2 == true && x5 == true && x8 == true || x3 == true && x6 == true && x9 == true || x1 == true && x2 == true && x3 == true || x4 == true && x5 == true && x6 == true || x7 == true && x8 == true && x9 == true || x1 == true && x5 == true && x9 == true || x3 == true && x5 == true && x7 == true || o1 == true && o4 == true && o7 == true || o2 == true && o5 == true && o8 == true || o3 == true && o6 == true && o9 == true || o1 == true && o2 == true && o3 == true || o4 == true && o5 == true && o6 == true || o7 == true && o8 == true && o9 == true || o1 == true && o5 == true && o9 == true || o3 == true && o5 == true && o7 == true) {lblGame.setText("Game over! Press X or O again to restart!"); return 1;}
		else {return 0;}	
	}
	
	public static boolean drawCheck(JLabel lblGame, int turnsTaken) {
		if (turnsTaken == 9) {lblGame.setText("Draw! Press X or O to restart!"); return true;}
		else {return false;}
	}
}