package HotelDatabase;

public class Room {
	private int roomNumber;
	private double pricePerNight;
	
	public Room(int roomNumber, double pricePerNight) {
		this.roomNumber = roomNumber;
		this.pricePerNight = pricePerNight;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public double getPricePerNight() {
		return pricePerNight;
	}
	
	// method to calculate the total charge based on the number of nights, The nightly rate
	public double calculateTotalCharge(int numberOfNights) {
		return pricePerNight * numberOfNights;
	}

}

