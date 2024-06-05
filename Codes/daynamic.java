//Daynamic dispatch method or also called as run time polymorphism 
//its object is created in run time 

class Phone{
public void ring(){
    System.out.println("TU tu");
}   
public void display(){
    System.out.println("Say hello to me");
}

}

class SmartPhone extends Phone{

public void screen(){
    System.out.println("i have touch screeen ");
}

//overriding
public void ring(){
    System.out.println("I phone huuu nokeya nahi");
}

}

class daynamic{
    public static void main(String[] args){
        //while creating an object we created in a way where it gets both super class and sub class name 
        //but it only gets the smartphone value 
        //because the new object is gona be the SmartPhone 
        Phone samsung=new SmartPhone();
        // samsung.ring();
        samsung.display();
    }
}