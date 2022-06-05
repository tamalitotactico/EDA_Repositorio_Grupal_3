public class Pila<E> implements Stack<E> {

    private int top;
    private E[] array;

    public Pila(int n) {
        this.array = (E[]) new Object[n];
        this.top = -1;
    }

    public boolean empty() {
        return false;
    }

    public E peek() {
        return null;
    }

    public E pop() {
        return null;
    }

    public void push(E x) {
        if (this.top < this.array.length - 1)
            this.array[++top] = x;
        else
            System.out.println("El stack esta lleno ...");
    }

    public int search() {
        return 0;
    }

}
