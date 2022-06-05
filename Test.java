public class Test {
    public static void main(String[] args) {
        Stack<String> pila1 = new Pila<String>(3);

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

        if (pila1.empty())
            System.out.println("La pila está vacía");
        else
            System.out.println("La pila NO está vacía");

        System.out.println("El elemento tope actual es: " + pila1.peek());
        System.out.println("El elemento 'César' está en la posición: " + pila1.search("César"));
        System.out.println("Se hizo un pop con el elemento: " + pila1.pop());
        System.out.println("El elemento tope actual es: " + pila1.peek());
    }
}
