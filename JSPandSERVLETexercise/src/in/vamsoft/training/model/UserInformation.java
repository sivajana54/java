package in.vamsoft.training.model;

public class UserInformation {
  int userId;
  String userName;
  String password;
  String firstName;
  String lastName;
  String email;

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

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInformation() {
    super();
    
  }

  /** The Constructor for the UserInformation Model Class.
   * @param userId.
   * @param userName.
   * @param password.
   * @param firstName.
   * @param lastName.
   * @param email.
   */
  public UserInformation(int userId, String userName, String password, 
                                 String firstName, String lastName, String email) {
    super();
    this.userId = userId;
    this.userName = userName;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  @Override
  public String toString() {
    return "UserInformation [userId=" + userId + ", userName=" + userName 
                              + ", password=" + password + ", firstName="
        + firstName + ", lastName=" + lastName + ", email=" + email + "]";
  }
   


}
