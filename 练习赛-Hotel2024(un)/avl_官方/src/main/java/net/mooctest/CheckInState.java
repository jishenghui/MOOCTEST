package net.mooctest;

public class CheckInState implements RoomState {

    String sep = System.getProperty("line.separator");

    public void book(Room room) {
        throw new IllegalStateException("Cannot book under current state, "+this.toString());
    }

    public void unsubscribe(Room room) {
        throw new IllegalStateException("Cannot unsubscribe under current state, "+this.toString());
    }

    public void checkIn(Room room) {
        throw new IllegalStateException("Cannot check in under current state, "+this.toString());
    }

    public void checkOut(Room room) {
        System.out.print("Operation: Check Out" + sep
                + "Room: " + room.getRoomCode() +sep
                +"Result: Success" + sep);
        room.setState(new FreeTimeState());
    }

    @Override
    public String toString() {
        return "RoomState: CheckIn";
    }
}
