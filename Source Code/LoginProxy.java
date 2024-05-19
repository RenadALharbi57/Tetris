
public class LoginProxy {
    private NewLoginAdapter loginAdapter;

    public LoginProxy(ExistingLoginPage adaptee) {
        loginAdapter = new NewLoginAdapter(adaptee);
    }

    // Proxy method for login, you can add additional functionalities here
    public boolean authenticate(String username, String password) {
        // Perform additional checks or logging if needed
        System.out.println("Proxy: Additional checks before authenticating...");

//        long startTime = System.currentTimeMillis();

        // Delegate authentication to the actual adapter
        boolean isAuthenticated = loginAdapter.authenticate();
        
//        long endTime = System.currentTimeMillis();
//        System.out.println("Proxy: Authentication took " + (endTime - startTime) + " ms");

        if (isAuthenticated) {
            System.out.println("Proxy: User authenticated successfully");
        } else {
            System.out.println("Proxy: Authentication failed");
        }

        return isAuthenticated;
    }
}

