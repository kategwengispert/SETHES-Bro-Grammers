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
		String UserName = request.getParameter("userName");
		String Password = request.getParameter("password");
		String name ="";
		String url="";
		System.out.println(UserName);
		System.out.println(Password);
		
		if(Character.isDigit(UserName.charAt(0))){
			url = "studentprofile.jsp";
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ivaluate-db", "root", "");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from student where SID="+UserName);
				
				while(rs.next()){
					System.out.println(rs.getString("SID"));
					if(UserName.equals(rs.getString("SID")) 
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
						
						sched.setStudentID(UserName);
						System.out.println("Set SID : " + sched.getStudentID() );
						
						ResultSet records =
								DBSQLOperation.getAllRecords(sched, con);
						
						request.setAttribute("records", records);
						
						request.getRequestDispatcher(url).forward(request, response);

						
						
						
					}else{
						response.sendRedirect("index.jsp");
						System.out.println("Error");
					}
				}
			}catch(Exception e){
				System.out.println("error on login");
		}
		
			
			
		}
		if (!Character.isDigit(UserName.charAt(0))){
			url = "encoderprofile.jsp";
			System.out.println(UserName.charAt(0));
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ivaluate-db", "root", "");
				Statement stmt = con.createStatement();
				ResultSet rs1 = stmt.executeQuery("select * from admin where name="+UserName);
				
				while(rs1.next()){
					System.out.println(rs1.getString("name"));
					if(UserName.equals(rs1.getString("name")) 
							&& Password.equals(rs1.getString("password"))){
							logged = true;
							name = rs1.getString("name");
							System.out.println("while" + UserName);
							System.out.println(Password);
							
					}else{
						logged = false;
					}
					if(logged == true){
						HttpSession session =  request.getSession();
						session.setAttribute("name", name);
						request.getRequestDispatcher("encoderprofile.jsp");
						}else{
						response.sendRedirect("index.jsp");
						System.out.println("Error");
					}
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}
}
