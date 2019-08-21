/**
 * ParkingSlot class with fields for identifier, car
 * @author Quyen Vu THi TU SID 102418320
 * version 0.1 last updated date
 */
public class ParkingSlot {
	private String identifier;//identifier of the parking slot
	private Car car; //car is parking
	
	//constructor with parking spot identifier
	protected ParkingSlot(String iniIdentifier) {
		this.identifier = iniIdentifier;
	}
	
	/**
	 * check if the spot is free
	 * @return true if free
	 */
	public boolean isFree() {
		return (this.car != null);
	}
	
	//get Identifier of the slot
	public String getSlotId() {
		return this.identifier;
	}
	
	//get current car in the spot
	public Car getCar() {
		return this.car;
	}
	
	public boolean isStaffSlot() {
		return this.getCar().getIsStaffMember();
	}
	
	/**
	 * park a car into a slot
	 * @param information of the car
	 * 
	 */
	public void parkCar(String iniRegisNumber, String iniOwner, boolean iniIsStaffMember) {
		Car car = new Car(iniRegisNumber, iniOwner, iniIsStaffMember);
		this.car = car;
	}

}
