package utility;

import model.ScheduleBean;

public interface DBSQLCommand {

	String INSERT_RESULT = "insert into "
		+ "result(SID, profID, courseCode, "
		+ "term,schoolYear,section,QID,rate) "
		+ "values (?,?,?,?,?,?,?,?)";
	
	String SELECT_SCHEDULE = "select courseName, "
			+ "professorName, courseTime, SID from registration "
			+ "where SID = ";
	
	String CHECK_RECORDS ="select name, "
			+ "SID from student";
	
	String CHECK_PROFESSOR ="select profName,"
			+ "PID from professor";
	
	String CHECK_CLASS  ="select courseName,"
			+ "section from registration";
}
