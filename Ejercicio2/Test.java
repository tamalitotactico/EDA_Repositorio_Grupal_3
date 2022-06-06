public class Test {
    public static void main(String[] args) {
        Stack<String> pila1 = new Pila<String>(7);

        if (pila1.empty())
            System.out.println("La pila está vacía");
        else
            System.out.println("La pila NO está vacía");

        pila1.push("César");
        System.out.println("Elemento agregado, el tope ahora es: " + pila1.peek());
        pila1.push("Jean");
        System.out.println("Elemento agregado, el tope ahora es: " + pila1.peek());
        pila1.push("Josue");
        System.out.println("Elemento agregado, el tope ahora es: " + pila1.peek());
        pila1.push("Richard");
        System.out.println("Elemento agregado, el tope ahora es: " + pila1.peek());
        pila1.push("Alfredo");
        System.out.println("Elemento agregado, el tope ahora es: " + pila1.peek());
        pila1.push("Gustavo");
        System.out.println("Elemento agregado, el tope ahora es: " + pila1.peek());
        pila1.push("Daniel");
        System.out.println("Elemento agregado, el tope ahora es: " + pila1.peek());
        pila1.push("Matías"); // <-- No se debe agregar porque la pila está llena

        if (pila1.empty())
            System.out.println("La pila está vacía");
        else
            System.out.println("La pila NO está vacía");

        System.out.println("El elemento tope actual es: " + pila1.peek());
        System.out.println("El elemento 'Jean' está en la posición: " + pila1.search("Richard")); // <--Buscamos
                                                                                                  // 'Richard' en la
                                                                                                  // pila
        System.out.println("Se hizo un pop con el elemento: " + pila1.pop());
        System.out.println("El elemento tope actual es: " + pila1.peek());
    }
}
