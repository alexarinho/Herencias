package herencias;

public class Agua_Mineral extends Bebidas{
	private String origen;

	public Agua_Mineral(int id, int precio, int litros, String marca, String origen) {
		super(id, precio, litros, marca);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return super.toString() + " Agua Mineral: " + origen;
	}
	
	
	
}
