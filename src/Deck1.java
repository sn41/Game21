import java.util.Random;

public class Deck1 {
    private static Random rand = new Random();

    boolean[] exists = new boolean[36];

    {
        for (int i = 0; i < exists.length; i++) {
            exists[i] = true;
        }
//        Arrays.fill(exits, true);
    }

    private static int[] points = { 6, 7, 8, 9, 10, 4, 3, 2, 1};

    private static String[] value = {  "6", "7", "8", "9", "10", "король", "валет", "дама", "туз"};

    private static String[] suit = { "крести", "буби", "пики", "черви"};

    static String getName(int id){
//        return value[id % 9] + " " + suit[id % 4] + " " + getPoint(id);
        return value[id % 9] + " " + suit[id / 9] ;
    }

    static int getPoint(int id){
        return points[id % 9];
    }

    int getId() {
        while (true) {
 int i = rand.nextInt(0, 36);
 if (this.exists[i]) {
     this.exists[i] = false;
     return i;
 }
        }
    }
    
}
