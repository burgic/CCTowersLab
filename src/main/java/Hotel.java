import java.util.ArrayList;

public class Hotel {

    public int guestCount;
    private ArrayList<Bedroom> bedrooms;
    private int roomType;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private int capacity;
    private String hotel;
   // private

    public Hotel() {

        this.bedrooms = new ArrayList<Bedroom>();
        this.roomType = roomType;
        this.capacity = capacity;
        this.conferenceRooms = new ArrayList<ConferenceRoom>();

    }

    public int guestCount(){
        return hotel.size();
    }

    public void addNewGuest(Guest guest){
        if (guestCount() < capacity) {
            hotel.add(guest);
        }
    }

//    public int roomType() {
//        return
//    }

//    public void addNewGuest(Guest guest){
//        if (guestCount() < capacity) {
//            hotel.add(guest);
//        }
//    }

}
