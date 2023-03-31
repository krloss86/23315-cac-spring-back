package ar.com.codoacodo.clase10.repaso;

public class Espanol implements IIdioma {

	@Override
	public void execute(String palabra) {
		System.out.println("Dice:" + palabra);
	}

}
