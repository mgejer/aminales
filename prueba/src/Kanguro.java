import java.util.List;

public class Kanguro implements Animal {

	private String nombre;

	private Integer edad;

	private List<KanguroHijo> hijos;

	private List<KanguroHijo> hijosAdoptivos;

	private int energia;

	public Boolean esMadre() {
		return hijos.size() > 0 || hijosAdoptivos.size() > 0;
	}

	public Boolean esAdulto() {
		return edad >= 3;
	}

	public void come(Comida unaComida) {
		energia += unaComida.calorias;

		for (KanguroHijo hijo : hijos) {
			hijo.come(unaComida);
		}
	}

	public Boolean estasActivo() {
		return energia > 15;
	}

	public Boolean estasCansado() {
		return energia <= 15;
	}

	public Kanguro(String nombre, Integer edad, List<KanguroHijo> hijos, List<KanguroHijo> hijosAdoptivos) {
		this.nombre = nombre;
		this.edad = edad;
		this.hijos = hijos;
		this.hijosAdoptivos = hijosAdoptivos;
	}

	@Override
	public void dormi(int hora) {
		
		for(KanguroHijo hijo: hijos) {
			hijo.dormi(hora);
		}
		
		for(KanguroHijo hijo: hijosAdoptivos) {
			hijo.dormi(hora);
		}
		
		this.energia += 10 * hora;
	}
}
