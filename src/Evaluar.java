import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {

	@Test
	public void obtenerValor() {
		int arr[]={1,2,3};
		int arr2[]={10,20,30,40};
		assertEquals("Error ejecutando obtenerValor({1,2,3},1)", 2, Ejercicios.obtenerValor(arr,1));
		assertEquals("Error ejecutando obtenerValor({10,20,30,40},3)", 40, Ejercicios.obtenerValor(arr2,3));
	}
	
	@Test
	public void obtenerValor2() {
		String arr[]={"1","2","3"};
		String arr2[]={"10","20","30","40"};
		assertEquals("Error ejecutando obtenerValor(arr,1)", "2", Ejercicios.obtenerValor(arr,1));
		assertEquals("Error ejecutando obtenerValor(arr2,3)", "40", Ejercicios.obtenerValor(arr2,3));
	}
	
	@Test
	public void obtenerSuma() {
		int arr[]={1,2,3};
		int arr2[]={10,20,30,40};
		assertEquals("Error ejecutando obtenerSuma({1,2,3})", 6, Ejercicios.obtenerSuma(arr));
		assertEquals("Error ejecutando obtenerSuma({10,20,30,40})", 100, Ejercicios.obtenerSuma(arr2));
	}
	
	@Test
	public void obtenerPromedio() {
		int arr[]={1,2,3};
		int arr2[]={10,20,30,40};
		assertEquals("Error ejecutando obtenerPromedio({1,2,3})", 2, Ejercicios.obtenerPromedio(arr));
		assertEquals("Error ejecutando obtenerPromedio({10,20,30,40})t", 25, Ejercicios.obtenerPromedio(arr2));
	}
	
	@Test
	public void existe() {
		char arr[]={'1','2','3'};
		char arr2[]={'1','2','3','4'};
		assertEquals("Error ejecutando existe({'1','2','3'},'1')", true, Ejercicios.existe(arr,'1'));
		assertEquals("Error ejecutando existe({'1','2','3'},'4')", false, Ejercicios.existe(arr,'4'));
		assertEquals("Error ejecutando existe({'1','2','3','4'},'1')", true, Ejercicios.existe(arr2,'1'));
		assertEquals("Error ejecutando existe({'1','2','3','4'},'4')", true, Ejercicios.existe(arr2,'4'));
		assertEquals("Error ejecutando existe({'1','2','3','4'},'5')", false, Ejercicios.existe(arr2,'5'));
	}
	
	@Test
	public void existe2() {
		String arr[]={"1","2","3"};
		String arr2[]={"1","2","3","4"};
		assertEquals("Error ejecutando existe({'1','2','3'},'1')", true, Ejercicios.existe(arr,"1"));
		assertEquals("Error ejecutando existe({'1','2','3'},'4')", false, Ejercicios.existe(arr,"4"));
		assertEquals("Error ejecutando existe({'1','2','3','4'},'1')", true, Ejercicios.existe(arr2,"1"));
		assertEquals("Error ejecutando existe({'1','2','3','4'},'4')", true, Ejercicios.existe(arr2,"4"));
		assertEquals("Error ejecutando existe({'1','2','3','4'},'5')", false, Ejercicios.existe(arr2,"5"));
	}

}
