package mower;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class MowerTest {

    @Test
    public void mower_forward() {
        //set
        int x = 0;
        int y = 0;
        Direction north = Direction.NORTH;
        Mower mower = new Mower(x, y, north);
        //test
        Mower result = mower.forward();
        //assert
        assertEquals(0, result.getX());
        assertEquals(1, result.getY());
        assertEquals(Direction.NORTH, result.getDirection());
    }

    @Test
    public void mower_onTheLeft() {
        //set
        int x = 0;
        int y = 0;
        Direction north = Direction.NORTH;
        Mower mower = new Mower(x, y, north);
        //test
        Mower result = mower.onLeft();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.WEST, result.getDirection());
    }

    @Test
    public void mower_onTheRight() {
        //set
        int x = 0;
        int y = 0;
        Direction north = Direction.NORTH;
        Mower mower = new Mower(x, y, north);
        //test
        Mower result = mower.onRight();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.EAST, result.getDirection());
    }


    @Test
    public void isOnLawn_with_good_mower() {
        //set
        Mower mower = new Mower(0, 0, Direction.EAST);
        Lawn lawn = new Lawn(5, 5, mower);
        //test
        boolean response = mower.isOnLawn(lawn);
        //assert
        assertTrue(response);
    }

    @Test
    public void isOnLawn_with_mower_x_out_minus() {
        //set
        Mower mower = new Mower(-1, 0, Direction.EAST);
        Lawn lawn = new Lawn(5, 5, mower);
        //test
        boolean response = mower.isOnLawn(lawn);
        //assert
        assertFalse(response);
    }

    @Test
    public void isOnLawn_with_mower_x_out() {
        //set
        Mower mower = new Mower(6, 0, Direction.EAST);
        Lawn lawn = new Lawn(5, 5, mower);
        //test
        boolean response = mower.isOnLawn(lawn);
        //assert
        assertFalse(response);
    }

    @Test
    public void isOnLawn_with_mower_y_out_minus() {
        //set
        Mower mower = new Mower(0, -1, Direction.EAST);
        Lawn lawn = new Lawn(5, 5, mower);
        //test
        boolean response = mower.isOnLawn(lawn);
        //assert
        assertFalse(response);
    }

    @Test
    public void isOnLawn_with_mower_y_out() {
        //set
        Mower mower = new Mower(0, 7, Direction.EAST);
        Lawn lawn = new Lawn(5, 5, mower);
        //test
        boolean response = mower.isOnLawn(lawn);
        //assert
        assertFalse(response);
    }

}
