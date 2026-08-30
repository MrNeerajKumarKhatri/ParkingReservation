package MainProject01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class CitySelection extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public CitySelection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
        contentPane.setBackground(new Color(44, 62, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("City and Spot Selection:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(58, 11, 338, 70);
		
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select City:");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(61, 115, 125, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Select a City Spot:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(61, 225, 151, 49);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Hyderabad", "Karachi", "Sarghoda", "Islamabad"}));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		comboBox.setBounds(250, 130, 135, 22);
		contentPane.add(comboBox);
		
		 JComboBox comboBox_1 = new JComboBox<>();
	        comboBox_1.setBounds(250, 240, 135, 22);
	        contentPane.add(comboBox_1);

	        comboBox.addActionListener(e -> {
	            String city = (String) comboBox.getSelectedItem();
	            if (city.equals("Hyderabad")) {
	                comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"Spot 1", "Spot 2", "Spot 3"}));
	            } else if (city.equals("Karachi")) {
	                comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"Spot 4", "Spot 5", "Spot 6"}));
	            } else if (city.equals("Jamshoro")) {
	                comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"Spot 7", "Spot 8", "Spot 9"}));
	            } else if (city.equals("Islamabad")) {
	                comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"Spot 10", "Spot 11", "Spot 12"}));
	            } else {
	                comboBox_1.setModel(new DefaultComboBoxModel(new String[]{}));
	            }
	        });
	        
	        JButton proceed = new JButton("Proceed");
	        proceed.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C://Users//prime//eclipse-workspace//MainProject//parking.accdb");
	                    String query = "INSERT INTO Table1 ([City], [Spot]) VALUES (?, ?)";
	                    PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	                    
	                    String city = (String) comboBox.getSelectedItem();
	                    String spot = (String) comboBox_1.getSelectedItem();
	                    
	                    if (city.equals("Select") || spot == null) {
	                        JOptionPane.showMessageDialog(null, "Please select both city and spot.");
	                        return;
	                    }

	                    pstmt.setString(1, city);
	                    pstmt.setString(2, spot);
	                    pstmt.executeUpdate();

	                    
	                    ResultSet rs = pstmt.getGeneratedKeys();
	                    int bookingID = 0;
						if (rs.next()) {
	                        bookingID = rs.getInt(1); 
	                    }
	                    
	                    pstmt.close();
	                    conn.close();

	                    JOptionPane.showMessageDialog(null, "City and Spot Selected! Booking ID: " + bookingID);
	                
	                    BookingDetail booking = new BookingDetail(bookingID);
	                    booking.setVisible(true);
	                    dispose();

	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });			proceed.setForeground(Color.WHITE);
			proceed.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
			proceed.setFocusPainted(false);
			proceed.setBorderPainted(false);
			proceed.setBackground(new Color(0, 64, 128));
			proceed.setBounds(144, 316, 164, 40);
			contentPane.add(proceed);
	}
}
