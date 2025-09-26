public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        int id = deck.get();
        String name = deck.getName(id);
        System.out.println(name);
    }
}