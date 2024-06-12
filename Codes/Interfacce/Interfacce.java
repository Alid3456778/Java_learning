//interface 
interface A{
    String name="Unknown";
    //in interface we jsut create or diclare the funtion or methods 
void print_name();  
}
//while interface to intergface we use extends 
interface B extends A{
    void print_B_name();
}
//while doing class to interface we use implements
public class Interfacce implements B { 

    //in class we define or code the mehtods 
    public void print_name(){
        System.out.println("Printing name "+name);
    }

    public void print_B_name(){
        System.out.println("Printing name with B "+name);
    }

    public static void main(String[] args){
        Interfacce my_interface=new Interfacce();
        my_interface.print_name();
        // System.out.println("hello");
        my_interface.print_B_name();
    }
} 