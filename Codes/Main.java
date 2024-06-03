import java.io.*;
import java.lang.*;
import java.util.*;
//Inheritance single inheritance

//creating Super class where its function can be inherit to sub class
 class Superior{
    String name="";

    public Superior(){
        System.out.println("Nothing to be shown");
    }

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

    public Sub(){
        super();
        System.out.println("No parameter Constructor ");
        show();
    }

    public Sub(String name,String bread){
        //super();//calling super class and calling its constructor
        super(name);
        this.bread=bread;
        display();
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
    //s.display();

    //Sub s1=new Sub();
    //s1.display();
    }
}

 