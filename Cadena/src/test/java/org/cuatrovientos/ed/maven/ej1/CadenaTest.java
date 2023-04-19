package org.cuatrovientos.ed.maven.ej1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaTest {

	@Test
	public void testLongitud() {
		Cadena palabra = new Cadena();
		int expected = 9;
		int actual = palabra.longitud("asñdlkfj ");
		assertEquals("Fallo en el método longitud", expected, actual);
	}
	@Test
	public void testLongitudd() {
		Cadena palabra = new Cadena();
		int expected = 56;
		int actual = palabra.longitud("     ");
		assertEquals("Fallo en el método longitud", expected, actual);
	}
	@Test
	public void testVocales() {
		Cadena palabra= new Cadena();
		int expected = 11;
		int actual = palabra.vocales("Que Me Vas A Contar A Mi Chupabufa"); 
		assertEquals("Fallo en el método vocales", expected, actual);
	}
	@Test
	public void testVocaless() {
		Cadena palabra= new Cadena();
		int expected = 0;
		int actual = palabra.vocales("          ASDFAaSDFASDFVAPOEWFKS"); 
		assertEquals("Fallo en el método vocales", expected, actual);
	}
	@Test
	public void testInvertir() {
		Cadena palabra = new Cadena();
		String expected = "opaC ojoR";
		String actual = palabra.invertir("Rojo Capo");
		assertEquals("Fallo en el método invertir", expected, actual);
	}
	
	@Test
	public void testInvertirr() {
		Cadena palabra = new Cadena();
		String expected = "    ,      ";
		String actual = palabra.invertir("       ,    ");
		assertEquals("Fallo en el método invertir", expected, actual);
	}
	
	@Test
	public void testContarLetra() {
		Cadena palabra = new Cadena();
		int expected = 5;
		int actual = palabra.contarLetra("Dime keloke que brilla con to mi pana e", 'e');
		assertEquals("Fallo en el método contar letra", expected, actual);
	}
	
	@Test
	public void testContarLetraa() {
		Cadena palabra = new Cadena();
		int expected = 5;
		int actual = palabra.contarLetra("", 'e');
		assertEquals("Fallo en el método contar letra", expected, actual);
	}
	
	
	
}
