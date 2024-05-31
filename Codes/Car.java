//class is created 
public class Car{
    int date=0000;
    String model="None";
    int num=0;
    //An cosntructor in created
    public Car(int x,String name){
        date=x;
        model=name.toUpperCase();
        
    }


    //Constructory Overloading 
    // public Car(int x){
    //     date=x;    
    // }

    // public Car(String name){
    //     model=name;
    // }

    // public Car(int x,String name){
    //     date=x;
    //     model=name.toUpperCase();
    // }


    //Method is Created
    public void display(){
        System.out.println("Date: "+date);
        System.out.println("Model: "+model);
    }

    //Method Overloading 
    public void display(int x){
        num++;
        System.out.println("No of Car : "+num);
        System.out.println("Date: "+date);
        System.out.println("Model: "+model);
    }

    public static void main(String[] arg){
        // Car car2=new Car(1990);
        // Car car=new Car("Audu");
        Car car3=new Car(1920,"BMW");
        //car.display();
        //car2.display();

        //creating a object Reference
        Car car0=car3;

        car0.display(1);
         car0.display(2);
    }
}