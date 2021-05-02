
public class Student extends User {
	String stdNumber;
	
	public Student() {
		
	}

	public Student(String stdNumber) {
		super();
		this.stdNumber = stdNumber;
	}

	public String getStdNumber() {
		return stdNumber;
	}

	public void setStdNumber(String stdNumber) {
		this.stdNumber = stdNumber;
	}
}
