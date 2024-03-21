public class UserLogIn {
  private static final String validPassword = "password";
  private static final int maxAttempts = 3;

  private String username;
  private int attempts;

  public UserLogIn(String username) {
      this.username = username;
      this.attempts = 0;
  }

  public void passWordLogIn(String inputPassword) throws MaximumLogInTriesException, InvalidPasswordException {
      while (attempts < maxAttempts) {
          if (inputPassword.equals(validPassword)) {
              System.out.println("Login successful!");
              return;
          } else {
              attempts++;
              if (attempts == maxAttempts) {
                  throw new MaximumLogInTriesException("Maximum login attempts exceeded. Access Denied.");
              } else {
                  throw new InvalidPasswordException("Invalid password. Please try again.");
              }
          }
      }
  }
}

