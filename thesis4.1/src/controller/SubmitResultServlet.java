package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.DBSQLOperation;
import utility.DBConnection;
import model.ResultBean;

@WebServlet("/submitSurvey.html")
public class SubmitResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = null;
	
	
	public void init() throws ServletException {
		connection = DBConnection.getConnection();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{

			int count;
			
			ResultBean rb = new ResultBean();
			
			// get rate from each question
		int q1 =Integer.parseInt(request.getParameter("group1")) ;
		int q2 = Integer.parseInt(request.getParameter("group2")) ;
		int q3 = Integer.parseInt(request.getParameter("group3")) ;
		int q4 = Integer.parseInt(request.getParameter("group4")) ;
		int q5 = Integer.parseInt(request.getParameter("group5")) ;
		int q6 = Integer.parseInt(request.getParameter("group6")) ;
		int q7 = Integer.parseInt(request.getParameter("group7")) ;
		int q8 = Integer.parseInt(request.getParameter("group8")) ;
		int q9 = Integer.parseInt(request.getParameter("group9")) ;
		int q10 = Integer.parseInt(request.getParameter("group10")) ;
		int q11 = Integer.parseInt(request.getParameter("group11")) ;
		int q12 = Integer.parseInt(request.getParameter("group12")) ;
		int q13 = Integer.parseInt(request.getParameter("group13")) ;
		int q14 = Integer.parseInt(request.getParameter("group14")) ;
		int q15 = Integer.parseInt(request.getParameter("group15")) ;
		int q16 = Integer.parseInt(request.getParameter("group16")) ;
		int q17 = Integer.parseInt(request.getParameter("group17")) ;
		int q18 = Integer.parseInt(request.getParameter("group18")) ;
		int q19 = Integer.parseInt(request.getParameter("group19")) ;
		int q20 = Integer.parseInt(request.getParameter("group20")) ;
		int q21 = Integer.parseInt(request.getParameter("group21")) ;
		int q22 = Integer.parseInt(request.getParameter("group22")) ;
		int q23 = Integer.parseInt(request.getParameter("group23")) ;
		int q24 = Integer.parseInt(request.getParameter("group24")) ;
		int q25 = Integer.parseInt(request.getParameter("group25")) ;
		int q26 = Integer.parseInt(request.getParameter("group26")) ;
		int q27 = Integer.parseInt(request.getParameter("group27")) ;
		int q28 = Integer.parseInt(request.getParameter("group28")) ;
		int q29 = Integer.parseInt(request.getParameter("group29")) ;
		int q30 = Integer.parseInt(request.getParameter("group30")) ;
		int q31 = Integer.parseInt(request.getParameter("group31")) ;
		
		System.out.println(q1);
		for(count=1; count<=31;count++ ){
			rb.setStudentID(111);
			rb.setProfID(211);
			rb.setCourseCode("SE");
			rb.setTerm("2nd");
			rb.setSchoolYear("2017-2018");
			rb.setSection("SE31");
			rb.setQID(count);
			
			
			switch (count){
			
			case 1 : 
				rb.setRate(q1);
				break;
			case 2 :
				rb.setRate(q2);
				break;
			case 3 :
				rb.setRate(q3);
				break;
			case 4 :
				rb.setRate(q4);
				break;
			case 5 :
				rb.setRate(q5);
				break;
			case 6 :
				rb.setRate(q6);
				break;
			case 7 :
				rb.setRate(q7);
				break;
			case 8 :
				rb.setRate(q8);
				break;
			case 9 :
				rb.setRate(q9);
				break;
			case 10 :
				rb.setRate(q10);
				break;
			case 11 :
				rb.setRate(q11);
				break;
			case 12 :
				rb.setRate(q12);
				break;
			case 13 :
				rb.setRate(q13);
				break;
			case 14 :
				rb.setRate(q14);
				break;
			case 15 :
				rb.setRate(q15);
				break;
			case 16 :
				rb.setRate(q16);
				break;
			case 17 :
				rb.setRate(q17);
				break;
			case 18 :
				rb.setRate(q18);
				break;
			case 19 :
				rb.setRate(q19);
				break;
			case 20 :
				rb.setRate(q20);
				break;
			case 21 :
				rb.setRate(q21);
				break;
			case 22 :
				rb.setRate(q22);
				break;
			case 23 :
				rb.setRate(q23);
				break;
			case 24 :
				rb.setRate(q24);
				break;
			case 25 :
				rb.setRate(q25);
				break;
			case 26 :
				rb.setRate(q26);
				break;
			case 27 :
				rb.setRate(q27);
				break;
			case 28 :
				rb.setRate(q28);
				break;
			case 29 :
				rb.setRate(q29);
				break;
			case 30 :
				rb.setRate(q30);
				break;
			case 31 :
				rb.setRate(q31);
				break;
			
			}
			
			DBSQLOperation.insertResult(rb, connection);
			
		}
		
		}catch(NumberFormatException nfe){
			nfe.getStackTrace();
			request.getRequestDispatcher("errorindex.jsp").forward(request, response);
		}catch (Exception e) {
			request.getRequestDispatcher("errorindex.jsp").forward(request, response);
			// TODO: handle exception
		}
		
	}
	

}
