import java.util.Scanner;

public class fibonaucci{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int n1=0;
            System.out.println(n1);
      
            int n2=1;
             System.out.println(n2);
            int i;
            for(i=1;i<=n;i++){
                int n3;
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.println(n3 );
            }
        }
    }
}