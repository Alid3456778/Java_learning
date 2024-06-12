import java.util.*;

public class ListIteration{
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        int n,i;
        String name;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        for(i=0;i<n;i++){
            name=scan.next();
            obj.add(name);
        }
    }
}