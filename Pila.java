public class Pila<E> implements Stack<E> {

    private int top;
    private E[] array;

    public Pila(int n) {
        this.array = (E[]) new Object[n];
        this.top = -1;
    }

    public boolean empty() {
        return this.top == -1;
    }

    public E peek() {
        return this.array[this.top];
    }

    public E pop() {
        E aux = this.array[this.top];
        this.array[this.top] = null;
        top--;
        return aux;
    }

    public void push(E x) {
        if (this.top < this.array.length - 1)
            this.array[++top] = x;
        else
            System.out.println("El stack esta lleno ...");
    }

    public int search(E x) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(x))
                return i;
        }
        return -1;
    }
}
