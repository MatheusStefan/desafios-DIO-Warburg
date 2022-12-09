import java.util.Scanner;

public class Main {

  public static void main(String[] Args) {

   Scanner sc = new Scanner(System.in);
   double tmhMB = sc.nextFloat();
   double tmhMbps = sc.nextFloat();

   //TODO: Calcule o tempo aproximado de download:
    double tempo = (tmhMB / tmhMbps) / 60;
    System.out.printf("%.2f",tempo);

   //TODO: Imprima o calculo do tempo, leve em consideração que a saída é um numero com duas casas decimais:       
    
    }
}