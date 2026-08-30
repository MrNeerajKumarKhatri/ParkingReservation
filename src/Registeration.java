package MainProject01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import Booking.LoginFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registeration extends JFrame {

	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JPasswordField passwordField;
	public JTextField textField_3;

	public Registeration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
        contentPane.setBackground(new Color(44, 62, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(41, 57, 119, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblEmail.setBounds(41, 101, 119, 33);
		contentPane.add(lblEmail);
		
		JLabel lblPhoneNo = new JLabel("Phone NO:");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNo.setForeground(Color.WHITE);
		lblPhoneNo.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblPhoneNo.setBounds(41, 153, 119, 33);
		contentPane.add(lblPhoneNo);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblPassword.setBounds(41, 207, 119, 33);
		contentPane.add(lblPassword);
		
		JLabel lblConformPassword = new JLabel("Confirm Password:");
		lblConformPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConformPassword.setForeground(Color.WHITE);
		lblConformPassword.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblConformPassword.setBounds(41, 254, 156, 33);
		contentPane.add(lblConformPassword);
		
		textField = new JTextField();
		textField.setBounds(240, 65, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(240, 109, 156, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(240, 161, 156, 20);
		contentPane.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(240, 215, 156, 20);
		contentPane.add(passwordField);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(240, 262, 156, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerUser();
			}
		});
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnNewButton.setBounds(180, 319, 102, 25);
		contentPane.add(btnNewButton);
		
		
		
		
	}
	 private void registerUser() {
	        JOptionPane.showMessageDialog(this, "Registration Successful! Returning to login...");
	        dispose();
	        SwingUtilities.invokeLater(Login::new);
	    }
}
