public class Test {
	
	public static void main(String[]args){
		
		QueueArray<Integer> cola = new QueueArray<Integer>(5);
		cola.add(5);
		System.out.println(cola);
		cola.add(-1);
		cola.add(49);
		cola.add(2);
		System.out.println(cola);
		System.out.println("El primero en cola es: " + cola.peek() + "\n");
		cola.remove();
		cola.remove();
		System.out.println(cola);
		System.out.println("El primero en cola es: " + cola.peek() + "\n");
		System.out.println("Se elimino el elemento: " + cola.poll() + "\n");
		System.out.println(cola);
		System.out.println("Se elimino el elemento: " + cola.poll() + "\n");
		System.out.println(cola);
		System.out.println("Se elimino el elemento: " + cola.poll() + "\n");
		System.out.println(cola);
		
	}

}
