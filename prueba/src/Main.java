import java.util.ArrayList;
import java.util.List;

public class Main {

	//Ver diferencia entre lista vacia y null
	
	public static void main(String[] args) {
		
		Delfin wally = new Delfin();
		
		KanguroHijo tomas = new KanguroHijo("tomas", 1, 5);
		KanguroHijo sebas = new KanguroHijo("sebastian", 1, 5);
		
		KanguroHijo igor= new KanguroHijo("igor", 1, 5);
		
		
		ArrayList<KanguroHijo> listaHijos = new ArrayList<>();
		listaHijos.add(tomas);
		listaHijos.add(sebas);
		
		ArrayList<KanguroHijo> listaHijosAdoptivos = new ArrayList<>();
		listaHijosAdoptivos.add(igor);
		
		Kanguro karina = new Kanguro("Karina", 19, listaHijos, listaHijosAdoptivos);

		Comida manzana = new Comida("manzana", 10);
		karina.come(manzana);
		tomas.come(manzana);
		
		
		for (KanguroHijo hijo: listaHijos) {
			hijo.dormi(3);
		}
		
		ArrayList<Animal> animales = new ArrayList<>();
		animales.add(wally);
		animales.add(igor);
		animales.add(karina);
		
		//Agrego todos los elementos de otra lista
		animales.addAll(listaHijos);
		
		
		//Mandamos a dormir a todos los animales, de dos formas diferentes
		//Forma 1
		for (Animal unAminal: animales) {
			unAminal.dormi(9);
		}
		//Forma 2
		animales.forEach(unAminal-> unAminal.dormi(9));
	}
}
