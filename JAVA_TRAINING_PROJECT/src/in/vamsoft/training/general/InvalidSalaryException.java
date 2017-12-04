package in.vamsoft.training.general;

public class InvalidSalaryException extends Exception {

  enum Allow {
    Min, Max;
  }

  Allow errormsg;
 

  

  public InvalidSalaryException(String message) {
    super(message);
    

  }

}
