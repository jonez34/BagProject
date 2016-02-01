/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagproject;

/**
 *
 * @author hjones2368
 */
public class BagProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TestIntegerBag();
        //TestStringBag();
        
        LinkedBag myBag = new LinkedBag();
        myBag.add("Hello");
        myBag.add("are");
        myBag.add("you");
        myBag.add("there");
        myBag.add("its");
        myBag.add("me");
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        
    }
    public static void TestStringBag(){
        Bag<String> myBag = new Bag<String>();
        //Bag<T> myBag = new Bag<T>();
        //IntegerBag myBag = new IntegerBag();
        
        myBag.add("Gamers");
        myBag.add("Games");
        myBag.add("Game");
        myBag.add("Gamer");
        myBag.add("Game's");
        myBag.add("Gamest");
        System.out.println(myBag);
        myBag.remove();
        System.out.println(myBag);
        myBag.removeItem("Game");
        System.out.println(myBag);
    }
    public static void TestIntegerBag(){
       
        // TODO code application logic here
        System.out.println("Hello");
 //       int[] intarray = new int[10];
 //      intarray[0] = 10;
 //       intarray[1] = 1;
        
        IntegerBag myBag = new IntegerBag();
        
        myBag.add(10);
        myBag.add(11);
        myBag.add(12);
        myBag.add(13);
        myBag.add(14);
        myBag.add(15);
        myBag.add(16);
        myBag.add(17);
        myBag.add(18);
        myBag.add(19);
        myBag.add(20);
        myBag.add(21);
        
        myBag.remove();
        myBag.remove();
        myBag.remove();
        System.out.println(myBag);
        
        myBag.removeItem(13);
        //myBag.removeAt(3);
        //myBag.clear();
        //myBag.remove();
        System.out.println(myBag);
        myBag.removeItem(13);
    
    
    }
    
}
