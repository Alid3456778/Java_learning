// 1.boolean hasPrevious(): 
// Returns true if this ListIterator has more elements when traversing the list in 
// the reverse direction. 

//2. E previous(): 
// Returns the previous element in the list and moves the cursor position 
// backwards. 
// int previousIndex(): 
// Returns the index of the element that would be returned by a subsequent call 
// to previous(). 

import java.util.*;

public class ListIteration{
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        int n,i;
        String name,sname;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Numebr of Students");
        n=scan.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter the name of Student ");
            name=scan.next();
            obj.add(name);
        }

        ListIterator<String> itarat=obj.listIterator();
        System.out.println("Students name in Order");
    while(itarat.hasNext()){
        System.out.println(itarat.next());     
    }

    System.out.println("Students name in Reverce Order");
    while(itarat.hasPrevious()){//it gives True when it have a previous Element
        System.out.println(itarat.previous());//Use to Print The previous element
    }
    }
}