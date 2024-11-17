package net.mooctest;

public class ThreadLocalAStar {

    public static final ThreadLocal<AStar> local =
            new ThreadLocal<AStar>() {
                @Override
                protected AStar initialValue() {
                    return new AStar();
                }
            };

    public static AStar current() {
        return local.get();
    }
}
