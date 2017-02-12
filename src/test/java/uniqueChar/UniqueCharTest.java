package uniqueChar;


import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class UniqueCharTest {


    @Test
    public void isUniqueChar_with_ascii_string_empty() {
        //set
        UniqueChar uniqueChar = new UniqueChar();
        String empty = "";
        //test
        boolean result = uniqueChar.isUniqueChar(empty);
        //assert
        assertFalse(result);
    }

    @Test
    public void isUniqueChar_without_ascii_string() {
        //set
        UniqueChar uniqueChar = new UniqueChar();
        //test
        boolean result = uniqueChar.isUniqueChar(null);
        //assert
        assertFalse(result);
    }

    @Test
    public void isUniqueChar_with_ascii_string() {
        //set
        String text = "abcdef";
        UniqueChar uniqueChar = new UniqueChar();
        //test
        boolean result = uniqueChar.isUniqueChar(text);
        //assert
        assertTrue(result);
    }

    @Test
    public void isUniqueChar_with_ascii_string_ko() {
        //set
        String text = "abcdefe";
        UniqueChar uniqueChar = new UniqueChar();
        //test
        boolean result = uniqueChar.isUniqueChar(text);
        //assert
        assertFalse(result);
    }



}
