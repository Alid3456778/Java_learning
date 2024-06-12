//highrarchical inheritance , method overloading in inheritance ,final keyword 
class Animal{
String catogri;
String sound;
public Animal(String catogri){
    this.catogri=catogri;
}

//it cannot be override by any other method in sub class
//and if try to override it will throw error
public final void display_animal(){
    System.out.println("Animal Catogri is "+catogri);
} 

}
class Dog extends Animal{
    int age;
    public Dog(String voic,String catogri){
        super(catogri);
            sound=voic;
    }

    public  void display_ani(){
        System.out.println("Animal is "+super.catogri);
    }

    public void dog_display(){
        display_animal();
        System.out.println("Animal Voice : "+sound);
    }

    public void dog_display(int age){
        display_animal();
        this.age=age;
        System.out.println("Animal Voice : "+sound);
        System.out.println("Animal Age : "+age);
    }

}
class Cat extends Animal{
    int age;
   public Cat(String voic,String catogri){
        super(catogri);
            sound=voic;
    }

    public void cat_display(){
        display_animal();
        System.out.println("Animal Voice : "+sound);
    }

    public void cat_display(int age){
        display_animal();
        System.out.println("Animal Voice : "+sound);
        System.out.println("Animal Age : "+age);
    }
}

public class start{
    public static void main (String[] args){
        Dog my_dog= new Dog("bark","pet");
        // my_dog.dog_display(5);
        // Cat my_cat = new Cat("meow","pet");
        // my_cat.cat_display();
        my_dog.display_ani();
    }

}