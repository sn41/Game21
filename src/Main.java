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
//        sum = fun(deck, sum, input);

//        System.out.println("Ещё?");
//        input.nextLine();
//
//        id = deck.get();
//        sum = sum + deck.getPoint(id);
//        name = deck.getName(id);
//        System.out.println(sum + "\t" + name);
//        if(sum > 21) {System.out.println("Вы проиграли!!");}

//        sum = fun(deck, sum, input);

//        System.out.println("Ещё?");
//        input.nextLine();
//
//        id = deck.get();
//        sum = sum + deck.getPoint(id);
//        name = deck.getName(id);
//        System.out.println(sum + "\t" + name);
//        if(sum > 21) {System.out.println("Вы проиграли!!");}

//        sum = fun(deck, sum, input);

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

        fun(deck, sum, input);
    }

    private static void fun(Deck deck, int sum, Scanner input) {
        int id = deck.get();
        sum = sum + deck.getPoint(id);
        String name = deck.getName(id);
        System.out.println(sum + "\t" + name);

        if(sum > 21) {
            System.out.println("Вы проиграли!!");
//            return;
        }else  if(sum == 21) {
            System.out.println("Вы выиграли!!");
//            return;
        }else {
            System.out.println("Ещё? У - да, N - нет");
            String s = input.nextLine();

            char s1 = s.toLowerCase().trim().charAt(0);

            if(s1 == 'y') {
                fun( deck, sum, input);
            }
//            return;
        }
//        return;
    }
}