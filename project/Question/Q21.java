public class Q21 {
    public static void main(String[] args) {
    int f1=0,f2=1;
    for(int i=0;i<5;i++){
        System.out.print(f1+" ");
        int temp=f1+f2;
        f1=f2;
        f2=temp;
    }
    }
}
