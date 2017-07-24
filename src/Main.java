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
        Item a = new CompactDisc("cd",500,"b");
        Item b = new Book("本",500,"d") ;
        a.print();
        b.print();
    }
}
