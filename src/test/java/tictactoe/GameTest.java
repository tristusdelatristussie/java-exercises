package tictactoe;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GameTest {
    Game game;

    @Test
    public void testDefaultMove() {
        game = new Game("XOXOX-OXO");
        assertEquals(5, game.move('X'));

        game = new Game("XOXOXOOX-");
        assertEquals(8, game.move('O'));

        game = new Game("---------");
        assertEquals(0, game.move('X'));

        game = new Game("XXXXXXXXX");
        assertEquals(-1, game.move('X'));
    }

    @Test
    public void testFindWinningMove() {
        game = new Game("XO-XX-OOX");
        assertEquals(5, game.move('X'));
    }

    @Test
    public void
    winnner_should_win_with_all_X_on_second_line() {
        game = new Game("-0-XXX--0");
        assertEquals('X', game.winner());
    }

    @Test
    public void
    winner_should_win_0_on_all_0_first_line() {
        game = new Game("000------");
        assertEquals('0', game.winner());
    }
}
