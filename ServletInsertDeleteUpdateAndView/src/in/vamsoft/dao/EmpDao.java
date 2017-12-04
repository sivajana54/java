package in.vamsoft.dao;
import java.util.*;

import in.vamsoft.dbutil.DBConnectionUtil;
import in.vamsoft.model.Emp;

import java.sql.*;

public class EmpDao {

	public static Connection getConnection(){
		
		Connection connection = null ;
		try{
			
		  connection = DBConnectionUtil.getConnection();
		}catch(Exception e){System.out.println(e);}
		return connection;
	}
	public static boolean save(Emp e){
		
		try{
			Connection connection=EmpDao.getConnection();
			PreparedStatement ps=connection.prepareStatement("insert into usersiva(id,name,password,email,country) values (?,?,?,?,?)");
			ps.setInt(1,e.getId());		
			ps.setString(2,e.getName());		
			ps.setString(3,e.getPassword());	
			ps.setString(4,e.getEmail());	
			ps.setString(5,e.getCountry());
			
			int rowsUpdate = ps.executeUpdate();
            return rowsUpdate > 0 ? true : false;
          } catch (SQLException e1) {
           System.out.println("ERROR WHILE ESTABLISHING THE CONNECTION");
            
          }
    return false;
		    
		   
	}
	public static boolean update(Emp e){
		
		try{
			
		  Connection connection=EmpDao.getConnection();
			PreparedStatement ps=connection.prepareStatement("update usersiva set name=?,password=?,email=?,country=? where id=?");
			ps.setString(1,e.getName());
			System.out.println(e.getName());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCountry());
			ps.setInt(5,e.getId());
			
			int rowsUpdate = ps.executeUpdate();
            return rowsUpdate > 0 ? true : false;
          } catch (SQLException e1) {
           System.out.println("ERROR WHILE ESTABLISHING THE CONNECTION");
            
          }
    return false;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection connection=EmpDao.getConnection();
			PreparedStatement ps=connection.prepareStatement("delete from usersiva where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			connection.close();
		}catch(Exception e){e.printStackTrace();}
		
		return status;
	}
	public static Emp getEmployeeById(int id){
		Emp e=new Emp();
		
		try{
			Connection connection=EmpDao.getConnection();
			PreparedStatement ps=connection.prepareStatement("select * from usersiva where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
			}
			connection.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return e;
	}
	public static List<Emp> getAllEmployees(){
		List<Emp> list=new ArrayList<Emp>();
		
		try{
			Connection connection=EmpDao.getConnection();
			PreparedStatement ps=connection.prepareStatement("select * from usersiva");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				list.add(e);
			}
			connection.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
