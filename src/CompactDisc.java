


/**
 *
 * @author c16318
 */
public class CompactDisc extends Item{
    private String artist;
    
    CompactDisc(String name,int price,String artist){
        super(name,price);
        this.artist = artist;
    }
    
    public String getArtist(){
        return artist;
    }

    
    public void print(){
        System.out.println("タイトル    > " + this.getName());
        System.out.println("アーティスト > " + this.getArtist());
        System.out.println("価格       > " + this.getPrice());
    }
}
