import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Deck1Test {
    private static String[] names = {
            "6 крести",
            "7 крести",
            "8 крести",
            "9 крести",
            "10 крести",
            "король крести",
            "валет крести",
            "дама крести",
            "туз крести",

            "6 буби",
            "7 буби",
            "8 буби",
            "9 буби",
            "10 буби",
            "король буби",
            "валет буби",
            "дама буби",
            "туз буби",

            "6 пики",
            "7 пики",
            "8 пики",
            "9 пики",
            "10 пики",
            "король пики",
            "валет пики",
            "дама пики",
            "туз пики",

            "6 черви",
            "7 черви",
            "8 черви",
            "9 черви",
            "10 черви",
            "король черви",
            "валет черви",
            "дама черви",
            "туз черви"
    };
    @Test
    void getPoint() {
//        int id = 0;
//        int actualPoint = Deck1.getPoint(id);
//        int expectedPoint = 6;
//        assertEquals(expectedPoint, actualPoint);

        int id = 7;
        int actualPoint = Deck1.getPoint(id);
        int expectedPoint = 2;
        assertEquals(expectedPoint, actualPoint);

//        id = 9;
//        actualPoint = Deck1.getPoint(id);
//        expectedPoint = 6;
//        assertEquals(expectedPoint, actualPoint);
    }

    @Test
    void getName() {
        int id = 7;
        String actualName = Deck1.getName(id);
        String expectedName = names[id];
        assertEquals(expectedName, actualName);
    }
}