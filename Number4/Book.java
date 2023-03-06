public abstract class Book {
     String booksTitle;
     double booksPrice;
    
    public Book () {
        this.booksTitle = booksTitle;
    }
    
    public String getBooksTitle() {
        return this.booksTitle;
    }
    
    public double getBooksPrice() {
        return this.booksPrice;
    }
    
    public abstract void setPrice();
}
