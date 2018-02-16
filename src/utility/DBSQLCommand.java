package utility;


public interface DBSQLCommand {

	String INSERT_RESULT = "insert into "
		+ "result(SID, profID, courseID, "
		+ "term,schoolYear,section,QID,rate) "
		+ "values (?,?,?,?,?,?,?,?)";
	
	String SELECT_SCHEDULE = "select * from registration "
			+ "where status = 0 && SID = ";
	
	String SELECT_SCHEDULESTUD = "select * from registration "
			+ "where status = 0 && registrationID = ";
	
}
