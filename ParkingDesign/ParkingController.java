package design.ParkingDesign;


public class ParkingController implements IParkingContorller{

	@Override
	public void enter(int vehicleId) {
		System.out.println("Vehicle " + vehicleId + "is entering");
	}

	@Override
	public void exit(int vehicleId) {
		System.out.println("Vechile " + vehicleId + " is exiting");
	}

	@Override
	public int getCharges(int vehicleId) {
		String string = "Hi I'm an string";
		System.out.println(string);
		return 0;
	}

	@Override
	public boolean isFull() {
		//if parking is full do not allow the vehicle to enter
		return false;
	}

	@Override
	public void getParkingLocation() {
		// TODO Auto-generated method stub
		
	}

}
