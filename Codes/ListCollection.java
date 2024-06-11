import java.util.*;



public class ListCollection{
    public static void main(String[] args) {
        List<String> obj=new ArrayList<>();
        //.add is use to Add the data and in parameter we use (Inder,String)
        //.add(Index,String);
        obj.add("Apple");
        obj.add("Mango");
        obj.add("Cherry");
        obj.add("Banana");
        obj.add("Pineapple");

        //.get is use to get the element by index
        //.get(int index)
        System.out.println("At index 4 is "+obj.get(3));

        //get the index of the elemnt
        //.get(String)
        System.out.println("last Index elemnt is "+obj.indexOf("Mango"));

        //Returns the index of the first instance of obj in the invoking list. If obj is not 
        //an element of the list, .1 is returned.
        System.out.println("Gettim=ng the last Element "+obj.lastIndexOf("Pineapple"));

        //Use to Remove the Element From Index
        obj.remove(3);
        System.out.println("After removing the element  "+obj);

        //Use to Put/Replace the Element From the Index Value
        //.set(index,New_Element)
        obj.set(2,"Peach");
        System.out.println("After replacing the element  "+obj);

        //To get the Size of List
        System.out.println("The Size of the list is "+obj.size());

        //Show the Element where The Index is put 
        //Only show the Element in bettwen the Index
        //obj.subList(Insex_Start,Index_End)
        System.out.println("The LIst is "+obj.subList(1,3));

    }
}