// faça um programa que escreva cada letra da palavra
//  em forma de escada
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String palavra = sc.next();
		String letra = "";
		int i;
		
		for (i = 0; i <= palavra.length() -1; i++) {
			letra+=palavra.charAt(i);
			System.out.println(letra);}
	}
}