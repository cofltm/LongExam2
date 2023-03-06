public class Fiction extends Book {
        
    public Fiction (String booksTitle) {
        this.booksTitle = booksTitle;
        this.booksPrice = 249.90;
    }
    
    @Override
    public void setPrice() {
//        System.out.println(this.getBooksPrice())
//        booksPrice = 290.90;
    }
}
