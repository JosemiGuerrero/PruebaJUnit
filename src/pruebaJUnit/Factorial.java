package pruebaJUnit;

public class Factorial { 
	
	public static int calculo(int n) {

		if (n < 0) {
			
			throw new IllegalArgumentException("N�mero " + n + " no puede ser < 0");
		}
		
		int fact = 1;
		
		for (int i = 2; i <= n; i++)
			fact *= i;
		
		if (fact < 0) {
			
			throw new ArithmeticException("Overflow, n�mero " + n + " demasiado grande");
		}
		
		return fact;
	}
	
	public static void mensajeNoNulo(String cadena) {
		
		System.out.print(cadena);
	}
    
	public static boolean compara(String c) {
		
		if(c.equals("Correcto")) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public static void main(String[] args) {
		
//		System.out.println(calculo(7)); //5040
//		System.out.println(calculo(5)); //120
//		System.out.println(calculo(3)); //6
		
		
		//System.out.println(calculo(-7)); //IllegalArgumentException
		//System.out.println(calculo(-1)); //IllegalArgumentException
		
		//System.out.println(calculo(20)); //error ArithmeticException
		//System.out.println(calculo(18)); //error ArithmeticException		
	}
}
