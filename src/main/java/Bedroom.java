public class Bedroom extends Room {

    private final String roomNumber;

    public Bedroom(String guests, int capacity, String roomNumber, String roomType) {
        super(guests, capacity);
        this.roomNumber = roomNumber;
        this.roomType = RoomType.valueOf(roomType);
    }



}
