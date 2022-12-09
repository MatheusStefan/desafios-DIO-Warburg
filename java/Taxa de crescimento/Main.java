import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double A, B;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
               
        int anos = 0;

        while(A <= B) {
          A+= A * 0.03;
          B+= B * 0.015;
          anos++;
        }
        
        System.out.println(anos + " anos");
    }
}