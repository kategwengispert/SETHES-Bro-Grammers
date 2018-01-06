package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.html")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		boolean logged = false;
		String UserName = request.getParameter("userName");
		String Password = request.getParameter("password");
		String name ="";
		
		System.out.println(UserName);
		System.out.println(Password);
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ivaluate-db", "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			
			while(rs.next()){
				if(UserName.equals(rs.getString("userID")) 
						&& Password.equals(rs.getString("password"))){
						logged = true;
						name = rs.getString("name");
						System.out.println("while" + UserName);
						System.out.println(Password);
						
				}else{
					logged = false;
				}
			}
		}catch(Exception e){
			System.out.println("error on login");
			
		}
		
		if(logged == true){
			HttpSession session =  request.getSession();
			session.setAttribute("name", name);
			response.sendRedirect("studentprofile.jsp");
			
		}else{
			response.sendRedirect("index.jsp");
			System.out.println("Error");
		}
	}

	

}
