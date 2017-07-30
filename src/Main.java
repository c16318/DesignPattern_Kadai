
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author c16318
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<Item>();
        ItemFactory itemFactory = new ItemFactory();
        int select;

        do{
            System.out.println("1:本 2:CD 3:LIst 4:終了");
            select = scan.nextInt();
            switch(select){
                case 1:
                case 2:
                    list.add(itemFactory.createItem(select));
                    break;
                case 3:
                for(Item i : list){
                    i.print();
                    System.out.println("test");
                }
                break;
            }
        }while(select != 4);

    }
}
