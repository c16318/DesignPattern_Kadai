

/**
 *
 * @author c16318
 */
public abstract class Item {
    private String name;
    private int price;
    
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }   
    
    public abstract void  print();
}
