import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

        String telefone = JOptionPane.showInputDialog("Digite o telefone:");

        int prioridade = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o grau de gravidade (1-5):\n" +
                        "1 - Leve: Sem ferimentos\n" +
                        "2 - Moderado: Pode andar, mas precisa de ajuda\n" +
                        "3 - Grave: Dificuldade para se mover\n" +
                        "4 - Crítico: Ferimentos graves\n" +
                        "5 - Emergência: Risco iminente de vida"
        ));

        Usuario usuario = new Usuario(nome, idade, telefone, prioridade);
        Dispositivo celular = new Dispositivo("Celular", "SMS");
        usuario.cadastrarDispositivo(celular);
        usuario.adicionarContatoEmergencia("112");

        SistemaAlerta sistema = new SistemaAlerta();
        sistema.enviarAlerta(usuario);
    }
}
