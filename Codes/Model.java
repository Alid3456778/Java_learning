//(Title : New operator , This keyword , Static Keyword , fainaliza(not sure),Nested class , inner class , Anonmous inner class)
public class Model{
private int date=45;

/

class Car{
    void display(){
        System.out.println(date);
    }
    // public static void get_data(){
    //      System.out.println("succes");
    // }
}

//"static" is the keyword which is use to create variable , function and class but it only get static members
public  static void main(String[] args){

//"new" operator is use to create a object for class constructor and allocate the memory to initialize th eobject
    Model mod = new Model();

    Model.Car car = mod.new Car();
    car.display();

    // car.get_data();
}  

}