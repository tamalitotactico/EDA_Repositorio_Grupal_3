interface Stack<E> {
    boolean empty();

    E peek();

    E pop();

    void push(E x);

    int search();
}