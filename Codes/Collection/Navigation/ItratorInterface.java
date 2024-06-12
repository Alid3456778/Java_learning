//itration 
// 1. boolean hasNext() 
// It returns true if Iterator has more element to iterate. 
// 2. Object next() 
// It returns the next element in the collection until the hasNext () method 
// return true. This method throws NoSuchElementException’ if there is no 
// next element. 
// 3. void remove()
// It removes the current element in the collection. This method throws 
// ‘IllegalStateException’ if this function is called before next( ) is invoked.

import java.util.*;

public class ItratorInterface{
    public static void main(String[] args) {
    //System.out.println("Hello");
    Collection<String> obj=new ArrayList<>();
    int n,i;
    String name;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of Employees");
    n=scan.nextInt();
    for(i=0;i<n;i++){
        System.out.println("Enter the Name Of Employee");
        name=scan.next();
        obj.add(name);
    }

    System.out.println("Employes are ");

    //use this to start the Itration of an Object
    //And we converted it into the String
    Iterator<String> itarat=obj.iterator();
    while(itarat.hasNext()){//hasNext is use to see that is there any value in there or not
        System.out.println(itarat.next());//.next is use to get the next Element       
    }
    }
}