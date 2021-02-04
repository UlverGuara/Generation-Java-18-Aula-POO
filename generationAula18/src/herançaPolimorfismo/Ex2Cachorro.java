package heran�aPolimorfismo;

/*2- Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.*/

public class Ex2Cachorro extends Ex1Animal {

	public Ex2Cachorro() {
		super("Cachorro");
	}

	// Subescrevendo os m�todos
	@Override
	public void nome(String nomeBicho) {
		System.out.println("Nome: Bisnaguinha");
	}

	@Override
	public void idade(String idadeBicho) {
		System.out.println("Idade: 5 anos");
	}

	@Override
	public void som(String somBicho) {
		System.out.println("Som: Latidos");
	}

	@Override
	public void atividade(String atividadeBicho) {
		System.out.println("Gosta de: Correr");
	}

}
