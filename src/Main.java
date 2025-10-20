import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck1 deck1 = new Deck1();
//        System.out.println(deck1.getName(2) + "\t" + deck1.getPoint(2));
        Scanner input = new Scanner(System.in);

        int sum = game(deck1, input, "Игрок 1");
        int sum2 = game(deck1, input, "Игрок 2");

        if (sum > 21 && sum2 > 21) {
            System.out.println("Оба проиграли");
        } else if (sum2 > 21) {
            System.out.println("Первый выиграл");
        }else if (sum > 21) {
            System.out.println("Второй выиграл");
        }if (sum >sum2) {
            System.out.println("Первый выиграл");
        }


//        int point = Deck1.getName(2);
    }

    private static int game(Deck1 deck1, Scanner input, String title) {
        System.out.println(title);
        int sum = 0;
        int id1 = deck1.getId();
        sum += Deck1.getPoint(id1);
        System.out.println(Deck1.getName(id1));

        id1 = deck1.getId();
        sum += Deck1.getPoint(id1);
        System.out.println(Deck1.getName(id1));

        while (true) {
            System.out.println();
            System.out.println("Общее = " + sum);
            System.out.println("Ещё? (Да/Нет)");
            String answer = input.nextLine().toLowerCase();
            if (answer.equals("да")) {
                id1 = deck1.getId();
                sum += Deck1.getPoint(id1);
                System.out.println(Deck1.getName(id1));
                if (sum > 20) {
                    break;
                }
            } else {
                break;
            }
        }

        System.out.println("Очки первого игрока = " + sum);
        return sum;
    }

}