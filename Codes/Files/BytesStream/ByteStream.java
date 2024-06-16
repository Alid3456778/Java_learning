import java.io.*;
public class ByteStream{
public static void main (String args[]) throws Exception 
 { 
 int b; 
 FileInputStream fin=new FileInputStream (args[0]); 
 while((b=fin.read())!=-1) 
 { 
 System.out.print ((char)b); 
 } 
 fin.close(); 
 } 

}