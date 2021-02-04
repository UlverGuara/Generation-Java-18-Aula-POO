package herançaPolimorfismo;

import java.util.Scanner;

public class Ex2Main {
	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {
			Ex2Cachorro cachorro = new Ex2Cachorro();
			Ex2Cavalo cavalo = new Ex2Cavalo();
			Ex2Preguiça preguiça = new Ex2Preguiça();

			Ex1Animal especie = null;

			int opcao = 0;
			System.out.println("Digite 1 para Cachorro, 2 para Cavalo ou 3 para Preguiça.");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				especie = cachorro;
				System.out.println(cachorro.getEspecie());
				cachorro.nome(null);
				cachorro.idade(null);
				cachorro.som(null);
				cachorro.atividade(null);
				break;
			case 2:
				especie = cavalo;
				System.out.println(cavalo.getEspecie());
				cavalo.nome(null);
				cavalo.idade(null);
				cavalo.som(null);
				cavalo.atividade(null);
				break;
			case 3:
				especie = preguiça;
				System.out.println(preguiça.getEspecie());
				preguiça.nome(null);
				preguiça.idade(null);
				preguiça.som(null);
				preguiça.atividade(null);
				break;

			default:
				System.out.println("Erro");

			}

		}

	}

}
