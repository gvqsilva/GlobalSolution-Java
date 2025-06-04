import javax.swing.JOptionPane;

public class SistemaAlerta {
    public void enviarAlerta(Usuario usuario) {
        JOptionPane.showMessageDialog(null,
                "Alerta enviado para " + usuario.getNome() +
                        " com prioridade " + usuario.getPrioridade()
        );

        String local = JOptionPane.showInputDialog("Onde você está agora? (ex: prédio, parque, rua, outro)");
        orientarSaida(usuario.getPrioridade(), local.toLowerCase());
        verificarRespostaUsuario();
    }

    private void orientarSaida(int prioridade, String local) {
        String orientacaoGeral;
        if (prioridade >= 4) {
            orientacaoGeral = "Evacue imediatamente!";
        } else if (prioridade == 3) {
            orientacaoGeral = "Prepare-se para sair rapidamente.";
        } else {
            orientacaoGeral = "Situação sob controle, mas fique atento.";
        }

        String orientacaoLocal;
        switch (local) {
            case "prédio":
                orientacaoLocal = "Use as escadas e evacue com calma. Não use elevadores.";
                break;
            case "parque":
                orientacaoLocal = "Dirija-se à saída mais próxima e evite árvores e postes.";
                break;
            case "rua":
                orientacaoLocal = "Afaste-se de postes, fios e procure abrigo seguro.";
                break;
            default:
                orientacaoLocal = "Siga as orientações das autoridades e mantenha a calma.";
                break;
        }

        JOptionPane.showMessageDialog(null,
                "Orientação geral: " + orientacaoGeral + "\n" +
                        "Local (" + local + "): " + orientacaoLocal
        );
    }

    private void verificarRespostaUsuario() {
        int resposta = JOptionPane.showConfirmDialog(null,
                "Você está seguro no momento?", "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Ótimo! Continuaremos monitorando a situação.");
        } else {
            JOptionPane.showMessageDialog(null, "Enviaremos ajuda imediatamente para sua localização.");
        }
    }
}