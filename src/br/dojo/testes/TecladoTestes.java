package br.dojo.testes;

import org.junit.Assert;
import org.junit.Test;
import br.dojo.teclado.Celular;

public class TecladoTestes {
	@Test
	public void existenciaClasse(){
		Celular cel = new Celular();
		Assert.assertNotNull(cel);
	}
	
	@Test
	public void testaCharA(){
		Celular cel = new Celular();
		Assert.assertEquals('a', cel.getCaracter("2"));
	}
	
	@Test
	public void testaCharB(){
		Celular cel = new Celular();
		Assert.assertEquals('b', cel.getCaracter("22"));
	}
	@Test
	public void testaCharC(){
		Celular cel = new Celular();
		Assert.assertEquals('c', cel.getCaracter("222"));
	} 
	@Test
	public void testaCharD(){
		Celular cel = new Celular();
		Assert.assertEquals('d',cel.getCaracter("3"));
		
	}
	@Test
	public void testTextoBD(){
		Celular cel = new Celular();
		Assert.assertEquals("bd", cel.getText("223"));
	}
	@Test
	public void testTextoCCFAD(){
		Celular cel = new Celular();
		Assert.assertEquals("ccfad", 
				cel.getText("222_22233323"));
	}
	
}
