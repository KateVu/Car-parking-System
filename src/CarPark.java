/**
 * CarPark object to maintain a list of parking slots
 * @author Quyen Vu Thi Tu SID 102418320
 * version 0.1
 */

import java.util.*;


public class CarPark {
	protected ArrayList<ParkingSlot> list = new ArrayList<ParkingSlot>();//list of parking slot
	
	/**
	 * get a parking slot by its identifier
	 * @param slotID
	 * @return
	 */
	public ParkingSlot getParkSlot (String slotID) {
		int size = this.list.size();
		for (int i = 0; i < size ; i++) {
			if (this.list.get(i).getSlotId() == slotID) {
				return this.list.get(i);
			}
		}
	}
}
