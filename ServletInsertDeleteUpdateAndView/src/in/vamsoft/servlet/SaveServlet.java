package in.vamsoft.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.dao.EmpDao;
import in.vamsoft.model.Emp;
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println("SAVE"+id);
		String name=request.getParameter("name");
		System.out.println("SAVE"+name);
		String password=request.getParameter("password");
		System.out.println("SAVE"+password);
		String email=request.getParameter("email");
		System.out.println("SAVE"+email);
		String country=request.getParameter("country");
		System.out.println("SAVE"+country);
		Emp e=new Emp();
		e.setId(id);
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setCountry(country);
			
		boolean status=EmpDao.save(e);
		if(status=true){
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		}else{
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

}
