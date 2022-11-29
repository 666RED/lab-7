package faculty;

public class FSKTM {
	String address;
	int numberOfDepartment;
	int openHour;
	int closeHour;
	
	public FSKTM() {
		System.out.println("Welcome to FSKTM!");
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setNumberOfDepartment(int numberOfDepartment) {
		this.numberOfDepartment = numberOfDepartment;
	}
	
	public void setOpenCloseHour(int openHour, int closeHour) {
		this.openHour = openHour;
		this.closeHour = closeHour;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getNumberOfDeaprtment() {
		return numberOfDepartment;
	}
	
	public int getOpenHour() {
		return openHour;
	}
	
	public int getCloseHour() {
		return closeHour;
	}
}
