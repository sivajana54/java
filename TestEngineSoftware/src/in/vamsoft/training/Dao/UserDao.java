package in.vamsoft.training.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;


import in.vamsoft.training.dbutil.DBConnectionUtil;
import in.vamsoft.training.model.UserModel;

public class UserDao {
  public static Logger logger = Logger.getLogger(UserDao.class);
  static Connection Connection = null;
  static ResultSet rs = null;  



  public static UserModel login(UserModel bean) {

     //preparing some objects for connection 
     Statement stmt = null;    

     String userName = bean.getUSER_NAME();    
     String password = bean.getPASSWORD();   
    
     String searchQuery =
           "select * from uservalidation where USER_NAME='"
                    + userName
                    + "' AND PASSWORD='"
                    + password
                    + "'";
    
  // "System.out.println" prints in the console; Normally used to trace the process
  System.out.println("Your user name is " + userName);          
  System.out.println("Your password is " + password);
  System.out.println("Query: "+searchQuery);
    
  try 
  {
   
     Connection = DBConnectionUtil.getConnection();
     stmt=Connection.createStatement();
     rs = stmt.executeQuery(searchQuery);           
     boolean more = rs.next();
       
     // if user does not exist set the isValid variable to false
     if (!more) 
     {
        System.out.println("Sorry, you are not a registered user! Please sign up first");
        bean.setValid(false);
     } 
        
     //if user exists set the isValid variable to true
     else if (more) 
     {
      System.out.println("in elseif loop");
      String  username = rs.getString("USER_NAME");
        
        System.out.println("Welcome " + username);
        bean.setUSER_NAME(username);
        
        bean.setValid(true);
     }
  } 

  catch (Exception ex) 
  {
     System.out.println("Log In failed: An Exception has occurred! " + ex);
  } 
    
  //some exception handling
  finally 
  {
     if (rs != null)    {
        try {
           rs.close();
        } catch (Exception e) {}
           rs = null;
        }

     if (stmt != null) {
        try {
           stmt.close();
        } catch (Exception e) {}
           stmt = null;
        }

     if (Connection != null) {
        try {
           Connection.close();
        } catch (Exception e) {
        }

        Connection = null;
     }
  }

return bean;

  }


  public boolean reg(UserModel model) {
   
     System.out.println("inside the add method");
      Connection = DBConnectionUtil.getConnection();
  
      try (PreparedStatement preparedStatement = Connection.prepareStatement   ("insert into uservalidation(USER_ID,USER_NAME,PASSWORD )values(sequence_uservalidation.nextval,?,?)")) {
        
     
      System.out.println("inside the try block after query");
       
       
        preparedStatement.setString(1, model.getUSER_NAME());
        System.out.println(model.getUSER_NAME());
        preparedStatement.setString(2, model.getPASSWORD());
      System.out.println(model.getPASSWORD());
        int rowsUpdate = preparedStatement.executeUpdate();
        System.out.println(rowsUpdate);
        return rowsUpdate > 0 ? true : false;
      } catch (SQLException e) {
        logger.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
        e.printStackTrace();
      }
      return false;

    }


  public static UserModel admin(UserModel user) {
    Statement stmt = null;    

    String userName = "admin";    
    String password = "admin";   
   
    String searchQuery =
          "select * from ADMIN where USER_NAME='"
                   + userName
                   + "' AND PASSWORD='"
                   + password
                   + "'";
   
 // "System.out.println" prints in the console; Normally used to trace the process
 System.out.println("Your user name is " + userName);          
 System.out.println("Your password is " + password);
 System.out.println("Query: "+searchQuery);
   
 try 
 {
  
    Connection = DBConnectionUtil.getConnection();
    stmt=Connection.createStatement();
    rs = stmt.executeQuery(searchQuery);           
    boolean more = rs.next();
      
    // if user does not exist set the isValid variable to false
    if (!more) 
    {
       System.out.println("Sorry, you are not a registered user! Please sign up first");
       user.setValid(false);
    } 
       
    //if user exists set the isValid variable to true
    else if (more) 
    {
     System.out.println("in elseif loop");
     String  username = rs.getString("USER_NAME");
       
       System.out.println("Welcome " + username);
       user.setUSER_NAME(username);
       
       user.setValid(true);
    }
 } 

 catch (Exception ex) 
 {
    System.out.println("Log In failed: An Exception has occurred! " + ex);
 } 
   
 //some exception handling
 finally 
 {
    if (rs != null)    {
       try {
          rs.close();
       } catch (Exception e) {}
          rs = null;
       }

    if (stmt != null) {
       try {
          stmt.close();
       } catch (Exception e) {}
          stmt = null;
       }

    if (Connection != null) {
       try {
          Connection.close();
       } catch (Exception e) {
       }

       Connection = null;
    }
 }

return user;

 }

  } 

