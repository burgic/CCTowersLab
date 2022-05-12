public class ConferenceRoom extends Room {


    private final String name;
    private final String beveragesAvailable;

    public ConferenceRoom(String guests, int capacity, String name, String beveragesAvailable) {
        super(guests, capacity);
        this.name = name;
        this.beveragesAvailable = beveragesAvailable;
    }
}
