//File Class

// 1.createNewFile() It atomically creates a new, empty file named by this abstract 
// pathname if and only if a file with this name does not yet exist. 
// 2.canWrite() It tests whether the application can modify the file denoted by this 
// abstract pathname.String[] 
// 3.canRead() It tests whether the application can read the file denoted by this 
// abstract pathname.
// 4.sFile() It tests whether the file denoted by this abstract pathname is a normal 
// file. 
// 5.getName() It returns the name of the file or directory denoted by this abstract 
// pathname. 
// 6.getParent() It returns the pathname string of this abstract pathname's parent, or 
// null if this pathname does not name a parent directory. 
// 7.toPath() It returns a java.nio.file.Path object constructed from the this abstract 
// path. 
// 8.listFiles() It returns an array of abstract pathnames denoting the files in the 
// directory denoted by this abstract pathname


import java.io.*;
public class Fileclass{
    public static void main(String[] args){
        //System.out.println("Hello");
        File file=new  File("CreateNew.txt");
        // try{
        // //its to create a new File 
        // if(file.createNewFile()){
        //     System.out.println("Sucssfully Created file");
        // }
        // else{
        //      System.out.println("Error at Created file");
        // } 
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }


        //use to Delete the file
        // if(file.delete()){
        //     System.out.println("Sucssfully deleted file");
        // }
        // else{
        //      System.out.println("Error at Deleting file");
        // }
        

        
        //for information
            System.out.println("Name of file is :"+file.getName()+" Size is :"+file.length()+" File Status :"+file.isHidden()+" Can Write :"+file.canWrite());
       


    }
}