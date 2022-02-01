package application;

public class testeAnimais {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro("Theo", 2, true, "corre", "pitbull");
		Cavalo cav1 = new Cavalo("George", 7, true, "corre", "Preto");
		BichoPreguica bp = new BichoPreguica("Fred", 3, false, "anda");
		
		dog1.infoCachorro();
		System.out.println("\n\n");
		cav1.infoCavalo();
		System.out.println("\n\n");
		bp.infoBichoPreguica();
		
		

	}

}
