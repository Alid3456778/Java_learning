import java.io.*;
import java.lang.*;
import java.util.*;


//creating Super class where its function can be inherit to sub class
 class Superior{
    String name;
    public Superior(String name){
        this.name=name;
    }

    public void show(){
        System.out.println("Super: "+name);
    }
}

//Sub class which inherit function from super class
 class Sub extends Superior{
    String bread;
    public Sub(String name,String bread){
        super(name);//calling super class and calling its constructor
        this.bread=bread;
    }
    public void display(){
        System.out.println("Sub: "+bread);
        System.out.println("name: "+name);
        show();//calling the super method
    }


}

public class Main{
    public static void main(String[] args){
    Sub s=new Sub("Ali","Human");
    s.display();
    }
}

 