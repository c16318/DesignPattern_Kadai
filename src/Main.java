
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
                }
                break;
            }
        }while(select != 4);

    }
}
