//creating Abstract Class and Abstract Methods 

//we have created a abstract class
abstract class Base{
    public void greeting(){
        System.out.println("helloo");
    }
    //abstract method // it contain no body
    public abstract void pet_me();
}

class B extends Base{
    public void fog_me(){
        System.out.println("saying me the  Fog");
    }
    public void pet_me(){
        System.out.println("I am saying me that pet me");
    }
}

 class C extends A{
    public void set_me(){
        System.out.println("saying set mee");
    }
}

class Abstract{
    public static void main(String[] agrs){
        //System.out.println("helloo");
        B obj1=new B();
        obj1.fog_me();
        obj1.pet_me();
    }
}