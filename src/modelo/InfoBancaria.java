package modelo;

public class InfoBancaria {

    private String numeroBanco;
	private String numeroAgencia;
	private String numeroConta;

    public String getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(String numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public InfoBancaria(String numeroBanco, String numeroAgencia, String numeroConta) {
        this.numeroBanco = numeroBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
    }
    
    
    
}