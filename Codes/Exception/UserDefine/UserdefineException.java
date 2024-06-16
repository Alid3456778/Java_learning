import java.lang.*;
import java.util.*;
import java.io.*;

//declaring the User define Exception
 class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class UserdefineException{
    public static void main(String[] args){
        int a=6;
        System.out.println("Hello");
        
            try{
                if(a<9) {
                    //useing the Useer define Exception
            throw new MyException("some thing went wrong");
                }
            }
            catch(Exception e){
                System.out.println("Caught  "+e.getMessage());
            }
        }

    
}