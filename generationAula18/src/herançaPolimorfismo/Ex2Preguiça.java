package herançaPolimorfismo;

/*2- Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/

public class Ex2Preguiça extends Ex1Animal {
	public Ex2Preguiça() {
		super("Preguiça");
	}

	// Subescrevendo os métodos
	@Override
	public void nome(String nomeBicho) {
		System.out.println("Nome: Preguisauro");
	}

	@Override
	public void idade(String idadeBicho) {
		System.out.println("Idade: 1000 anos");
	}

	@Override
	public void som(String somBicho) {
		System.out.println("Som: Preguiseia...?");
	}

	@Override
	public void atividade(String atividadeBicho) {
		System.out.println("Gosta de: Sobir em árvores");
	}

}
