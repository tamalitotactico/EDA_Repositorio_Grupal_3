public class QueueArray<E> implements Queue<E>{

	private E[] array;
	private int nElem;
	private int front;
	private int back;
	private int maxE;
	
	public QueueArray(int n) {
		array = (E[]) new Object[n];
		maxE = n;
		front = 0;
		nElem = 0;
		back = -1;
	}
	public boolean isEmpty() {
		return nElem==0;
	}	
	public boolean isFull() {
		return nElem==maxE;
	}
	public void add(E x) {
		if(!isFull()) {
			back = (back + 1) % maxE; 
			array[back] = x;
			nElem++;
		} else
			System.out.println("La cola esta llena...");
	}
	public E peek() {
		if(!isEmpty()) 
			return array[front];
		else
			return null;
	}
	public void remove(){
		if(!isEmpty()) {
			front = (front + 1) % maxE;
			nElem--;
		} else 
			System.out.println("La cola esta vacia!");
	}
	public E poll(){
		if(!isEmpty()) {
			E aux = array[front];
			front = (front + 1) % maxE;
			nElem--;
			return aux;
		} else {
			System.out.println("La cola esta vacia!");
			return null;
		}
	}
	public String toString() {
		String str = "";
		for(int i=0; nElem>i; i++) {
			str += "["+i+"] = "+array[(front+i)%maxE]+"\n";
		}
		return str;
	}
	
}
