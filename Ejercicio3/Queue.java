interface Queue<E> {

	void add(E x);
	E peek();
	E poll();
	void remove();
	boolean isEmpty();	
	
}