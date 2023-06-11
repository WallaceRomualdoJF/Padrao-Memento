import java.util.ArrayList;
import java.util.List;

class ConfiguracoesSistema {
    private List<String> configuracoes;

    public ConfiguracoesSistema() {
        configuracoes = new ArrayList<>();
    }

    public void adicionarConfiguracao(String configuracao) {
        configuracoes.add(configuracao);
    }

    public void removerConfiguracao(String configuracao) {
        configuracoes.remove(configuracao);
    }

    public void exibirConfiguracoes() {
        for (String configuracao : configuracoes) {
            // System.out.println(configuracao);
        }
    }

    public List<String> getConfiguracoes() {
        return new ArrayList<>(configuracoes);
    }
}
