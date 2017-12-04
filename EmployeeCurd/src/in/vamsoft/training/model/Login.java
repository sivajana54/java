package in.vamsoft.training.model;

public class Login {
  private String username,pass;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public Login(String username, String pass) {
    super();
    this.username = username;
    this.pass = pass;
  }

  public Login() {
    super();
    // TODO Auto-generated constructor stub
  }

  @Override
  public String toString() {
    return "Login [username=" + username + ", pass=" + pass + "]";
  }
  
}
