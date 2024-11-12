package net.mooctest;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CommandHandlerTest {

    @Test
    public void summarizeFind() {
        CommandHandler commandHandler = new CommandHandler(new BJTree<String, Airport>());
        Airport airport = new Airport("1", "1", "1", "1", 1, 1);
        commandHandler.summarizeFind("find 1", "1", airport);
    }

    @Test
    public void summarizeGet() {
        CommandHandler commandHandler = new CommandHandler(new BJTree<String, Airport>());
        Airport airport = new Airport("1", "1", "1", "1", 1, 1);
        commandHandler.summarizeGet("find 1", airport);
    }

    @Test
    public void treeStructure() {
        CommandHandler commandHandler = new CommandHandler(new BJTree<String, Airport>());

        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(String.valueOf(i));
        }
        commandHandler.treeStructure(array);
    }

    @Test
    public void treeStructureHelper() {
    }
}