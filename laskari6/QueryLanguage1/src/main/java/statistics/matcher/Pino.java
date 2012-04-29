/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import java.util.LinkedList;

/**
 *
 * @author Kari
 */
public class Pino {

    private LinkedList<String> alkiot;
 
    public Pino() {
        alkiot = new LinkedList<String>();
    }
 
    public void push(String alkio){
        alkiot.addFirst(alkio);
    }
 
    public String pop(){
        return alkiot.remove();
    }
 
    public boolean empty(){
        return alkiot.isEmpty();
    }

}
