public class Dispositivo {
    private String nome;
    private String tipo;

    public Dispositivo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
