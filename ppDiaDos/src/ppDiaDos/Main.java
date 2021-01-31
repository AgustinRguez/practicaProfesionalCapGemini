package ppDiaDos;

import java.util.ArrayList;


//import java.util.Scanner;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		/*System.out.println("Ingrese una nota"); //ej 2
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		do
		{
			if(nota >= 0 && nota <= 50 ) {
				System.out.println("Suspendiste");
				break;
			}
				
			else if(nota >= 51 && nota <=75) {
				System.out.println("Recuperatorio");
				break;
			}
			
			else if(nota >= 76 && nota <= 90) {
				System.out.println("Aprobado");
				break;
			}
			else if(nota >=91 && nota <=100){
				System.out.println("Aprobado con creces");
				break;
			}
			
			else {
				System.out.println("puntuacion invalida");	
			}
		}while(nota>= 0 && nota<= 100);*/

	//---------------------------------------------------------------------------------------
		Pila p = new Pila(); //ej 4
		Object obj = new Object();
		ArrayList objetoArray = new ArrayList();
		
		p.peek(obj);
		
		p.push(100);
		
		p.push(200);
		
		p.push(1000);
		
		p.peek(obj);
		
		p.pop(obj);
		
		p.mostrar();
		
		p.reverse(objetoArray);
	}

}
