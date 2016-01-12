package bagproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjones2368
 */
public class IntegerBag {
    private int Data[];        //this is the bag data array
    private static int Capacity = 10;   //this is the total capacity of they bag
    private int numberofEntries = 0;
    
    public IntegerBag(){
        Data = new int[Capacity];
    }
    public int getCureentSize(){
        return numberofEntries;
    }
    public boolean isEmpty(){
       //return (numberofEntries == 0);
        if(numberofEntries == 0)
                return true;
        else 
            return false;
    }
    public void add(int newData){
        
        //if bag is full
        if(numberofEntries<Capacity)
        {
            // basic addition of data
        Data[numberofEntries]=newData;
        numberofEntries = numberofEntries+1;  
        }else{
                System.out.println("Bag is full! Delete something!!");
        }
        
    }
    public void remove(){
        if(numberofEntries>=0){
            Data[numberofEntries-1]=0;
            numberofEntries = numberofEntries-1;
        }else{
                System.out.println("Bag is empty. Cannot delete anything else!!");
        }
    }
    public void clear(){
        while(numberofEntries >=0){
            remove();
        }
    }
        
    
}
