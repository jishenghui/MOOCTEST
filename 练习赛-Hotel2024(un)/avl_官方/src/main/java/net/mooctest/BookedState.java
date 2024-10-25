package net.mooctest;

public class BookedState implements RoomState {

    String sep = System.getProperty("line.separator");

    public void book(Room room) {
        throw new IllegalStateException("Cannot book under current state, " + this.toString());
    }

    public void unsubscribe(Room room) {
        System.out.print("Operation: Unsubscribe" + sep
                + "Room: " + room.getRoomCode() +sep
                +"Result: Success" + sep);
        room.setState(new FreeTimeState());
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
        return "RoomState: Booked";
    }
}
