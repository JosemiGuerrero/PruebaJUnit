package pruebaJUnit;

public class Calculadora {
		
	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		
		this.num1 = a;
		this.num2 = b;
	}
	
	public int suma() {
		
		int res = num1 + num2;
		return res;
	}
	
	public int resta() {
		
		int res = num1 - num2;
		return res;
	}
	
	public int multiplicacion() {
		
		int res = num1 * num2;
		return res;
	}
	
	public double division() {
		
		double res = (double) num1 / num2;
		return res;
	}
	
	public double division0() {
		
		double res;
		
		if(num2 == 0) {
			
			throw new ArithmeticException("Division entre 0");
		}
		
		res =num1/num2;
		return res;
	}
}