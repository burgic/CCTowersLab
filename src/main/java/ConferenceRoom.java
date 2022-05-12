public class ConferenceRoom extends Room {


    private final String name;
//    private final String beveragesAvailable;
    private final int roomNumber;

    public ConferenceRoom(String guests, int capacity, String name, int roomNumber) {
        super(guests, capacity, roomNumber);
        this.name = name;
        this.roomNumber = roomNumber;
    }
}
