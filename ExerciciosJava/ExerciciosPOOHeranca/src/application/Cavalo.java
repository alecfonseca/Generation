package application;

public class Cavalo extends animal{
	
		private String corCavalo; 

		public Cavalo(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String corCavalo) 
		{
			super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
			this.corCavalo = corCavalo;
		
	}
		public void infoCavalo() 
		{
			System.out.print(getNomeAnimal()+" é um cavalo que tem "+getIdadeAnimal()+" anos, da cor "+corCavalo);
			if(isEmiteSom())
			{
				System.out.print(" e emite um relinchar ");
			} else {
				System.out.print(" e não Emite som ");
			}
				
				
			}
				
		public String getCorCavalo() {
			return corCavalo;
		}

		public void setCorCavalo(String corCavalo) {
			this.corCavalo = corCavalo;
		

		}
}
