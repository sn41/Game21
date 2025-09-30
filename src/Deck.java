import java.util.Random;

public class Deck {
    private boolean[] exists = new boolean[36];

    private String getPointName(int point){
        if(point == 1){
            return  "очко";
        }else if(point > 1 && point <5){
            return "очка";
        }else {
            return "очков";
        }
    }

    private static String[] suit = {"крести", "треф", "буби", "пики"};

    private static String[] card = {"шесть", "семь", "восемь", "девять", "десять", "король", "дама", "валет", "туз"};

    private static int[] points = {6, 7, 8, 9, 10, 4, 3, 2, 1};

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

