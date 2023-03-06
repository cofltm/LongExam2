public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Harry Potter and the Philosopher's Stone");
        NonFiction nonFictionBook = new NonFiction("The Power of Now");

        System.out.println("Title of Fiction book: " + fictionBook.getBooksTitle());
        System.out.println("Price of Fiction book: " + fictionBook.getBooksPrice());

        System.out.println("Title of NonFiction book: " + nonFictionBook.getBooksTitle());
        System.out.println("Price of NonFiction book: " + nonFictionBook.getBooksPrice());
    }
}
