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
public class Bag <T>{
    private T Data[];        //this is the bag data array
    private static int Capacity = 10;   //this is the total capacity of they bag
    private int numberofEntries = 0;
    
    public Bag(){
        Data = (T[]) new Object[Capacity];
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
    public void add(T newData){
        
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
        if(numberofEntries>0){
            Data[numberofEntries-1]=null;
            numberofEntries = numberofEntries-1;
        }else{
                System.out.println("Bag is empty. Cannot delete anything else!!");
        }
    }
    public void clear(){
        while(numberofEntries>0){
            remove();
            System.out.println("I  have Cleared an Item");
        }
    }
    public void removeAt(int index){
        
        //Start with index check to have a value
        if(numberofEntries>index && index < Capacity){
            System.out.println("Trying to remove at " + index);
            //set the index to 0
            Data[index] = null;
            //move the indexs up one level
            for(int i=index; i<numberofEntries-1; i++){
                Data[i] = Data[i+1];
            }
            numberofEntries--;
            Data[numberofEntries]=null;
        }else {
            System.out.println("Nothing at Index" );
        }
    } 
    public void removeItem(T item){
        Boolean found = false;
        //search the array
        for(int i=0; i<numberofEntries; i++)
            //compare data to item
             if(Data[i] == item){
                 //call removeAt
                 removeAt(i);
                 found = true;
        }
        if(found==false){
           System.out.println("item was not found" );
        }
    }
    
    public String toString(){
        String returnString = "";
        for(int i=0; i<numberofEntries; i++){
            returnString = returnString + "\n index " + i + 
                    " = " + Data[i];
        }
        return returnString;
    }
}
