import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck1 deck1 = new Deck1();
//        System.out.println(deck1.getName(2) + "\t" + deck1.getPoint(2));
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int id1 = deck1.getId();
        sum += Deck1.getPoint(id1);
        System.out.println(Deck1.getName(id1));

        id1 = deck1.getId();
        sum += Deck1.getPoint(id1);
        System.out.println(Deck1.getName(id1));
        System.out.println();
        System.out.println("Общее = " + sum);
        System.out.println("Ещё? (Да/Нет)");
        String answer = input.nextLine().toLowerCase();
        if (answer.equals("да")) {
            id1 = deck1.getId();
            sum += Deck1.getPoint(id1);
        }



//        int point = Deck1.getName(2);
    }

}