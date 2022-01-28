package application;

public class programVetores {

	public static void main(String[] args) {
		int n = 0;
		int [] numeros = new int [3];
		
		numeros[0] = 203;
		numeros[1] = 204;
		numeros[2] = 205;
		
		//System.out.println(numeros[2]);
		
		for(int x=0;x<=2;x++) {
			System.out.println("O valor de indice é: "+x+ " = "+numeros[x]);
		}
		
	}

}
