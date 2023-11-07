package curso.tratarexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaExcecoes {

	public static void main(String[] args) {
		
		programa1();
		programa2();
		
		System.out.println("Fim do programa");
		
	}
	
	public static void programa1() {
		System.out.println("Início do primeiro programa ");
		
	}
	public static void programa2(){
		
		System.out.println("Início do segundo programa");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vet = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vet[posicao]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e){
			System.out.println("Erro de input");
		}
		
		sc.close();
		System.out.println("Fim do segundo programa");
		System.out.println("Fim do primeiro programa");
	}
}
