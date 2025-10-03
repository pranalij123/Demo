package Oops.Encapsulation;

public class Teacher {
	private String name;
	private long conNo;
	private String email;
	private double sal;
	private String joinningDate;
	private String subject;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getConNo() {
		return conNo;
	}

	public void setConNo(long conNo) {
		this.conNo = conNo;
	}

	public String getEmail() {
		return email;
	}

	public Teacher(String name, long conNo, String email, double sal, String joinningDate ,String subject) {
		super();
		this.name = name;
		this.conNo = conNo;
		this.email = email;
		this.sal = sal;
		this.joinningDate = joinningDate;
		this.subject=subject;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getJoinningDate() {
		return joinningDate;
	}

	public void setJoinningDate(String joinningDate) {
		this.joinningDate = joinningDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
