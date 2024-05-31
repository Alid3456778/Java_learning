import java.util.Scanner;//scanner function //Use to get data from keybord  
import java.lang.Math;

public class Baic{
    public static void main (String[] arg){
    //premitive data Type
        //Integer is created with int data type
        int age=10;

        //long is use to create a integer with bigger capacity
        long  num=2324323;

        //to create a float data type we must use "F" at last to make a confermation that the following data is going to be the float 
        float num2=3.14F;

        //double is use for creating float in bigeer format
        double num3=2.4565654545;

        //cagr is used to create a varaible which consist of one letter
        char alphabat='A';

        //boolean is a data type which only have true or false value 
        boolean mature=false;

        //constant is created by "final" keyword adn there data type 
        //it cannot be change once its initialize
        final int cons=34;
        //cons=4;

    
    //------------------------------------------------------------------------------------------
    //non-primitive data type:


    //multi dimension array
        int [][] arr2={
            {23,3,2},
            {3,4,5},
            {34,5,4}
        };
    //so=ingle array
        int [] arr={11,2,3,4,4};

    //IF else statment
        if(age>18){
            mature=true;
        }
        else{
            mature=false;
        }

        //we use + to concate the writen data and variables
        // System.out.println("Integer number is "+age);
        // System.out.println("Long number is "+num);
        // System.out.println("Float Number is "+num2);
        // System.out.println("Double Number is "+num3);
        // System.out.println("Alphabat is "+alphabat);
        // System.out.println("Boolean value is "+mature);


        // System.out.println("Constant "+cons);


        // System.out.println("Array of 0 ="+arr[0]);
        // System.out.println("MultiDimension Array of 0 ="+arr2[0][0]);
        int i;

    //for loop
        // for(i=0;i<arr.length;i++){
        //     System.out.println("Array of "+i+" = "+arr[i]);
        // }



        // if(mature==true){
        //     System.out.println("You are mature");
        // }
        // else if(age<15 && age >7){
        //     System.out.println("You are a kid");
        // }
        // else{
        //     System.out.println("You are not mature");
        // }

    

        //string is use to create a string or collection on words
        String name=new String();//new is use to create a empty string
        // name = "alid";
        // System.out.println(name);

        //it consist of many other various function 
        //the changes is not store in the orignal string if we want to store we simple have to create an another string

        //1.length(); -- to find the length of string
        //     System.out.println(name.length());
        //2.charAt(index); -- to find what word at that index
        //     System.out.println(name.charAt(0));
        //3.toUpperCase() -- convert the string it to upper case
        //     System.out.println(name.toUpperCase());
        //4.toLowerCase() -- convert the string it to lower case
        //     System.out.println(name.toLowerCase());


    //builtin models are some module which is use to add some funtion in program
    //A) java.lang
    //B) java.util have multiple function some are 


        //1.scanner

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your name : ");
        // String name2=scanner.nextLine();//the .nextLine is use to get everything from the next line
        //                                 //it is directly gettign in num2 
        // System.out.println("Name is "+name2);


        //2.math

             double a,b;
            //  System.out.println("Enter first number : ");
            //  a=scanner.nextInt();
            //  System.out.println("Enter second number : ");
            //  b=scanner.nextInt();

            //  System.out.println("Square root of first number is "+Math.sqrt(a));//sqrt is use to fing square root of number
        
            //  double c=Math.pow(a,b);//to find the power of the given number
            //  System.out.println("Power of first number is "+c);

        // 3.date
        // 4.random


    }
}