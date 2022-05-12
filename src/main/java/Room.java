public class Room {

    private String guests;
    private int capacity;
    RoomType roomType;

    public Room(String guests, int capacity) {
        this.guests = guests;
        this.capacity = capacity;
    }

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
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

}


