package net.mooctest;

public class RoomType {
    public static final String STANDARD = "Standard Room";
    public static final String ADVANCED = "Advanced Room";
    public static final String DELUXE = "Deluxe Room";

    public static boolean isRoomType(String type){
        if (!RoomType.STANDARD.equals(type) && !RoomType.ADVANCED.equals(type) && !RoomType.DELUXE.equals(type)){
            return false;
        }
        return true;
    }
}
