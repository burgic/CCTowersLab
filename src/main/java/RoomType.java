public enum RoomType {

    SINGLE(1, 20),
    DOUBLE(2, 21),
    TRIPLE(3, 22),
    FAMILY(4, 23);

    private final int value;
    private final int roomNumber;

    RoomType(int value, int roomNumber) {this.value = value;
        this.roomNumber = roomNumber;
    }

    public int getValue() {
        return this.value;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

}
