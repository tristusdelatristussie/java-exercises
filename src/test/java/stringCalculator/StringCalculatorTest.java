package stringCalculator;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void add_with_emtpy_number() {
        //set
        //test
        int result = stringCalculator.add("");
        //assert
        assertEquals(0, result);
    }

    @Test
    public void add_with_one_number() {
        //set
        //test
        int result = stringCalculator.add("1");
        //assert
        assertEquals(1, result);
    }

    @Test
    public void add_with_two_number() {
        //set
        //test
        int result = stringCalculator.add("1,2");
        //assert
        assertEquals(3, result);
    }

    @Test
    public void add_with_more_number() {
        //set
        //test
        int result = stringCalculator.add("1,2,3");
        //assert
        assertEquals(6, result);
    }

    @Test
    public void add_with_number_and_n() {
        //set
        //test
        int result = stringCalculator.add("1\n2,3");
        //assert
        assertEquals(6, result);
    }

    @Test
    public void add_with_number_and_n_error() {
        //set
        //test
        int result = stringCalculator.add("1,\n");
        //assert
        assertEquals(0, result);
    }

    @Test
    public void add_with_different_separator() {
        //set
        //test
        int result = stringCalculator.add("[;]1;2");
        //assert
        assertEquals(3, result);
    }

    @Test(expected = ArithmeticException.class)
    public void add_with_minus_number(){
        //set
        //test
        stringCalculator.add("1,-2");
        //assert
    }
}
