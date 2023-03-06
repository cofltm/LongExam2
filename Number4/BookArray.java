public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];

        books[0] = new Fiction("It Ends with Us");
        books[1] = new NonFiction("In Cold Blood");
        books[2] = new Fiction("It Starts with Us");
        books[3] = new NonFiction("Educated");
        books[4] = new Fiction("Lesson in Chemistry");
        books[5] = new NonFiction("The Diary of a Young Girl");
        books[6] = new Fiction("Daisy Jones and The Six");
        books[7] = new NonFiction("A Brief History of Time");
        books[8] = new Fiction("Beloved");
        books[9] = new NonFiction("Sapiens: A Brief History of Humankind");
        
        for (Book book : books) {
            System.out.println("Title: " + book.getBooksTitle());
            System.out.println("Price: " + book.getBooksPrice());
            System.out.println("--------------");
        }
    }
}
