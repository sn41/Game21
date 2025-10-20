import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck1 deck1 = new Deck1();
//        System.out.println(deck1.getName(2) + "\t" + deck1.getPoint(2));
        Scanner input = new Scanner(System.in);

        System.out.println("Игрок 1!");
        int sum = 0;
        int id1 = deck1.getId();
        sum += Deck1.getPoint(id1);
        System.out.println(Deck1.getName(id1));

        id1 = deck1.getId();
        sum += Deck1.getPoint(id1);
        System.out.println(Deck1.getName(id1));

        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("Общее = " + sum);
            System.out.println("Ещё? (Да/Нет)");
            String answer = input.nextLine().toLowerCase();
            if (answer.equals("да")) {
                id1 = deck1.getId();
                sum += Deck1.getPoint(id1);
                System.out.println(Deck1.getName(id1));
                if(sum>20){
                    break;
                }
            }else {
                break;
            }
        }

        System.out.println("Очки первого игрока = " + sum);

        System.out.println("Игрок 2!");
        int sum2 = 0;
        id1 = deck1.getId();
        sum += Deck1.getPoint(id1);
        System.out.println(Deck1.getName(id1));

        id1 = deck1.getId();
        sum += Deck1.getPoint(id1);
        System.out.println(Deck1.getName(id1));

         flag = true;
        while (flag) {
            System.out.println();
            System.out.println("Общее = " + sum2);
            System.out.println("Ещё? (Да/Нет)");
            String answer = input.nextLine().toLowerCase();
            if (answer.equals("да")) {
                id1 = deck1.getId();
                sum2 += Deck1.getPoint(id1);
                System.out.println(Deck1.getName(id1));
                if(sum2>20){
                    break;
                }
            }else {
                break;
            }
        }
        System.out.println("Очки первого игрока = " + sum2);



//        int point = Deck1.getName(2);
    }

}