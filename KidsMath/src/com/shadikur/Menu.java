package com.shadikur;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frmKidsmathsByShuvo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmKidsmathsByShuvo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKidsmathsByShuvo = new JFrame();
		frmKidsmathsByShuvo.setIconImage(Toolkit.getDefaultToolkit().getImage(KidsMathsAddition.class.getResource("/media/shadikur_dark.png")));
		frmKidsmathsByShuvo.setTitle("KidsMaths by Shuvo");
		frmKidsmathsByShuvo.setBounds(100, 100, 481, 370);
		frmKidsmathsByShuvo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKidsmathsByShuvo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a type");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 24, 112, 35);
		frmKidsmathsByShuvo.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Addition (+)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				KidsMathsAddition addition = new KidsMathsAddition();
				frmKidsmathsByShuvo.setVisible(false);
				addition.setVisible(true);
			}

		});
		btnNewButton.setBounds(67, 70, 136, 83);
		frmKidsmathsByShuvo.getContentPane().add(btnNewButton);
		
		JButton btnSu = new JButton("Subtraction (-)");
		btnSu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KidsMathsSubtraction subt = new KidsMathsSubtraction();
				frmKidsmathsByShuvo.setVisible(false);
				subt.setVisible(true);
			}
		});
		btnSu.setBounds(223, 70, 142, 83);
		frmKidsmathsByShuvo.getContentPane().add(btnSu);
		
		JButton btnMultiplicationX = new JButton("Multiplication ( x )");
		btnMultiplicationX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KidsMathsmultiplication multi = new KidsMathsmultiplication();
				frmKidsmathsByShuvo.setVisible(false);
				multi.setVisible(true);
			}
		});
		btnMultiplicationX.setBounds(67, 164, 136, 83);
		frmKidsmathsByShuvo.getContentPane().add(btnMultiplicationX);
		
		JButton btnDivision = new JButton("Division (\u00F7) ");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KidsMathsDivision div = new KidsMathsDivision();
				frmKidsmathsByShuvo.setVisible(false);
				div.setVisible(true);
			}
		});
		btnDivision.setBounds(223, 164, 142, 83);
		frmKidsmathsByShuvo.getContentPane().add(btnDivision);
	}
}
