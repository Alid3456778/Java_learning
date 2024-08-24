import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names= {"ali","sam","rahul","dujay"};
        System.out.println("Enter a name to search ");
        String na = sc.nextLine();
        int count = 5;
        for(int i=0;i<names.length;i++){
            if(names[i].equals(na)){
                System.out.println("Name found at "+i);
                count = 1;
            }
        }
        if(count == 5){
            System.out.println("Name not found");
        }
        sc.close();
    }
}
