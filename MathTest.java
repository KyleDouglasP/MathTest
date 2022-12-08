import java.util.Scanner;

public class MathTest {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many problems: ");
        int n=scan.nextInt();
        int correct = 0;
        for (int i=0; i<n; i++){
            int x=(int)(Math.random()*10);
            int y=(int)(Math.random()*10);
            System.out.print("What is " + x + " + " + y + "? ");
            int z = scan.nextInt();
            if (z==x+y) correct++;
        }
        if (n==correct){ 
            System.out.println("Congrats!");
        }
        System.out.println(correct + " out of " + n + " correct.");
    }
}
