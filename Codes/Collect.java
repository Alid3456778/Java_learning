import java.util.*;//Use To Create a collection

public class Collect{

    public static void main(String[] args){
        // System.out.println("Hello");
        Collection <String> obj1=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int num,i;
        String get;

        System.out.println("Enter the Number Of data you Want");
        num=scan.nextInt();

        for(i=0;i<num;i++){
            System.out.println("Enter the Frute");
            get = scan.next();
            obj1.add(get);//get object
        } 
        System.out.println(obj1);  

        //obj.size() is use to return the size of the Object
        System.out.println("The size of Object is "+obj1.size());
        //obj1.clear(); //its use to remove all  the object  
        //System.out.println(obj1);
        
         //its use to check the object is present or not
        //  if(obj1.contains("apple")2){
        //     System.out.println("Apple is Present ");
        //  }

        //System.out.println("Removing the Apple");
        //use to remove the object element 
        // obj1.remove("apple");
        // System.out.println(obj1);

        //use to Itrate the Object
        // Iterator it= obj1.iterator();
        //  System.out.println(it.next());
         
        
        // num=scan.nextInt();

     
    }
}