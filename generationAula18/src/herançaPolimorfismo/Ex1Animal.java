package herançaPolimorfismo;

/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

//Criação da classe abstrata
public abstract class Ex1Animal {
	private String especie;

	// Construtor
	public Ex1Animal(String especie) {
		this.especie = especie;
	}

	// Criação dos métodos Abstratos
	abstract public void nome(String nomeBicho);

	abstract public void idade(String idadeBicho);

	abstract public void som(String somBicho);

	abstract public void atividade(String atividadeBicho);

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
