class calculate{
    void cone(){
        int r=3,l=6,h=8
        ;
        double area = 3.14*r*(r+l);
        System.out.println("Area of Cone is "+area);
        double volume = (1/3)*3.14*r*r*h;
        System.out.println("Volume of Cone is "+volume);

    }
    void cylinder(){
        int r=3,l=6,h=6;
        double area = 2*3.14*r*(r+l);
        System.out.println("Area of Cylinder is "+area);
        double volume = 3.14*r*r*h;
        System.out.println("Volume of Cylinder is "+volume);
        
    }
}
public class Q20 {
    public static void main(String[] args) {
        calculate c = new calculate();
        c.cone();
        c.cylinder();

    
    }
}
