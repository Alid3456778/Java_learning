class Area{
    void area(int r){
        System.out.println("Circle Area is "+(3.14*r*r));
    }
    int area(int l,int w){
        //System.out.println("Rectangle Area is "+(l*w));
        return l*w;
    }
    double area(double b,double h){
        //System.out.println("Trangle Area is "+());
        return 0.5*b*h;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Area a = new Area();
        a.area(3);
        System.out.println(  a.area(45, 5));
        System.out.println(a.area(4.8,6.9));
    }
}
