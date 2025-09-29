import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();


        Scanner scanner = new Scanner(System.in);


        //вытягиваем карту
//        int id = deck.get();
//        String name = deck.getName(id);
//        System.out.println(name);

        getCard(deck);
        scanner.nextLine();

        getCard(deck);
        scanner.nextLine();

        getCard(deck);
        scanner.nextLine();

        scanner.close();
    }

    private static void getCard(Deck deck){
        int id = deck.get();
        String name = deck.getName(id);
        System.out.println(name);
        System.out.println("Нажмите Enter для продолжения...");
    }
}