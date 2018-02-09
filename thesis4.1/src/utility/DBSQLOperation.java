package utility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.ResultBean;
import model.ScheduleBean;
public class DBSQLOperation implements DBSQLCommand{

	public static boolean insertResult(ResultBean rb, Connection connection) {

		boolean isSuccessful = false;

		if (connection != null) {
			try {
				PreparedStatement pstmnt = 
					connection.prepareStatement(INSERT_RESULT);
				
				pstmnt.setInt(1, rb.getStudentID());
				pstmnt.setInt(2, rb.getProfID());
				pstmnt.setString(3, rb.getCourseCode());
				System.out.println(rb.getCourseCode());
				pstmnt.setString(4, rb.getTerm());
				pstmnt.setString(5, rb.getSchoolYear());
				pstmnt.setString(6, rb.getSection());
				pstmnt.setInt(7, rb.getQID());
				pstmnt.setInt(8, rb.getRate());
				
				
				pstmnt.executeUpdate();
				isSuccessful = true;
				System.out.println("Result Submitted");
				
			} catch (SQLException sqle) {
				System.err.println(sqle.getMessage());
			}
		}
		return isSuccessful;
	}
	
/**	public static void selectSchedule(ScheduleBean schedBean, Connection connection){
		ResultSet records = null;

		String SELECT_SCHED = SELECT_SCHEDULE + schedBean.getStudentID();
		
		if (connection != null) {
			try {
				PreparedStatement pstmnt = 
					connection.prepareStatement(SELECT_SCHED);
			
				ResultSet rs = pstmnt.executeQuery();
				
				ScheduleBean sb = null;
				while(rs.next()){
					sb = new ScheduleBean();
					//sched.setName(rs.getString("SID"));
					sb.setSubject(rs.getString("courseName"));
					sb.setProfessor(rs.getString("professorName"));
					sb.setTime(rs.getString("courseTime"));
					
					v.add(sb);

					System.out.println(sb);
				}

			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
				
			}
			

			
		}  else {
			System.err.println("insertRecord(): connection is null.");
		}
		return v;		
		
		
	}
	*/
	public static ResultSet getAllRecords(ScheduleBean schedBean, Connection connection){
		ResultSet records = null;
		
		String SELECT_SCHED = SELECT_SCHEDULE + schedBean.getStudentID();
		 if(connection !=null){
			 try{
				
				 
				 PreparedStatement pstmnt = connection.prepareStatement(SELECT_SCHED);
				 
				 
				records = pstmnt.executeQuery();
			 }catch(SQLException sqle){
				 throw new RuntimeException();
			 }
		 }
		 return records;
	}
	public static ResultSet options1(Connection connection){
		ResultSet records = null;
		
		String SELECT_SCHED = CHECK_RECORDS;
		 if(connection !=null){
			 try{
				
				 
				 PreparedStatement pstmnt = connection.prepareStatement(SELECT_SCHED);
				 
				 
				records = pstmnt.executeQuery();
			 }catch(SQLException sqle){
				 throw new RuntimeException();
			 }
		 }
		 return records;
	}
	
	public static ResultSet options2(Connection connection){
		ResultSet records = null;
		
		String SELECT_SCHED = CHECK_PROFESSOR;
		 if(connection !=null){
			 try{
				
				 
				 PreparedStatement pstmnt = connection.prepareStatement(SELECT_SCHED);
				 
				 
				records = pstmnt.executeQuery();
			 }catch(SQLException sqle){
				 throw new RuntimeException();
			 }
		 }
		 return records;
	}
	public static ResultSet options3(Connection connection){
		ResultSet records = null;
		
		String SELECT_SCHED = CHECK_CLASS;
		 if(connection !=null){
			 try{
				
				 
				 PreparedStatement pstmnt = connection.prepareStatement(SELECT_SCHED);
				 
				 
				records = pstmnt.executeQuery();
			 }catch(SQLException sqle){
				 throw new RuntimeException();
			 }
		 }
		 return records;
	}
}
