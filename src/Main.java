import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Объявляется
        Deck deck = new Deck();
        Scanner input = new Scanner(System.in);

        int sum = 0;
        char s1 = ' ';
        //вытягиваем карту
        do{
            int id = deck.getId();
            sum = sum + deck.getPoint(id);
            String name = deck.getName(id);
            System.out.println(sum + "\t" + name);

            fun(deck, sum, input);

            System.out.println("Играем? У - да, N - нет");
            String s = input.nextLine();
             s1 = s.toLowerCase().trim().charAt(0);
        }while (s1 == 'y') ;
    }

    private static void fun(Deck deck, int sum, Scanner input) {

//        deck.exists = new boolean[sum];

        int id = deck.getId();
        sum = sum + deck.getPoint(id);
        String name = deck.getName(id);
        System.out.println(sum + "\t" + name);

        if(sum > 21) {
            System.out.println("Вы проиграли!!");
        }else  if(sum == 21) {
            System.out.println("Вы выиграли!!");
        }else {

            System.out.println("Ещё? У - да, N - нет");
            String s = input.nextLine();
            char s1 = s.toLowerCase().trim().charAt(0);

            if(s1 == 'y') {
                fun( deck, sum, input);
            }
        }
    }
}