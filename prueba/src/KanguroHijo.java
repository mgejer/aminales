import static java.lang.Math.max;

public class KanguroHijo implements Animal {
	
	protected String nombre;
	protected Integer edad;
	protected int tamanioCola;
	
	public KanguroHijo(String nombre, Integer edad, int tamanioCola) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tamanioCola = tamanioCola;
	}

	public void come(Comida unaComida) {
		tamanioCola +=1;
	}
	
	//puedo llamar a un metodo dentro de otro metodo, pero no usarlo como parametro que recibe
	public Boolean estasActivo() {
		return edad < 2 || tenesLaColaLarga();
	}
	
	public Boolean tenesLaColaLarga() {
		return tamanioCola > 6;
	}
	
	public Boolean estasCansado() {
		return false;
	}

	@Override
	public void dormi(int hora) {
		tamanioCola = Math.max(tamanioCola - hora, 0);
	}

}
