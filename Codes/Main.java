import java.io.*;
import java.lang.*;
import java.util.*;

public class Superior{
    String name;
    public Superior(String name){
        this.name=name;
    }

    public void show(){
        System.out.println("Super: "+name);
    }
}

public class Sub extends Superior{
    String bread;
    public Sub(String name,String bread){
        super(name);
        this.bread=bread;
    }
    public void display(){
        System.out.println("Sub: "+bread);
        System.out.println("name: "+name);
    }


}

public class Main{
    public static void main(String[] args){
    Sub s=new Sub("Ali","Human");
    s.display();
    }
}

 