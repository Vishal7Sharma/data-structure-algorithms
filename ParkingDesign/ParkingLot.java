package design.ParkingDesign;

public class ParkingLot {

	private int parkingRows;
	private int parkingColumns;
	boolean[][] lot;
	
	public ParkingLot(int parkingRows, int parkingColumns) {
		this.parkingColumns = parkingColumns;
		this.parkingRows = parkingRows;
		this.lot = new boolean[parkingRows][parkingColumns];
	}
	
	void fillSpot(int rowId, int columnId) {
		
	}
	
	void emptySpot(int rowId, int columnId) {
		System.out.println("Hi this is awesome");
		
	}
	
	int getEmptySpot() {
		for(int i=0; i<parkingRows; i++) {
			for(int j=0;j<parkingColumns; j++) {
				if(lot[i][j]==false) {
					return i+j;
				}
			}
		}
		return 0;
	}
}
