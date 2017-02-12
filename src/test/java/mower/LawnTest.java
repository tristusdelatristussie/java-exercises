package mower;


import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class LawnTest {

    @Test
    public void lawn_create() {
        //set
        Lawn lawn = new Lawn();
        ArrayList<String> commands = new ArrayList<>();
        commands.add("55");
        commands.add("12N");
        //test
        Lawn result = lawn.from(commands);
        //assert
        Mower mowerExpected = new Mower(1, 2, Direction.NORTH);
        Lawn lawnExpected = new Lawn(5, 5, mowerExpected);
        assertEquals(lawnExpected, result);
    }
}
