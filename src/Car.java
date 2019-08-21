/**
 * 
 * @author Quyen Vu Thi Tu <SID102418320>
 * version 0.1 last updated day 
 */


public class Car {
	private String regisNumber;//registration number of the car
	private String owner; //Name of the owner of the car
	private boolean isStaffMember;//give true if car belonged to a staff member
	
	//Constructor with registration number, name of owner and know whether owner is staffmember
	public Car(String iniRegisNumber, String iniOwner, boolean iniIsStaffMember) {
		this.regisNumber = iniRegisNumber;
		this.owner = iniOwner;
		this.isStaffMember = iniIsStaffMember;
	}
	
	//get onwer name of the car
	public String getOwner () {
		return this.owner;
	}
	
	//get registration number of the car
	public String getRegisNumber() {
		return this.regisNumber;
	}
	
	public boolean getIsStaffMember() {
		return this.isStaffMember;
	}
	
	public String toString() {
		if (this.isStaffMember) {
			return ("Owner: " + this.owner + "; Registration number: " + this.regisNumber + "; Staff member");
		} else {
			return ("Owner: " + this.owner + "; Registration number: " + this.regisNumber + "; Not staff member");
		}
	}
}
