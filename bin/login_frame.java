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
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_frame extends Main {

	private JFrame frmTtsbasicLogin;
	public static  JTextField getUsername;
	public static  JTextField getPassword;
	private JLabel error;
	private JLabel lblOffline;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_frame window = new login_frame();
					window.frmTtsbasicLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTtsbasicLogin = new JFrame();
		frmTtsbasicLogin.setTitle("TTS-BASIC  |  Login Prompt");
		frmTtsbasicLogin.setBounds(100, 100, 450, 300);
		frmTtsbasicLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTtsbasicLogin.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("TTS-BASIC    LOGIN");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		title.setBounds(0, 0, 434, 51);
		frmTtsbasicLogin.getContentPane().add(title);
		
		JLabel lbluser = new JLabel("Username:");
		lbluser.setBounds(35, 97, 80, 14);
		frmTtsbasicLogin.getContentPane().add(lbluser);
		
		JLabel lblpass = new JLabel("Password:");
		lblpass.setBounds(35, 129, 70, 14);
		frmTtsbasicLogin.getContentPane().add(lblpass);
		
		getUsername = new JTextField();
		getUsername.setBounds(116, 94, 219, 20);
		frmTtsbasicLogin.getContentPane().add(getUsername);
		getUsername.setColumns(10);
		
		getPassword = new JTextField();
		getPassword.setBounds(116, 126, 219, 20);
		frmTtsbasicLogin.getContentPane().add(getPassword);
		getPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.eval();
				if (Main.status == true)
				{
					error.setForeground(SystemColor.control);
					lblOffline.setForeground(Color.RED);
					lblOffline.setText("CONNECTED");
					frmTtsbasicLogin.dispose();
				} else {
					error.setForeground(SystemColor.RED);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(242, 226, 182, 29);
		frmTtsbasicLogin.getContentPane().add(btnNewButton);
		
		error = new JLabel("ERROR:  Login Credentials Provided Are Incorrect");
		error.setHorizontalAlignment(SwingConstants.CENTER);
		error.setForeground(SystemColor.control);
		error.setBounds(81, 154, 298, 14);
		frmTtsbasicLogin.getContentPane().add(error);
		
		JLabel lblStatus = new JLabel("STATUS:");
		lblStatus.setBounds(10, 236, 59, 14);
		frmTtsbasicLogin.getContentPane().add(lblStatus);
		
		lblOffline = new JLabel("OFFLINE");
		lblOffline.setForeground(Color.RED);
		lblOffline.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOffline.setBounds(79, 236, 99, 14);
		frmTtsbasicLogin.getContentPane().add(lblOffline);
	}
}
