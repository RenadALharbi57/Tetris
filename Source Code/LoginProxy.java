package src;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginProxy {
    private NewLoginAdapter loginAdapter;

    public LoginProxy(JTextField usernameField, JPasswordField passwordField) {
        loginAdapter = new NewLoginAdapter(usernameField, passwordField);
    }

    // Proxy method for login, you can add additional functionalities here
    public boolean authenticate(String username, String password) {
        // Perform additional checks or logging if needed
        System.out.println("Proxy: Additional checks before authenticating...");

        // Delegate authentication to the actual adapter
        boolean isAuthenticated = loginAdapter.authenticate(username, password);

        if (isAuthenticated) {
            System.out.println("Proxy: User authenticated successfully");
        } else {
            System.out.println("Proxy: Authentication failed");
        }

        return isAuthenticated;
    }
}

