package calculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		double num1, num2, result;
		
		do {
			System.out.println("""
					Seleccione una opción:
						1. Sumar +
						2. Restar -
						3. Multiplicar *
						4. Dividir /
						5. Resto %
					""");
			op=Leer.datoInt();
			switch(op) {
			
			}
		}while(op!=0);

	}

}
