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
public class Node {
    private String data; //Entry in Bag
    public Node next; //Link to next node
    
    public Node(String dataPortion){
        this(dataPortion, null);
    }// end constructor
    private Node(String dataPortion, Node nextNode){
        data = dataPortion;
        next = nextNode;
    }// end constructor
}//end Node
