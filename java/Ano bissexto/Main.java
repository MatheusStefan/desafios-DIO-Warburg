import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;
    
        ano = ent.nextInt();
        if(ano % 4 == 0) {
          System.out.println("Bissexto");
        } else {
          System.out.println("Nao Bissexto");
        }
        
        //TODO: Descubra se o ano é bissexto ou não

    }
}