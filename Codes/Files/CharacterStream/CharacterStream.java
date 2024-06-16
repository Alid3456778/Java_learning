import java.io.*;
public class CharacterStream{
    public static void main(String[] args){
        //System.out.println("HEllo");
        //data to be store in file
        String data="Something i want to insert";

        //data which is get from the file and store in this string 
        char[] arr=new char[100];
        try{
            //FileWriter is use to create varaiable which is use to put data and create a file
            FileWriter fo =new FileWriter("input.txt");
            //.write is use to put data in the file
            fo.write(data);
            System.out.println("Data has been sucesfully writen in filr");
            //.close() is use to Close the File
            fo.close();

            //FileReader is use to create a variable which can get data from file
            FileReader fi=new FileReader("output.txt");
            //.read is use to put data from file and put into the parameter
            fi.read(arr);
            System.out.println("Data is ");
            System.out.println(arr);
    }
    catch(Exception e){
        System.out.println("Error occure");
        System.out.println(e);
    }

    }
}