//try and catch mehtod
public class TryCatch{
    public static void main(String[] args){
        //System.out.println("HEllo");
        int num1=2345;
        int num2=5;
        //try act as an if statment for excption handling 
        //if the code is rright then try will execute the program
        //and of the try have some error then the flow shift to the catch 
        try{
        int div=num1/num2;
        System.out.println("Division is "+div);
        }
        //catch act as backup of try method 
        //whenever the try have an excption the catch code is going to be executed
        catch(Exception e){
            System.out.println("There is an error ");
            System.out.println(e);
        }
        System.out.println("Program Ends");
    }
}