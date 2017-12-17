
package iterator;

import java.util.List;
import java.util.ArrayList;

//Impemenace iterátoru pro seznam překrytí poděděných metod 
public class JmenaSeznam implements Container{
    public List jmena = new ArrayList();
    
    public void addItem(String jmeno){
        jmena.add(jmeno);
    }
    
    @Override
    public Iterator getIterator() {
      return new JmenaSeznamIterator();
    }
    
    private class JmenaSeznamIterator implements Iterator{
      int index;
        
      @Override
      public boolean hasNext() {
         if(index < jmena.size()){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
         if(this.hasNext()){
            return jmena.get((int) this.next());
         }
         return null;
      }		
   }
}
