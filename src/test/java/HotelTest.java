import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Room room;
    private Room room2;
    private Room room3;
    private Guest guest;

    private Bedroom bedroom;

    @Before
    public void before() {
        room = new Room(RoomType.SINGLE);
        room2 = new Room(RoomType.DOUBLE);
        room3 = new Room(RoomType.TRIPLE);
        room = new Room(RoomType.FAMILY);


    }

    @Test
    public void familyHasValue(){
        assertEquals(4, room.getValueFromEnum());
    }

    @Test
    public void tripleHasValue(){
        assertEquals(3,room3.getValueFromEnum());
    }

    @Test
    public void doubleHasValue() {
        assertEquals(2,room2.getValueFromEnum());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(21, room2.getValueFromNumber());
    }

    @Test
    public void canAddNewGuest() {
        hotel.addNewGuest(guest);
        assertEquals(1, hotel.guestCount);
    }

//    @Test
//    public void hasRooms() {
//        assertEquals();
//    }

}
