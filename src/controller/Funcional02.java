package controller;

public class Funcional02 {
	public Funcional02() {
		super();
	}
	
	int quociente = 0;
	
	public int dividePorSubtracao(int dividendo, int divisor) {
		
		if (dividendo < divisor) {

			return quociente;
		} else { // quando o divisor é maior ou igual
			dividendo = dividendo - divisor;
			quociente = quociente + 1;
			return dividePorSubtracao(dividendo, divisor);
		}
	}
}


/*
 * Criar uma função recursiva
 * que receba o dividendo e o divisor de uma operação de divisão
 * e, por subtrações,
 * exiba o resto da divisão.
*/
