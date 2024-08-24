import java.util.*;
abstract class Shape{
    abstract void area();
    abstract void volume();
}

public class Q19 extends Shape{

    void area(){
        System.out.println("Enter the Radius ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        double area = 3.14 * r * r ;
        System.out.println("Area of Circle is "+area);
    }
    void volume(){
        System.out.println("Enter the Radius ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Enter the Hight ");
        double h = sc.nextDouble();
        double volume = 3.14 * r * 2 * h ;
        System.out.println("Volume of Circle is "+volume);
        

    }
    public static void main(String[] args) {
        Q19 q = new Q19();
        q.area();
        q.volume();
        
    }
}
