package design.ParkingDesign;

public interface IParkingController {
	
	public void enter(int vehicleId, int parkingLotId);
	public void exit(int vehicleId);
	public int getCharges(int vehicleId);
	public boolean isFull();
	public void getParkingLocation();
}
