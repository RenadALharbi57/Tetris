import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewLoginAdapter {
    
	private ExistingLoginPage adaptee;

    public NewLoginAdapter(ExistingLoginPage adaptee) {
        this.adaptee = adaptee;
    }

    public NewLoginAdapter() {
        // Default constructor
    }

    // Adapted method for login
    public boolean authenticate() {
        String username = adaptee.getUsernameField().getText();
        String password = new String(adaptee.getPasswordField().getPassword());

        return "admin".equals(username) && "password".equals(password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ExistingLoginPage existingLoginPage = new ExistingLoginPage();
                existingLoginPage.setVisible(true);

                // Initialize the adapter with the existing login page
                NewLoginAdapter loginAdapter = new NewLoginAdapter(existingLoginPage);

                // Replace the existing button listener with one that uses the adapter
                existingLoginPage.getLoginButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (loginAdapter.authenticate()) {
                            JOptionPane.showMessageDialog(existingLoginPage, "Login successful!");
                            existingLoginPage.setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(existingLoginPage, "Login failed. Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
            }
        });
    }
}

