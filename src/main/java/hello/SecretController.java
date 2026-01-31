@RestController
public class SecretController {

    private final String githubToken;

    public SecretController() {
        this.githubToken = System.getenv("GITHUB_TOKEN");
    }
}
