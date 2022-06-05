package Ejercicios;

public class Pila_Generica<T>{
	private int maximoCilindros=100;
	private int cantidadDeCilindros;
	
	private T pila[];
	
	public Pila_Generica() {
		pila=(T[])new Integer[maximoCilindros];
		cantidadDeCilindros=0;
	}
	public void agregarCilindro(T cilindro) throws Exception{
		if(cantidadDeCilindros<maximoCilindros) {
			pila[cantidadDeCilindros++]=cilindro;
		}
	}
	public T eliminarCilindro() throws Exception{
		if(!pilaVacia()) {
			return pila[--cantidadDeCilindros];
		}
		throw new Exception("No hay cilindros");
	}
	private boolean pilaVacia() {
		return cantidadDeCilindros==0;
	}
	public T ultimoCilindro() throws Exception{
		if(pilaVacia()) {
			throw new Exception("No hay cilindros");
		}
		int cilindrosExistentes=cantidadDeCilindros;
		return pila[--cilindrosExistentes];
	}
	public int numeroDeCilindros() {
		return cantidadDeCilindros;
	}
	public String toString() {
		String cadena=pila[0]+"";
		for(int i=1;i<pila.length;i++) {
			if(pila[i]==null) {
				break;
			}
			cadena=cadena+","+pila[i];
		}
		return "=["+cadena+"]";
	}
	public int buscar(T cilindro) {
		for (int i = 0; i < this.pila.length; i++) {
            if (this.pila[i].equals(cilindro))
                return i;
        }
        return -1;
	}


	
	

}
