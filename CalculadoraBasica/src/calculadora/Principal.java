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
			case 1:
				System.out.println("Diga un número:");
				num1=Leer.datoDouble();
				System.out.println("Diga otro número:");
				num2=Leer.datoDouble();
				result=num1+num2;
				System.out.println("El resultado de la suma es "+result);
				break;
				
			case 2:
				System.out.println("Diga un número:");
				num1=Leer.datoDouble();
				System.out.println("Diga otro número:");
				num2=Leer.datoDouble();
				result=num1-num2;
				System.out.println("El resultado de la resta es "+result);
				break;
				
			case 3:
				System.out.println("Diga un número:");
				num1=Leer.datoDouble();
				System.out.println("Diga otro número:");
				num2=Leer.datoDouble();
				result=num1*num2;
				System.out.println("El resultado de la multiplicación es "+result);				
				break;
				
			case 4:
				System.out.println("Diga un número:");
				num1=Leer.datoDouble();
				System.out.println("Diga otro número:");
				num2=Leer.datoDouble();
				result=num1/num2;
				System.out.println("El resultado de la división es "+result);
				break;
				
			case 5:
				System.out.println("Diga un número:");
				num1=Leer.datoDouble();
				System.out.println("Diga otro número:");
				num2=Leer.datoDouble();
				result=num1%num2;
				System.out.println("El resto de la división es "+result);
				break;
			}
		}while(op!=0);

	}

}
