
package iterator;

//Impemenace iterátoru pro pole překrytí poděděných metod 
public class JmenaPole implements Container{
   public String jmena[] = {"Jana", "Petr", "Ivana"};
   
   @Override
   public Iterator getIterator() {
      return new JmenaPoleIterator();
   }

   private class JmenaPoleIterator implements Iterator{
      int index;

      @Override
      public boolean hasNext() {
         if(index < jmena.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return jmena[index++];
         }
         return null;
      }		
   }
}
