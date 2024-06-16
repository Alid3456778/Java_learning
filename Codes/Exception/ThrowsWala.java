import java.io.*;

class Modif{
    //we have createed a method which contain an Throws Exception which is to denite that it might give you a error 
    //so put it in try and catch
    //if this method have any exception the try will catch it
   public void metho() throws IOException{
        //throw new IOException("device Error");
        System.out.println("inside of method of throws");
    }
}

public class ThrowsWala{

    public static void main(String[] args){
        //System.out.println("Helllo");
        Modif m = new Modif();
        try{
        m.metho();
        }
        catch(Exception e){
            System.out.println("Exception occure "+e);
        }

        System.out.println("End of program");
    }
}