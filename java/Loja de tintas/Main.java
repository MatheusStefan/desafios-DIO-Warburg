

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int areaCoberta = sc.nextInt();
		double litros = (areaCoberta / 6);
		double sobraLatas = ((litros % 18.00) > 0 ? 1 : 0);
		double quantidadeLatas = (int)(litros / 18.00) + sobraLatas;
		double sobraGaloes = ((litros % 3.6) > 0 ? 1 : 0);
		double quantidadeGaloes = (int)(litros / 3.6) + sobraGaloes;
		double valorLata = 80.00 * quantidadeLatas; 
		double valorGalao = 25.00 * quantidadeGaloes;
		
		System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int)quantidadeLatas + " no valor R$ "  + valorLata);
	    System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int)quantidadeGaloes + " no valor R$ "  + valorGalao);
	}
}
