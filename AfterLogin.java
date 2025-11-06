package MainProject01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AfterLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public AfterLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
        contentPane.setBackground(new Color(44, 62, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JButton bookButton = new JButton("Book a Parking Spot");
		bookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CitySelection cs= new CitySelection();
				cs.setVisible(true);
				dispose();
			}
		});
		bookButton.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		bookButton.setForeground(Color.WHITE);
		bookButton.setBackground(new Color(52, 152, 219)); 
		bookButton.setBorderPainted(false);
		bookButton.setFocusPainted(false);
		bookButton.setBounds(43, 134, 400, 95);

		
		bookButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        bookButton.setBackground(new Color(41, 128, 185)); 
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        bookButton.setBackground(new Color(52, 152, 219)); 
		    }
		});

		contentPane.add(bookButton);
		
		JButton bookButton_1 = new JButton("Your Reservations");
		bookButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reservations().setVisible(true);
			}
		});
		bookButton_1.setForeground(Color.WHITE);
		bookButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		bookButton_1.setFocusPainted(false);
		bookButton_1.setBorderPainted(false);
		bookButton_1.setBackground(new Color(52, 152, 219));
		bookButton_1.setBounds(43, 285, 400, 95);
		contentPane.add(bookButton_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel.setBounds(43, 36, 400, 48);
		contentPane.add(lblNewLabel);
	}
}
