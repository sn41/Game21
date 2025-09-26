public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();



        //вытягиваем карту
        int id = deck.get();
        String name = deck.getName(id);
        System.out.println(name);
    }
}