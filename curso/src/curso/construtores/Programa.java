package curso.construtores;

import java.util.Locale;
import java.util.Scanner;

import curso.construtores.entidades.Produto;

public class Programa {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Insira os dados do produto: ");
			System.out.print("Nome: ");
			String nome = entrada.nextLine();
			System.out.print("Preço: ");
			double preco = entrada.nextDouble();
			Produto produto = new Produto(nome, preco);
			
			produto.setNome("Computador");
			
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

