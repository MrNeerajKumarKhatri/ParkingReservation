package MainProject01;

import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Login() {
        setTitle("Parking Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(44, 62, 80));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("USERNAME:");
        lblNewLabel.setBounds(57, 124, 133, 44);
        lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.WHITE);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(246, 130, 156, 36);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblPassword = new JLabel("PASSWORD:");
        lblPassword.setBounds(57, 219, 133, 44);
        lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
        contentPane.add(lblPassword);

        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(174, 283, 103, 44);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String username = textField.getText();
                 String password = new String(passwordField.getPassword());
                if (username.equals("admin") && password.equals("1234")){
                	JOptionPane.showMessageDialog(null, "Login Successful");
                    AfterLogin Al = new AfterLogin();
                    Al.setVisible(true);
                    dispose();
                }
                else {
                	JOptionPane.showMessageDialog(null, "Invalid username and password");
                }
            }
        });
        btnLogin.setForeground(new Color(255, 255, 255));
        btnLogin.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
        btnLogin.setBackground(new Color(44, 62, 80));
        contentPane.add(btnLogin);

        JLabel lblNewLabel_1 = new JLabel("New user click here :");
        lblNewLabel_1.setBounds(57, 361, 167, 44);
        lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
        lblNewLabel_1.setForeground(Color.WHITE);
        contentPane.add(lblNewLabel_1);

        JButton btnRegister = new JButton("REGISTER");
        btnRegister.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new Registeration().setVisible(true);
        		
        	}
        });
        btnRegister.setBounds(250, 372, 133, 23);
        btnRegister.setForeground(new Color(255, 255, 255));
        btnRegister.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
        btnRegister.setBackground(new Color(44, 62, 80));
        contentPane.add(btnRegister);

        JLabel lblTitle = new JLabel("Parking Reservation Project");
        lblTitle.setBounds(57, 11, 348, 80);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
        lblTitle.setForeground(Color.WHITE);
        contentPane.add(lblTitle);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(246, 225, 156, 36);
        contentPane.add(passwordField);

        
    }
    
}
