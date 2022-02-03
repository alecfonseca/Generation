package etities;

public abstract class ClasseAbs {
		
	private String especie; // declarando atributo

	public ClasseAbs(String especie) { // declarando metodo construtor
		this.especie = especie;
	}

	abstract public void som(double quantidade);// declarando metodo abstrato=é um contrato para a filha seguir

	public String getEspecie() { // declarando getters
		return especie;
	}

	public void setEspecie(String especie) { // declarando setters
		this.especie = especie;
	}

}
