public class Bedroom extends Room {

    private final int roomNumber;

    public Bedroom(String guests, int capacity, int roomNumber, String roomType) {
        super(guests, capacity, roomNumber);
        this.roomNumber = roomNumber;
        this.roomType = RoomType.valueOf(roomType);
    }



}
