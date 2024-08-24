public class Q4 {
    static int sum=0;
    public static void main(String[] args) {
        
        int num = 153;
        
        int tem = num;
        while(num>0) {
            int rem = num%10;
            sum = sum + rem*rem*rem;
            num = num/10;
            }
           // System.out.println(tem+" "+sum);
            if(tem == sum){
                System.out.println("Armstrong Number");
            }

    }
}
