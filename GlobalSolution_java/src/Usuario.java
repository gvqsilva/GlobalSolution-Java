import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private List<String> contatosEmergencia;
    private List<Dispositivo> dispositivos;

    public Usuario(String nome, int idade, String telefone, int prioridade) {
        super(nome, idade, telefone, prioridade);
        this.contatosEmergencia = new ArrayList<>();
        this.dispositivos = new ArrayList<>();
    }

    public void adicionarContatoEmergencia(String contato) {
        contatosEmergencia.add(contato);
    }

    public void cadastrarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }

    public List<String> getContatosEmergencia() {
        return contatosEmergencia;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }
}
