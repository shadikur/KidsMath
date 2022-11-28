package com.shadikur;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class KidsMathsSubtraction {

	private JFrame frmMathsGameFor;
	private JTextField textField;
	private int rightAns = 0, wrong = 0, totalSolved = 0;
	private static int num1 = 0;
	private static int num2 = 0;
	private static int level = 20;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		num1 = rand.nextInt(level);
		num2 = rand.nextInt(level);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KidsMathsSubtraction window = new KidsMathsSubtraction();
					window.frmMathsGameFor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KidsMathsSubtraction() {
		initialize();
	}
	
	public void newNum() {
		Random rand = new Random();
		num1 = rand.nextInt(level);
		num2 = rand.nextInt(level);
	}
	
	public int resultNum(int x, int y) {
		int ans = x - y;
		return ans;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMathsGameFor = new JFrame();
		frmMathsGameFor.setTitle("Maths Game for Kids by Shuvo");
		frmMathsGameFor.setIconImage(Toolkit.getDefaultToolkit().getImage(KidsMathsAddition.class.getResource("/media/shadikur_dark.png")));
		frmMathsGameFor.setBounds(100, 100, 445, 352);
		frmMathsGameFor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMathsGameFor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Enter your answer in the box below");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(94, 78, 247, 39);
		frmMathsGameFor.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Calibri", Font.BOLD, 25));
		textField.setBounds(147, 110, 152, 44);
		frmMathsGameFor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		
		btnNewButton.setBounds(177, 165, 89, 23);
		frmMathsGameFor.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Correct: " + rightAns);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(104, 236, 71, 14);
		frmMathsGameFor.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Wrong: " + wrong);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(198, 236, 81, 14);
		frmMathsGameFor.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total: " + totalSolved);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(255, 0, 255));
		lblNewLabel_2.setBounds(289, 236, 52, 14);
		frmMathsGameFor.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(num1 + " - " + num2 + " = ?");
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_3.setBounds(72, 45, 276, 39);
		frmMathsGameFor.getContentPane().add(lblNewLabel_3);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = textField.getText();
				int resultValue = Integer.parseInt(enteredValue);
				if ( resultValue == resultNum(num1, num2)) {
					newNum();
					lblNewLabel_3.setText(num1 + " - " + num2 + " = ?");
					rightAns++;
					totalSolved++;
					lblNewLabel.setText("Correct: " + rightAns);
					lblNewLabel_2.setText("Total: " + totalSolved);
					
					
				}
				else {
					newNum();
					lblNewLabel_3.setText(num1 + " - " + num2 + " = ?");
					wrong++;
					totalSolved++;
					lblNewLabel_2.setText("Total: " + totalSolved);
					lblNewLabel_1.setText("Wrong: " + wrong);
				}
			}
		});
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmMathsGameFor.setVisible(b);
	}
}
