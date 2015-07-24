
/*unit testing
 * Junit
 */

public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		int sumar=x+y;
		return sumar;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int restar=x-y;
		return restar;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int multi=x*y;
		return multi;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int div=x%y;
		return div;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
		if (x%2==0){
		return true;
		}else{
		return false;
		}
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		if(x%1==0 && x%3==0){
			return true;
		}else{
		return false;
		}
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		int mayor=x;
		if(y>x){
			mayor=y;
			return mayor;
		}
		return mayor;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		if(edad>=18){
			return true;
		}else{
			return false;	
		}
		
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		if(x%2==0 && y%2==0  && z%2==0){
			return true;
		}
		return false;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		int mayor=x;
		if(y>z && y>x){
			mayor=y;
		return mayor;
			
		}
		else if(z>y && z>x){
			mayor=z;
			return mayor;
		}
		return mayor;
	}
	
	public static void main(String[] args)
	{
		
	}

}
