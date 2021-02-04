package heran�aPolimorfismo;

/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

//Cria��o da classe abstrata
public abstract class Ex1Animal {
	private String especie;

	// Construtor
	public Ex1Animal(String especie) {
		this.especie = especie;
	}

	// Cria��o dos m�todos Abstratos
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
