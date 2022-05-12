public class Room {

    private int roomNumber;
    private String guests;
    private int capacity;
    RoomType roomType;

    public Room(String guests, int roomNumber, int capacity) {
        this.guests = guests;
        this.capacity = capacity;
        this.roomNumber = roomNumber;

    }

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
    }

    public int getValueFromNumber() {
        return this.roomType.getRoomNumber();
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

//    public int getValue() {
//    }
}


