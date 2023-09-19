package curso.poo;

import java.util.Locale;
import java.util.Scanner;

import curso.poo.entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = entrada.nextLine();
		System.out.print("Preço: ");
		produto.preco = entrada.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = entrada.nextInt();
		
		System.out.println("Dados do produto: " + produto);
		System.out.println("Insira quantos produtos serão adicionados: ");
		int quantidade = entrada.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println("Dados atualizados do produto: " + produto);
		System.out.println("Quantidade de produtos a serem removidos do estoque: ");
		quantidade = entrada.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println("Dados atualizados do produto: " + produto);

		entrada.close();
	}

}
