public class Pessoa {
    private String nome;
    private int idade;
    private String telefone;
    private int prioridade;

    public Pessoa(String nome, int idade, String telefone, int prioridade) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public boolean responderAlerta() {
        return false; // exemplo de simulação de resposta
    }
}
