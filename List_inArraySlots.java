/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    private int[] refToArray;
    private int filledElements;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        refToArray = new int[8]; 
    }

    /** 
      @return the number of elements in this list
     */
    public int size() {
        return refToArray.length;
    }

     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
        String stringRep = "[";
        for (int index = 0; index < refToArray.length; index++){
            stringRep += refToArray[index];
            stringRep += ",";
        }
        stringRep += "]";
        return stringRep;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( int value) {
        refToArray[filledElements] = value;
        filledElements++;
        return true;
    }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
    //private void expand() {    
        
    //}
}