
/**
 *
 * @author c16318
 */
public class Book extends Item{
    private String isbn;
    
    Book(String name,int price,String isbn){
        super(name,price);
        this.isbn = isbn;
        
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public void print(){
        System.out.println("書籍名 >" + this.getName());
        System.out.println("価格 　>"+ this.getPrice());
        System.out.println("ISBN　>" + isbn);
        System.out.println();

    }
}
