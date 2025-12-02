package AuthorizationServer.demo;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class UserRepository {
    private final Map<String, String> userPasswords = Map.of(
            "admin", "123",
            "user", "pass"
    );

    private final Map<String, List<Authorities>> userAuthoritiesMap = Map.of(
            "admin", Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE),
            "user", Arrays.asList(Authorities.READ)
    );

    public List<Authorities> getUserAuthorities(String user, String password) {
        String correctPassword = userPasswords.get(user);
        if (correctPassword != null && correctPassword.equals(password)) {
            return userAuthoritiesMap.getOrDefault(user, Collections.emptyList());
        }
        return Collections.emptyList();
    }
}
