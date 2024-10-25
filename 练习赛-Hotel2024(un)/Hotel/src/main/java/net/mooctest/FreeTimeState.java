package net.mooctest;

public class FreeTimeState implements RoomState {
    String sep = System.getProperty("line.separator");

    public void book(Room room) {
        System.out.print("Operation: Book Room" + sep
                + "Room: " + room.getRoomCode() +sep
                +"Result: Success" + sep);
        room.setState(new BookedState());
    }
    public void unsubscribe(Room room) {
        throw new IllegalStateException("Cannot unsubscribe under current state, "+this.toString());
    }

    public void checkIn(Room room) {
        System.out.print("Operation: Check In" + sep
                + "Room: " + room.getRoomCode() +sep
                +"Result: Success" + sep);
        room.setState(new CheckInState());
    }

    public void checkOut(Room room) {
        throw new IllegalStateException("Cannot check out under current state, " + this.toString());
    }

    @Override
    public String toString() {
        return "RoomState: Free";
    }
}
