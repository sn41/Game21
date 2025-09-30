import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DeckTest {

    @Test
    void getPointName() {

        Deck deck = new Deck();

        String[] array = {
                "очков",
                "очко",
                "очка",
                "очка",
                "очка",
                "очков",
                "очков",
                "очков",
                "очков",
                "очков",
                "очков",
                "очков",
                "очков"
        };

        for(int id = 0; id <11; id++){
            String expected = array[id];
            String actual = deck.getPointName(id);
            assertEquals(expected, actual);
        }
    }

    @Test
    void getName() {
    }
}