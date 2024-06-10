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
            obj1.add(get);
        } 
        System.out.println(obj1);  

        // System.out.println("Want to Search the Frute");
        // num=scan.nextInt();

     
    }
}