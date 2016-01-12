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
        myBag.remove();
        myBag.remove();
        
        myBag.clear();
        
        
    }
    
}
