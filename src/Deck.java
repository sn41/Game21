import java.util.Random;

public class Deck {
    boolean[] exists = new boolean[36];

//    int[] points = {
//            6, 7, 8, 9, 10, 4, 3, 2, 1,
//            6, 7, 8, 9, 10, 4, 3, 2, 1,
//            6, 7, 8, 9, 10, 4, 3, 2, 1,
//            6, 7, 8, 9, 10, 4, 3, 2, 1
//    };


//
//    String[] names = {
//            "6 очков, шесть, крести",
//            "7 очков, семь, крести",
//            "8 очков, восемь, крести",
//            "9 очков, девять, крести",
//            "10 очков, десять, крести",
//            "4 очков, король, крести",
//            "3 очков, дама, крести",
//            "2 очков, валет, крести",
//            "1 очков, туз, крести",
//
//            "6 очков, шесть, треф",
//            "7 очков, семь, треф",
//            "8 очков, восемь, треф",
//            "9 очков, девять, треф",
//            "10 очков, десять, треф",
//            "4 очков, король, треф",
//            "3 очков, дама, треф",
//            "2 очков, валет, треф",
//            "1 очков, туз, треф",
//
//            "6 очков, шесть, буби",
//            "7 очков, семь, буби",
//            "8 очков, восемь, буби",
//            "9 очков, девять, буби",
//            "10 очков, десять, буби",
//            "4 очков, король, буби",
//            "3 очков, дама, буби",
//            "2 очков, валет, буби",
//            "1 очков, туз, буби",
//
//            "6 очков, шесть, пики",
//            "7 очков, семь, пики",
//            "8 очков, восемь, пики",
//            "9 очков, девять, пики",
//            "10 очков, десять, пики",
//            "4 очков, король, пики",
//            "3 очков, дама, пики",
//            "2 очков, валет, пики",
//            "1 очков, туз, пики",
//    };

    String getPointName(int point){
        if(point == 1){
            return  "очко";
        }else if(point > 1 && point <5){
            return "очка";
        }else {
            return "очков";
        }
    }

    String[] suit = {"крести", "треф", "буби", "пики"};

    String[] card = {"шесть", "семь", "восемь", "девять", "десять", "король", "дама", "валет", "туз"};

    int[] points = {6, 7, 8, 9, 10, 4, 3, 2, 1};

    private final Random rand = new Random();

    {
        for (int i = 0; i < 36; i++) {
            exists[i] = true;
        }
    }

    String getName(int id) {
        int point = getPoint(id);

        int indexCard = id % 9;
        String cardName = this.card[indexCard];

        String pointName = getPointName(point);

        int indexSuit = id / 9;
        String suit = this.suit[indexSuit];

        String name = point + " " + pointName + ", " + cardName + "," + suit;

        return name;
    }

    int getId() {
        while (true) {
            int i = rand.nextInt(0, 36);
            if (exists[i]) {
                exists[i] = false;
                return i;
            }
        }
    }

    int getPoint(int id) {
        return points[id % 9];
    }
}

/*
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
 */
