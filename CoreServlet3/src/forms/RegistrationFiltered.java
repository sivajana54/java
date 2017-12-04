package forms;

import javax.servlet.annotation.*;
import coreservlets.*;

/** The only differences between the Registration and RegistrationFiltered
 *  classes are the definition of the checkVal method (RegistrationFiltered
 *  added a call to the filter method) and the addition of
 *  "import coreservlets.*" (since filter is in a class in the coreservlets
 *  package).
 */

@WebServlet("/register-filtered")
public class RegistrationFiltered extends Registration {

  /** Returns error message if value is missing or is empty string.
   *  Filters the result otherwise.
   */

  @Override
  protected String checkVal(String orig, String replacement) {
    if ((orig == null) || (orig.trim().equals(""))) {
      return("<FONT COLOR=RED><B>" + replacement + "</B></FONT>");
    } else {
      return(ServletUtilities.filter(orig));
    }
  }
}
