
public class Delfin implements Animal {

	private Integer peso = 30;
	
	@Override
	public void come(Comida unaComida) {
		peso += unaComida.calorias * 10;
		
	}

	@Override
	public Boolean estasActivo() {
		return true;
	}

	@Override
	public Boolean estasCansado() {
		return peso > 100;
	}

	@Override
	public void dormi(int hora) {
		peso = Math.max(peso - hora * 2, 30);
	}

}
