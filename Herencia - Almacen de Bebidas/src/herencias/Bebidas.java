package herencias;

public abstract class Bebidas {
	private int id;
	private int precio;
	private int litros;
	private String marca;
	
	public Bebidas(int id, int precio, int litros, String marca) {
		this.id = id;
		this.precio = precio;
		this.litros = litros;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bebidas: " + id + " - " + precio + " - " + litros + " - " + marca;
	}
	
	
}
