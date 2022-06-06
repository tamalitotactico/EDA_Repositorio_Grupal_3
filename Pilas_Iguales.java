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

        

		while(true){
            //Hallar las alturas de cada pila
            Integer altura1 = sumarAlturas(pilaDeCilindros1);
            Integer altura2 = sumarAlturas(pilaDeCilindros2);
            Integer altura3 = sumarAlturas(pilaDeCilindros3);

            
            //Hallo el maximo de los tres
            Integer max = mayor(altura1, altura2);
            max = mayor(max, altura3);

            if(pilaDeCilindros1.getArray().length == 0 || pilaDeCilindros2.getArray().length == 0 || pilaDeCilindros3.getArray().length == 0){
                System.out.println("No hay altura maxima de las pilas");
                break;
            }
            if(max == altura1 && max == altura2 && max == altura3){
                System.out.println("La altura máxima de las pilas es " + max);
                break;
            }else{
                if(max == altura1){
                    pilaDeCilindros1.eliminarCilindro();
                    
                    continue;
                }
                if(max == altura2){
                    pilaDeCilindros2.eliminarCilindro();
                    
                    continue;
                }
                if(max == altura3){
                    pilaDeCilindros3.eliminarCilindro();
                }
            } 
        } 
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



    // Sumar las alturas de una pila en especiico
    public static <E> Integer sumarAlturas(Pila_Generica <Integer> pilaGenerica){
        Integer suma = 0;
        int i = 0 ; //Iterador
        
        while(pilaGenerica.getArray()[i] != null){
            suma = suma + pilaGenerica.getArray()[i];
            i++;
        }
        return suma;
    }

    public static Integer mayor(Integer a, Integer b){
        if(a > b){
            return a;
        }
        return b;
    }
}
