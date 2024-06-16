import java.util.*;
    class UserDefineException extends Exception{
        public UserDefineException (String src){
            super(src);
        }
    }

    class MathsException extends Exception {
        public MathsException(int num) {
        System.out.println("HAve an Error");
        }
    }

public class ThrowWala{



    public static void main (String[] args){
        //System.out.println("HEllo");
        int a=5;
        // try{
        //     throw new UserDefineException("Its my User Define Exception");
        // }
        // catch(UserDefineException e){
        //     System.out.println("Caught My Exception : "+e.getMessage());
        // }

        if(a<9){
            try{
                throw new MathsException(a);
            }
            catch(MathsException e){
                System.out.println("Ct basaught Maths Exception");
                }
                
            
        }
        else{
            System.out.println("It is not an error");
        }
    }
}