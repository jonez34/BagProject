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
public class LinkedStack {
    public Node top;
    
    public LinkedStack(){
        top = null;
    }
    public void Push(String item){
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        
        
    }
    public String Pop(){
        if(top==null){
            System.out.println("Nothing to Pop");
            return "";
        }
        String popData = top.data;
        top = top.next;
        return popData;
    }
    public String Peek(){
        String popData = top.data;
        return popData;
    }
    public String toString(){
        Node it = new Node("");
        it =top;
        String result = "";
        while(it!=null){
            result = result + " " + it.data;
            it = it.next;
        }
        
        
        return result;
    
    
    }
    
    

}
