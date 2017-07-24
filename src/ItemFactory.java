
import java.util.Scanner;



/**
 *
 * @author c16318
 */
public class ItemFactory {
    public Item createItem(int i){
        Scanner scan = new Scanner(System.in);
        
        if(i == 1){
                System.out.println("書籍名　価格　ISBN");
                Item book = new Book(scan.next(),scan.nextInt(),scan.next());
                return book;
        }
        
                System.out.println("タイトル　価格　アーティスト");
                Item cd = new CompactDisc(scan.next(),scan.nextInt(),scan.next());
            return cd;
        
    }
}
