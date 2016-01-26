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
public class LinkedBag {
    private Node firstNode; //
    private int numberofEntries;
    
    public LinkedBag(){
        firstNode = null;
        numberofEntries = 0;
    }
    
    public void add(String dataPortion){
        
        Node newNode = new Node(dataPortion);
        newNode.next = firstNode;
        
        firstNode = newNode;
        numberofEntries++;
        System.out.println("Created New node");
    }
    public void remove(){
        if(numberofEntries>0){
        
        
        firstNode = firstNode.next;
        numberofEntries--;   
        System.out.println("Deleted Node");
        }else {
            System.out.println("Nothing to Remove");
        }
    }
}
