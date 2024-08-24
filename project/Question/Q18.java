import java.util.*;
class customer{
     int id;
     static int balance=0;
     String name;

     void get_data(int pid , String pname,int bal){
        id = pid;
        name = pname;
        balance = bal;
    }
    void display(){
        System.out.println("ID is "+id);
        System.out.println("Name is "+name);
        System.out.println("balance is "+balance);
        //System.out.println("Number of Customer is "+count);
    }
    static void IncreaseBalance(int bal){
        balance = balance + bal;
    }
}
public class Q18 extends customer {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of customer ");
        // int n = sc.nextInt();
        // customer c[] = new customer[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter the id ");
        //     int id = sc.nextInt();
        //     System.out.println("Enter the name ");
        //     String name = sc.next();
        //     c[i] = new customer();
        //     c[i].get_data(id,name);
        // }
        // for(customer cus : c ){
        //     cus.display();
        // }
        customer c = new customer();
        c.get_data(1,"Rahul",1000);
        c.display();
        c.IncreaseBalance(300);
        c.display();

    }
}
