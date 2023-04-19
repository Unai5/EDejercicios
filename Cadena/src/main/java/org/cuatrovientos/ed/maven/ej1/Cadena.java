package org.cuatrovientos.ed.maven.ej1;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		char caracteres[] = {'a', 'e', 'i', 'o', 'u'};
		int numVocales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < caracteres.length; j++) {
				if (caracteres[i] == cadena.charAt(i)) {
					numVocales+=1;
				}				
			}
		}
		return numVocales;
	}
	
	public String invertir(String cadena) {
		String resultado = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		return resultado;
	}
	
	public int contarLetra(String cadena, char letra) {
		int numApariciones = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)==letra) {
				numApariciones +=1;
			}
		}
		return numApariciones;
	}
	
	
	
	
	
}
