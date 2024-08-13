package view;

import controller.Funcional02;

public class Principal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcional02 funcional = new Funcional02();
		
		int a = 25;
		int b = 5;
		
		if(a > b) {
			System.out.println("Resultado esperado => " + a / b);
			int resultado = funcional.dividePorSubtracao(a, b);
			System.out.println("Resultado alcançado => " + resultado);
		} else {
			System.out.println("O dividendo deve ser maior que o divisor para realizar o cálculo.");
		}
		
		
	}

}
