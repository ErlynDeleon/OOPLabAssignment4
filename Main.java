import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter username: ");
      String username = sc.nextLine();

      UserLogIn login = new UserLogIn(username);

      boolean loggedIn = false;
      while (!loggedIn) {
          System.out.print("Enter password: ");
          String password = sc.nextLine();

          try {
              login.passWordLogIn(password);
              loggedIn = true;
          } catch (MaximumLogInTriesException e) {
              System.out.println(e.getMessage());
              break; 
          } catch (InvalidPasswordException e) {
              System.out.println(e.getMessage());
          }
      }
  }
}
