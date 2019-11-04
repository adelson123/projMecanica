package modelo;

public class Carro {

    private String placa;
	private String modelo;
	private String anoDeFabricação;
    private String proprietario;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoDeFabricação() {
        return anoDeFabricação;
    }

    public void setAnoDeFabricação(String anoDeFabricação) {
        this.anoDeFabricação = anoDeFabricação;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Carro(String placa, String modelo, String proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }
    
    
    
}