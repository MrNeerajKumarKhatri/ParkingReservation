package MainProject01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BookingDetail extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    

    public BookingDetail(int bookingID) {
        getContentPane().setBackground(new Color(44, 62, 80));
        setBounds(100, 100, 500, 500);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Information:");
        lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(10, 11, 466, 39);
        getContentPane().add(lblNewLabel);
        
        JLabel lblName = new JLabel("NAME:");
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        lblName.setForeground(Color.WHITE);
        lblName.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
        lblName.setBounds(35, 81, 150, 39);
        getContentPane().add(lblName);
        
        JLabel lblCnic = new JLabel("CNIC:");
        lblCnic.setHorizontalAlignment(SwingConstants.CENTER);
        lblCnic.setForeground(Color.WHITE);
        lblCnic.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
        lblCnic.setBounds(35, 131, 150, 39);
        getContentPane().add(lblCnic);
        
        JLabel lblCarModel = new JLabel("CAR MODEL:");
        lblCarModel.setHorizontalAlignment(SwingConstants.CENTER);
        lblCarModel.setForeground(Color.WHITE);
        lblCarModel.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
        lblCarModel.setBounds(35, 181, 150, 39);
        getContentPane().add(lblCarModel);
        
        JLabel lblNumberPlate = new JLabel("Number Plate:");
        lblNumberPlate.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumberPlate.setForeground(Color.WHITE);
        lblNumberPlate.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
        lblNumberPlate.setBounds(35, 231, 150, 39);
        getContentPane().add(lblNumberPlate);
        
        JLabel lblPhoneNumber = new JLabel("Phone Number:");
        lblPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblPhoneNumber.setForeground(Color.WHITE);
        lblPhoneNumber.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
        lblPhoneNumber.setBounds(35, 284, 150, 39);
        getContentPane().add(lblPhoneNumber);
        
        textField = new JTextField();
        textField.setBounds(266, 87, 166, 31);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(266, 139, 166, 31);
        getContentPane().add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(266, 187, 166, 31);
        getContentPane().add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(266, 237, 166, 31);
        getContentPane().add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(266, 290, 166, 31);
        getContentPane().add(textField_4);
        
        JButton bookButton = new JButton("PROCEED");
        bookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C://Users//prime//eclipse-workspace//MainProject//parking.accdb");
                    String query = "UPDATE Table1 SET [name] = ?, [CNIC] = ?, [Car model] = ?, [number plate] = ?, [phone number] = ? WHERE BookingID = ?";
                    PreparedStatement pstmt = conn.prepareStatement(query);

                    String name = textField.getText();
                    String cnic = textField_1.getText();
                    String carModel = textField_2.getText();
                    String numberPlate = textField_3.getText();
                    String phoneNumber = textField_4.getText();

                    pstmt.setString(1, name);
                    pstmt.setString(2, cnic);
                    pstmt.setString(3, carModel);
                    pstmt.setString(4, numberPlate);
                    pstmt.setString(5, phoneNumber);
                    pstmt.setInt(6, bookingID);

                    int rowsUpdated = pstmt.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, "Booking Details Saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        QrCode01.generateBookingQRCode(name, cnic, carModel, numberPlate, phoneNumber);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error updating details.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    pstmt.close();
                    conn.close();
                    	new Payment().setVisible(true);
                    	
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(
                    	    null, 
                    	    "Enter the details", 
                    	    "Error", 
                    	    JOptionPane.ERROR_MESSAGE
                    	);                }
            }
        });
 
        bookButton.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
        bookButton.setForeground(Color.WHITE);
        bookButton.setBackground(new Color(52, 152, 219));
        bookButton.setBorderPainted(false);
        bookButton.setFocusPainted(false);
        bookButton.setBounds(132, 355, 195, 39);
        getContentPane().add(bookButton);
    }
}
