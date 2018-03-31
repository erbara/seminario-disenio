import org.junit.Assert;
import org.junit.Test;  



public class PrendaTest{
	
	@Test
	public void validarNombreFancy() {
		Prenda pantalon = new Prenda("pantalon");
	
		Assert.assertEquals (
				"super duper pantalon",
				pantalon.nombreFancy() );
		//el assert es  a ORG.JUNIT, nunca la primera que aparece
		
	}
	
	
}