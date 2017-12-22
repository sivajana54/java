package in.vamsoft.training.model;

public class UserModel {
  private int userId;
  private String userName;
  private String password;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  /** the constructor
   * @param userId.
   * @param userName.
   * @param password.
   */
  public UserModel(String userName, String password) {
    super();
    
    this.userName = userName;
    this.password = password;
  }

  @Override
  public String toString() {
    return "UserModel [userId=" + userId + ", userName=" + userName 
                                  + ", password=" + password + "]";
    
  }

  public UserModel() {
    super();
    // TODO Auto-generated constructor stub
  }


 


  public boolean valid;

  public boolean isValid() {
    return valid;
  }

  public void setValid(boolean newValid) {
    valid = newValid;
  }

}