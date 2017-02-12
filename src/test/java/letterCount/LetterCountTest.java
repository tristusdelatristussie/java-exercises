package letterCount;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LetterCountTest {

    @Test
    public void letterCount_without_repetition() {
        //set
        String str = "abcd";
        LetterCount letterCount = new LetterCount();
        //test
        String result = letterCount.apply(str);
        //assert
        assertEquals("a1b1c1d1",result);
    }

    @Test
    public void letterCount_with_repetition() {
        //set
        String str = "aabcccccaaa";
        LetterCount letterCount = new LetterCount();
        //test
        String result = letterCount.apply(str);
        //assert
        assertEquals("a5b1c5",result);
    }
}
