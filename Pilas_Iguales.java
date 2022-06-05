package Ejercicios;

import java.util.Scanner;

public class Pilas_Iguales {
	public static void main(String[] args) throws Exception {
		char resp;
		Scanner sc = new Scanner(System.in);
		Pila_Generica<Integer> pilaDeCilindros1=new Pila_Generica();
		Pila_Generica<Integer> pilaDeCilindros2=new Pila_Generica();
		Pila_Generica<Integer> pilaDeCilindros3=new Pila_Generica();
		System.out.println("Vamos a empezar por agregar cilindros a la primera pila.");
		do {
			System.out.println("¿Cual es la altura del cilindro?");
			pilaDeCilindros1.agregarCilindro(sc.nextInt());
			resp=pregunta("\nQuiere agregar otro cilindro?",sc);
		}while(resp !='n');
		System.out.println("Vamos a empezar por agregar cilindros a la segunda pila.");
		do {
			System.out.println("¿Cual es la altura del cilindro?");
			pilaDeCilindros2.agregarCilindro(sc.nextInt());
			resp=pregunta("\nQuiere agregar otro cilindro?",sc);
		}while(resp !='n');
		System.out.println("Vamos a empezar por agregar cilindros a la tercera pila.");
		do {
			System.out.println("¿Cual es la altura del cilindro?");
			pilaDeCilindros3.agregarCilindro(sc.nextInt());
			resp=pregunta("\nQuiere agregar otro cilindro?",sc);
		}while(resp !='n');
		System.out.println("h1"+pilaDeCilindros1);
		System.out.println("h2"+pilaDeCilindros2);
		System.out.println("h3"+pilaDeCilindros3);
		
		
	}
	public static char pregunta(String preg,Scanner teclado) {
        char resp;
        System.out.println(preg + " (s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while (resp != 's' && resp != 'n') {
            System.out.println("Error! solo se admite S o N");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
}
