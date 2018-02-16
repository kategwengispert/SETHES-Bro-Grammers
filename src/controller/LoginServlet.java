package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.DBConnection;
import utility.DBSQLOperation;
import model.ScheduleBean;

@WebServlet("/login.html")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		boolean logged = false;
		int UserName = Integer.parseInt(request.getParameter("userName"));
		String Password = request.getParameter("password");
		String name ="";
		
		System.out.println(UserName);
		System.out.println(Password);
		
		try{
			
			Connection con = DBConnection.getConnection(); 
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next()){
				if((UserName == rs.getInt("SID")) 
						&& Password.equals(rs.getString("password"))){
						logged = true;
						name = rs.getString("name");
						System.out.println("while" + UserName);
						System.out.println(Password);
						
				}else{
					logged = false;
				}
				if(logged == true){
					HttpSession session =  request.getSession();
					session.setAttribute("name", name);
					
					ScheduleBean sched = new ScheduleBean();
					
					sched.setSID(UserName);
					System.out.println("Set SID : " + sched.getSID() );
					
					ResultSet records =
							DBSQLOperation.getAllRecords(sched, con);
					
					request.setAttribute("records", records);
					
					request.getRequestDispatcher("studentprofile.jsp").forward(request, response);

					
					
					
				}else{
					response.sendRedirect("index.jsp");
					System.out.println("Error");
				}
			}
		}catch(Exception e){
			System.out.println("Error on login");
			
			
		}
		
	}
}
