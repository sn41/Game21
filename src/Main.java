import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner input = new Scanner(System.in);

        int sum = 0;

        //вытягиваем карту
//        int id = deck.get();
//        sum = sum + deck.getPoint(id);
//        String name = deck.getName(id);
//        System.out.println(sum + "\t" + name);
//        if(sum > 21) {System.out.println("Вы проиграли!!");}
        sum = fun(deck, sum, input);

//        System.out.println("Ещё?");
//        input.nextLine();
//
//        id = deck.get();
//        sum = sum + deck.getPoint(id);
//        name = deck.getName(id);
//        System.out.println(sum + "\t" + name);
//        if(sum > 21) {System.out.println("Вы проиграли!!");}

        sum = fun(deck, sum, input);

//        System.out.println("Ещё?");
//        input.nextLine();
//
//        id = deck.get();
//        sum = sum + deck.getPoint(id);
//        name = deck.getName(id);
//        System.out.println(sum + "\t" + name);
//        if(sum > 21) {System.out.println("Вы проиграли!!");}

        sum = fun(deck, sum, input);

//        System.out.println("Ещё?");
//        input.nextLine();
//
//
//        id = deck.get();
//        sum = sum + deck.getPoint(id);
//        name = deck.getName(id);
//        System.out.println(sum + "\t" + name);
//        if(sum > 21) {System.out.println("Вы проиграли!!");}
//
//        System.out.println("Ещё?");
//        input.nextLine();

        sum = fun(deck, sum, input);
    }

    private static int fun(Deck deck, int sum, Scanner input) {
        int id = deck.get();
        sum = sum + deck.getPoint(id);
        String name = deck.getName(id);
        System.out.println(sum + "\t" + name);
        if(sum > 21) {System.out.println("Вы проиграли!!");}

        System.out.println("Ещё?");
        input.nextLine();

        return sum;
    }
}