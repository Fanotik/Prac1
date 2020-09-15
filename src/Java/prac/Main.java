package Java.prac;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарикус", "Лиловый", 6);
        Book book = new Book("Посторонний", 114);
        Ball ball = new Ball("Баскетбол", "Большой");

        dog.getInfo();
        System.out.println("\n");
        book.getInfo();
        System.out.println("\n");
        ball.getInfo();
    }
}