package MainProject01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Payment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
        contentPane.setBackground(new Color(44, 62, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAYMENT");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(28, 40, 435, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblPayment = new JLabel("PAYMENT OPTION:");
		lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayment.setForeground(Color.WHITE);
		lblPayment.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblPayment.setBounds(43, 132, 163, 45);
		contentPane.add(lblPayment);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "CREDIT CARD", "EASYPAISA", "JAZZCASH"}));
		comboBox.setFont(new Font("Century Schoolbook", Font.BOLD, 11));
		comboBox.setBounds(278, 144, 163, 22);
		contentPane.add(comboBox);
		
		JLabel lblAccountNumber = new JLabel("ACCOUNT NUMBER:");
		lblAccountNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountNumber.setForeground(Color.WHITE);
		lblAccountNumber.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblAccountNumber.setBounds(41, 213, 163, 45);
		contentPane.add(lblAccountNumber);
		
		textField = new JTextField();
		textField.setBounds(278, 225, 163, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblHolderName = new JLabel("HOLDER NAME:");
		lblHolderName.setHorizontalAlignment(SwingConstants.CENTER);
		lblHolderName.setForeground(Color.WHITE);
		lblHolderName.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblHolderName.setBounds(42, 276, 163, 45);
		contentPane.add(lblHolderName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(278, 288, 163, 22);
		contentPane.add(textField_1);
		
		JButton bookButton_1 = new JButton("VERIFY PAYMENT");
		bookButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Payment Successfull, qr code downloaded");
				new AfterLogin().setVisible(true);
				dispose();
			}
		});
		bookButton_1.setForeground(Color.WHITE);
		bookButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		bookButton_1.setFocusPainted(false);
		bookButton_1.setBorderPainted(false);
		bookButton_1.setBackground(new Color(52, 152, 219));
		bookButton_1.setBounds(162, 351, 179, 24);
		contentPane.add(bookButton_1);
	}
}
