package modelo;

    public class Peca {
        
    private double codigo;
	private String nome;
	private String ano;
	private String modelo;
    private String preco;

    

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Peca(double codigo, String nome, String preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    
        
    }