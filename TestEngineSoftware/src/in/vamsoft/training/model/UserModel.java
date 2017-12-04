package in.vamsoft.training.model;

public class UserModel {
  private int USER_ID;
  private String USER_NAME, PASSWORD;

 
  

  @Override
  public String toString() {
    return "UserModel [USER_ID=" + USER_ID + ", USER_NAME=" + USER_NAME + ", PASSWORD=" + PASSWORD + ", valid=" + valid
        + "]";
  }

  public UserModel(int uSER_ID, String uSER_NAME, String pASSWORD) {
    super();
    USER_ID = uSER_ID;
    USER_NAME = uSER_NAME;
    PASSWORD = pASSWORD;
    
  }

  public UserModel(String uSER_NAME,String pASSWORD) {
    super();
    USER_NAME = uSER_NAME;
    PASSWORD = pASSWORD;
  }
  public UserModel() {
    super();
  }
  public int getUSER_ID() {
    return USER_ID;
  }

  public void setUSER_ID(int uSER_ID) {
    USER_ID = uSER_ID;
  }

  public String getUSER_NAME() {
    return USER_NAME;
  }

  public void setUSER_NAME(String uSER_NAME) {
    USER_NAME = uSER_NAME;
  }

  public String getPASSWORD() {
    return PASSWORD;
  }

  public void setPASSWORD(String pASSWORD) {
    PASSWORD = pASSWORD;
  }
  

public boolean valid;
public boolean isValid() {
  return valid;
}

public void setValid(boolean newValid) {
  valid = newValid;
} 
}