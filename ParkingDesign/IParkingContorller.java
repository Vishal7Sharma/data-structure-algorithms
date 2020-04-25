package design.ParkingDesign;

public interface IParkingContorller {
	
	public void enter(int vehicleId);
	public void exit(int vehicleId);
	public int getCharges(int vehicleId);
	public boolean isFull();
	public void getParkingLocation();

}
