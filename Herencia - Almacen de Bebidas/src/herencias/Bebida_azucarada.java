package herencias;

public class Bebida_azucarada extends Bebidas{
	
	private int porcentaje;
	private boolean promocion;
	
	public Bebida_azucarada(int id, int precio, int litros, String marca, int porcentaje, boolean promocion) {
		super(id, precio, litros, marca);
		this.porcentaje = porcentaje;
		this.promocion = promocion;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public String toString() {
		return super.toString() + " Bebida azucarada: " + porcentaje + " - " + promocion;
	}
	
	
}
