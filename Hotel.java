package HotelDatabase;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private List<Room> rooms;

    public Hotel(int regularRooms, int deluxeRooms, int juniorSuites) {
        rooms = new ArrayList<>();
        int roomNumber = 1;
        for (int i = 0; i < regularRooms; i++) {
            rooms.add(new Room(roomNumber++, 200));
        }
        for (int i = 0; i < deluxeRooms; i++) {
            rooms.add(new Room(roomNumber++, 300));
        }
        for (int i = 0; i < juniorSuites; i++) {
            rooms.add(new Room(roomNumber++, 350));
        }
    }

    public Room makeReservation(String roomType, String arrivalDate, String departureDate) {
        for (Room room : rooms) {
            if (room.getPricePerNight() == 200 && roomType.equals("Regular Room") && room.isAvailable()) {
                room.setAvailable(false);
                return room;
            } else if (room.getPricePerNight() == 300 && roomType.equals("Deluxe Room") && room.isAvailable()) {
                room.setAvailable(false);
                return room;
            } else if (room.getPricePerNight() == 350 && roomType.equals("Junior Suite") && room.isAvailable()) {
                room.setAvailable(false);
                return room;
            }
        }
        return null; // Indicates no room available
    }
}
