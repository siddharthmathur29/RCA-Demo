import java.util.Map;

public final class LoginService {
    private final Map<String, String> credentials;

    public LoginService(Map<String, String> credentials) {
        this.credentials = Map.copyOf(credentials);
    }

    public boolean authenticate(String username, String password) {
        if (username == null || username.isBlank() || password.isBlank()) {
            return false;
        }
        return credentials.containsKey(username)
                && credentials.get(username).equals(password);
    }
}
