
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExistingLoginPage extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public ExistingLoginPage() {
        super("Login");

        // Initialize components
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Set layout
        setLayout(new GridLayout(3, 2));

        // Add components to the frame
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(new JLabel()); // Placeholder
        add(loginButton);

        // Set action listener for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                
                // Perform login validation (dummy logic)
                if (login(username, password)) {
                    JOptionPane.showMessageDialog(ExistingLoginPage.this, "Login successful!");
                    
                    setVisible(false);
                    
                } else {
                    JOptionPane.showMessageDialog(ExistingLoginPage.this, "Login failed. Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    // Dummy method to simulate login logic
    private boolean login(String username, String password) {
        // Dummy validation logic - Replace with your actual login logic
        return "admin".equals(username) && "password".equals(password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExistingLoginPage();
            }
        });
    }

	public JTextField getUsernameField() {
		// TODO Auto-generated method stub
		return usernameField;
	}

	public JPasswordField getPasswordField() {
		// TODO Auto-generated method stub
		return passwordField;
	}
}
