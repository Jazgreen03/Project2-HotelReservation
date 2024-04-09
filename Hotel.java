
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
        	System.out.print(room.isAvailable());
        	System.out.print(matchesRoomType(room, roomType));
            // Check if the room type matches and the room is available
            if (room.isAvailable()) {
                // Mark the room as unavailable
                room.setAvailable(false);
                return room;
            }
        }
        return null; // Indicates no room available
    }

    private boolean matchesRoomType(Room room, String roomType) {
        // Implement logic to match room type with room object
        // This could involve checking the room's price per night or another identifier
        // For example:
        if (room instanceof RegularRoom && roomType.equals("Regular Room")) {
            return true;
        } else if (room instanceof DeluxeRoom && roomType.equals("Deluxe Room")) {
            return true;
        } else if (room instanceof JuniorSuite && roomType.equals("Junior Suite")) {
            return true;
        }
        return false;
    }

}
