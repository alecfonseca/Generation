package application;

public class BichoPreguica extends animal {

	public BichoPreguica(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento) {
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		
		
	}
	public void infoBichoPreguica()
	{
		System.out.print(getNomeAnimal()+" é um Bicho preguiça que tem "+getIdadeAnimal()+" anos");
		if(isEmiteSom())
		{
			System.out.print(" e emite um Grunindo ");
		} else {
			System.out.print(" e não Emite som ");
		}
	}
	
	

}
