/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import java.lang.reflect.Method;
import statistics.Player;

/**
 *
 * @author Kari
 */
public class Or implements Matcher  {
   private int value;
    private String fieldName;
    //private int mones=0;

    public Or(int value, String category) {
        this.value = value;
        fieldName = "get"+Character.toUpperCase(category.charAt(0))+category.substring(1, category.length());
    }

    @Override
    public boolean matches(Player p) {
        try {                                    
            Method method = p.getClass().getMethod(fieldName);
            int playersValue = (Integer)method.invoke(p);
          //  mones++;
          //  System.out.println("mones "+mones);
            //if(mones==1)
           // {
           // return playersValue<value;
           // }            
           // else if(mones==2)
           // {
           //   mones=0;  
              return playersValue>value;
           // }  
            
        } catch (Exception ex) {
            System.out.println(ex);
            throw new IllegalStateException("Player does not have field "+fieldName.substring(3, fieldName.length()).toLowerCase());
        }       
        
    }      
}
