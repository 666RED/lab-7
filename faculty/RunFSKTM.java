package faculty;

public class RunFSKTM {

	public static void main(String[] args) {
		FSKTM faculty1 = new FSKTM();
		faculty1.setAddress("Parit Raja");
		faculty1.setNumberOfDepartment(3);
		faculty1.setOpenCloseHour(8, 5);
		
		System.out.println("We are located in " +
		faculty1.getAddress() + ". Currently we have " + 
		faculty1.getNumberOfDeaprtment() + " departments. We operates on Sunday to Thurday from  " + 
		faculty1.getOpenHour() + "AM to " + 
		faculty1.getCloseHour() + "PM.");

	}

}
