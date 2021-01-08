
public class Direccion {
	
	private String tipoVia;
	private String nombrevia;
	private String cp;
	
	public String getTipoVia() {
		return tipoVia;
	}

	public String getNombrevia() {
		return nombrevia;
	}

	public String getCp() {
		return cp;
	}

	public Direccion(String tipoVia, String nombrevia, String cp) {
		this.tipoVia = tipoVia;
		this.nombrevia = nombrevia;
		this.cp = cp;
	}
	
	
}
