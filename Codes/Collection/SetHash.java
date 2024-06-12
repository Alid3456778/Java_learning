import java.util.*;

// 1. add( )
// Adds an object to the collection 
// 2. clear( )
// Removes all objects from the collection 
// 3. contains( )
// Returns true if a specified object is an element within the collection 
// 4. isEmpty( )
// Returns true if the collection has no elements 
// 5. iterator( )
// Returns an Iterator object for the collection which may be used to retrieve 
// an object 
// 6. remove( )
// Removes a specified object from the collection 
// 7. size( )
// Returns the number of elements in the collection 




public class SetHash{
    public static void main(String[] args) {
    Set<String> obj=new HashSet<>();
    //add object Element
    obj.add("Apple");
    obj.add("Mango");
    obj.add("Cherry");

    Set<String> obj1=new HashSet<>();
    obj1.add("Banana");
    obj1.add("Pineapple");

    System.out.println("Display all List 1 "+obj);

    //Delet the Obj Emelent
    // obj.clear();
    // System.out.println("Display all List "+obj);

    System.out.println("Display all List 2 "+obj1);

    }
}