import java.util.ArrayList;
import java.util.List;

class HistoricoAlteracoes {
    private List<String> alteracoes;

    public HistoricoAlteracoes() {
        alteracoes = new ArrayList<>();
    }

    public void adicionarAlteracao(String alteracao) {
        alteracoes.add(alteracao);
    }

    public void exibirAlteracoes() {
        for (String alteracao : alteracoes) {
            // System.out.println(alteracao);
        }
    }

    public List<String> getAlteracoes() {
        return new ArrayList<>(alteracoes);
    }
}
