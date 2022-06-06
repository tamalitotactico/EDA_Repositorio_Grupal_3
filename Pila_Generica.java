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
			pila[cantidadDeCilindros]=cilindro;
            cantidadDeCilindros++;
		}
	}
	public T eliminarCilindro() throws Exception{
		if(!pilaVacia()) {
            T aux = pila[cantidadDeCilindros-1];
            cantidadDeCilindros = cantidadDeCilindros -1;
            pila[cantidadDeCilindros] =null;
            //cantidadDeCilindros = cantidadDeCilindros -1;
			return aux;
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

    public T[] getArray(){
        return this.pila;
    }
}