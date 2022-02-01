package application;

public class Cachorro extends animal {
	
	private String racaCachorro;
	
	public Cachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String racaCachorro) 
	{
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.racaCachorro = racaCachorro;
	}
	public void infoCachorro() {
		System.out.print(getNomeAnimal()+" tem "+getIdadeAnimal()+" anos, da raca "+racaCachorro);
		if(isEmiteSom()) {
			System.out.println(" e emite um latido ");
		} else {
			System.out.println(" e não Emite som ");
		}
		
		
	}
	public String getRacaCachorro() {
		return racaCachorro;
	}
	public void setRacaCachorro(String racaCachorro) {
		this.racaCachorro = racaCachorro;
	}
	

}
