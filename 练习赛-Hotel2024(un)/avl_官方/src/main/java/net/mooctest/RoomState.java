package net.mooctest;

/**
 * @comment 房间状态接口，定义
 */
public interface RoomState {

    void book(Room room);

    void unsubscribe(Room room);

    void checkIn(Room room);

    void checkOut(Room room);

}
