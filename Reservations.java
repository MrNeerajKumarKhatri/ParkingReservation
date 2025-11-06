package MainProject01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Reservations extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

		public Reservations() {
			setSize(500, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        ImageIcon imageIcon = new ImageIcon("C:\\Users\\prime\\Desktop\\qrcode.png"); 
	        Image image = imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
	        imageIcon = new ImageIcon(image);
	        JLabel label = new JLabel(imageIcon);
	        setLayout(new BorderLayout());
	        add(label, BorderLayout.CENTER);

	        setVisible(true);
	    }
	}
		


	   

