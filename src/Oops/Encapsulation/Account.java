package Oops.Encapsulation;

public class Account {
	private String name;
	private long actNo;
	private String actType;
	private double balance;
    private String branchName;
    private String ifscCode;
    private String contactNumber;
    private String email;
	
	
	
	public Account(String name, long actNo, String actType, double balance, String branchName, String ifscCode,
			String contactNumber, String email) {
		super();
		this.name = name;
		this.actNo = actNo;
		this.actType = actType;
		this.balance = balance;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public long getActNo() {
		return actNo;
	}

	public String getActType() {
		return actType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setActNo(long actNo) {
		this.actNo = actNo;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
