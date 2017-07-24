
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class Main {
    public static void main(String[] args){
        int select;
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<Item>();
        ItemFactory itemFactory = new ItemFactory();
        
        /*Item a = new CompactDisc("cd",500,"b");
        Item b = new Book("本",500,"d") ;
        a.print();
        b.print();*/
        
        
        
        do{
            System.out.println("1:本 2:CD 3:LIst 4:終了");
            select = scan.nextInt();
            if(select == 1 || select == 2){
                list.add(itemFactory.createItem(select));
            }
            else if(select == 3){
                for(Item i : list){
                    i.print();
                }
            }
            
        }while(select != 4);

    }
}
