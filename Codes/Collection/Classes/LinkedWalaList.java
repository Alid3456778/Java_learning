// 1. void add(int index, Object element)
// Inserts the specified element at the specified position index in this list. 
// Throws IndexOutOfBoundsException if the specified index is out of range 
// (index < 0 || index > size()). 

// 2. boolean add(Object o) 
// Appends the specified element to the end of this list. 

// 5. void addFirst(Object o)
// Inserts the given element at the beginning of this list.

// 6. void addLast(Object o) 
// Appends the given element to the end of this list. 

// 10. Object get(int index) 
// Returns the element at the specified position in this list. Throws 
// IndexOutOfBoundsException if the specified index is out of range (index < 
// 0 || index >= size()). 

// 11. Object getFirst() 
// Returns the first element in this list. Throws NoSuchElementException if 
// this list is empty. 

// 12. Object getLast() 
// Returns the last element in this list. Throws NoSuchElementException if 
// this list is empty. 

// 13. int indexOf(Object o) 
// Returns the index in this list of the first occurrence of the specified element, 
// or -1 if the List does not contain this element. 

// 16. Object remove(int index) 
// Removes the element at the specified position in this list. Throws 
// NoSuchElementException if this list is empty. 

// 17. boolean remove(Object o) 
// Removes the first occurrence of the specified element in this list. Throws 
// NoSuchElementException if this list is empty. Throws 
// IndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()). 

// 18. Object removeFirst() 
// Removes and returns the first element from this list. Throws 
// NoSuchElementException if this list is empty. 

// 19. Object removeLast() 
// Removes and returns the last element from this list. Throws 
// NoSuchElementException if this list is empty. 

// 20. Object set(int index, Object element) 
// Replaces the element at the specified position in this list with the specified 
// element. Throws IndexOutOfBoundsException if the specified index is out 
// of range (index < 0 || index >= size()). 



import java.util.*;

public class LinkedWalaList{
    public static void main(String[] args){
        //System.out.println("Hello");
        List<String> obj=new LinkedList<>();
        obj.add("Apple");
        obj.add("Mango");
        obj.add(1,"Pineapple");
        obj.add("Cherry");
        obj.add("Banana");

        //System.out.println(obj.get(1));
        obj.addFirst("Chicku");
        System.out.println(obj);
    }
}