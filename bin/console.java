/*
 * Copyright (AJC) Ryan Wans (c) 2018. ALl Rights Reserved
 * Any code in this document, including API's under similar
 * branding are the sole property of Ryan Wans. Any distribution,
 * reproduction, taking snippits, or claiming of this code breaks 
 * the terms of service and voids any agreement with the end user.
*/

package tts_sql.origin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class console {

	private JFrame frmTtsbasicConsole;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					console window = new console();
					window.frmTtsbasicConsole.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public console() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTtsbasicConsole = new JFrame();
		frmTtsbasicConsole.setTitle("TTS-BASIC   |   Console");
		frmTtsbasicConsole.setBounds(100, 100, 584, 355);
		frmTtsbasicConsole.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTtsbasicConsole.getContentPane().setLayout(null);
		
		JPanel output = new JPanel();
		output.setBackground(Color.GRAY);
		output.setBounds(0, 0, 568, 287);
		frmTtsbasicConsole.getContentPane().add(output);
		output.setLayout(null);
		
		JTextArea consoleArea = new JTextArea();
		consoleArea.setText("Welcome to TTS-BASIC!");
		consoleArea.setWrapStyleWord(true);
		consoleArea.setBounds(10, 11, 548, 265);
		consoleArea.setEditable(false);
		output.add(consoleArea);
		
		JPanel input = new JPanel();
		input.setBackground(Color.WHITE);
		input.setBounds(0, 287, 568, 29);
		frmTtsbasicConsole.getContentPane().add(input);
		input.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.control);
		textField.setBounds(10, 5, 415, 20);
		input.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send Command");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String in = textField.getText();
				consoleArea.append("\n" + in);
				textField.setText("");
			}
		});
		btnNewButton.setBounds(435, 4, 123, 23);
		input.add(btnNewButton);
	}
}
