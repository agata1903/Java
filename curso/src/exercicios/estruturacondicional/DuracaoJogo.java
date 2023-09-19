package exercicios.estruturacondicional;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a hora inicial do jogo:");
		int horaInicial = entrada.nextInt();
		
		System.out.println("Digite a hora final do jogo");
		int horaFinal = entrada.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		entrada.close();
			}
	}

