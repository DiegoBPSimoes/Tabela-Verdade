import java.util.Scanner;

import variaveis.Variavel;

public class run {
	public static Variavel v1, v2;
	static Scanner sc;
	public static String nomeTemp="";

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Informar o nome da primeira variavel");
		nomeTemp=sc.next();
		v1 = new Variavel(nomeTemp, 1);
		System.out.println("Informar o nome da segunda variavel");
		nomeTemp=sc.next();
		v2 = new Variavel(nomeTemp, 2);
		System.out.println("imprimindo " + v1.nome + ":");
		for (int i = 0; i < 4; i++) {

			System.out.println(" "+v1.valores[i]);

		}
		System.out.println("imprimindo " + v2.nome + ":");
		for (int i = 0; i < 4; i++) {

			System.out.println(" "+v2.valores[i]);

		}
		System.out.println("imprimindo tabela" );
		System.out.println(v1.nome+"|"+v2.nome +"|"+v1.nome+"U"+v2.nome+"|"+v1.nome+"^"+v2.nome+"|"+v1.nome+"->"+v2.nome+"|"+v1.nome+"<>"+v2.nome);
		
		for (int i = 0; i < 4; i++) {
			boolean implicacao=true, bicondicional=true;
			if(v2.valores[i]) {
				implicacao=true;
			}else {
				implicacao=false;
			}
			if(v2.valores[i]&&!v1.valores[i]) {
				bicondicional=true;
			}else {
				bicondicional=false;
			}
			System.out.println(v2.valores[i]+"|"+ v1.valores[i]+"|"+(v1.valores[i]||v2.valores[i])+"|"+(v1.valores[i]&&v2.valores[i])+"|"+implicacao+"|"+bicondicional);

		}
		sc.close();
	}
}
