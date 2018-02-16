package model;

public class ResultBean {
	
	private int studentID;
	private int profID;
	private int courseID;
	private String term;
	private String schoolYear;
	private String section;
	private int QID;
	private int rate;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int string) {
		this.studentID = string;
	}
	public int getProfID() {
		return profID;
	}
	public void setProfID(int profID) {
		this.profID = profID;
	}
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(String schoolYear) {
		this.schoolYear = schoolYear;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getQID() {
		return QID;
	}
	public void setQID(int qID) {
		QID = qID;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
}
