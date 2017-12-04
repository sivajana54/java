package in.vamsoft.training.dao;

import java.util.List;

import in.vamsoft.training.model.UserInformation;

public interface LoginDao {

  public String authenticateUser(UserInformation userInformation);
  public List<UserInformation> getUserInformation();

}
