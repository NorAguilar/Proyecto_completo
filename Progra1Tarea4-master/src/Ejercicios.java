
public class Ejercicios {
	
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{
		int r =arreglo[posicion];
		return r;
	}
	
	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
		String h=arreglo[posicion];
		return h;
	}
	
	//Devuelve la suma de todos los elementos del arreglo
	static int obtenerSuma(int arreglo[])
	{
		int suma=0;
		for(int x=0; x<arreglo.length;x++){
		suma+=arreglo[x];
		}
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos del arreglo
	static int obtenerPromedio(int arreglo[])
	{
		int prome=0, suma=0;
		int lon=arreglo.length;
		for(int i=0;i<lon;i++){
			suma+=arreglo[i];
			
			
		}
		prome=suma/lon;
		
		return prome;
	}
	
	//Devuelve true si valor esta 
	static boolean existe(char arreglo[], char valor)
	{
		for(int i=0;i<arreglo.length;i++){
			if(valor==arreglo[i]){
				return true;
		}
		}
		return false;
	}
		
	//Devuelve true si valor esta 
	static boolean existe(String arreglo[], String valor)
	{
		for(int i=0; i<arreglo.length;i++){
			if(valor.equals(arreglo[i])){
				return true;
				
			}
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
