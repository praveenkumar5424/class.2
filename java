import java.util.Scanner;
public class year {
    public static void main(String[] args){
        Scanner Kbd=new Scanner(System.in);
        int year=Kbd.nextInt();
        if(year%400==0 || year%100!=0&&year%4==0)
        System.out.println("leap year");
        else
        System.out.println("non leap year");
    } 
}


import java.util.Scanner;
public class thrid1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        for( int row=1; row<=n;row++){
            for(int col=1; col<=row;col++)
            System.out.print("*");
            System.out.println();
    }
}
}


public class ConcatenationExample {
    public static void fifteen (String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = part1 + " " + part2; // Concatenation
        System.out.println(result); // Output: Hello World
    }
}


public class cond1
{
    public static void main(String[]args)
    {
        int i=1;
       //hile(i<10)
        System.out.println(i); }
}


import java.util.Scanner;
public class cont {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n =scan.nextInt();
        int i=n;
    while(i>=1);
      {
        System.out.print(i+" ");
        i--;
      }      
    }
    }
    

public class cont1 {
    public static void main(String[] args) {
        // Scanner scan =new Scanner(system.in)
        //char n = scan.next().charAt(0);
        for(char i='A';i<='z';i++){
            System.out.print(i+" ");
        }
    } 
}
