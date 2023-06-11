import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CadastroTest {

    @Test
    void testCadastroUsuario() {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.adicionarUsuario("Usuário 1");
        cadastroUsuario.adicionarUsuario("Usuário 2");

        List<String> usuariosEsperados = Arrays.asList("Usuário 1", "Usuário 2");

        Assertions.assertEquals(usuariosEsperados, cadastroUsuario.getUsuarios());

        cadastroUsuario.removerUsuario("Usuário 1");
        usuariosEsperados = Arrays.asList("Usuário 2");

        Assertions.assertEquals(usuariosEsperados, cadastroUsuario.getUsuarios());
    }

    @Test
    void testCadastroProduto() {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto("Produto 1");
        cadastroProduto.adicionarProduto("Produto 2");

        List<String> produtosEsperados = Arrays.asList("Produto 1", "Produto 2");

        Assertions.assertEquals(produtosEsperados, cadastroProduto.getProdutos());

        cadastroProduto.removerProduto("Produto 1");
        produtosEsperados = Arrays.asList("Produto 2");

        Assertions.assertEquals(produtosEsperados, cadastroProduto.getProdutos());
    }

    @Test
    void testHistoricoAlteracoes() {
        HistoricoAlteracoes historico = new HistoricoAlteracoes();
        historico.adicionarAlteracao("Alteração 1");
        historico.adicionarAlteracao("Alteração 2");

        List<String> alteracoesEsperadas = Arrays.asList("Alteração 1", "Alteração 2");

        Assertions.assertEquals(alteracoesEsperadas, historico.getAlteracoes());
    }

    @Test
    void testConfiguracoesSistema() {
        ConfiguracoesSistema configuracoes = new ConfiguracoesSistema();
        configuracoes.adicionarConfiguracao("Configuração 1");
        configuracoes.adicionarConfiguracao("Configuração 2");

        List<String> configuracoesEsperadas = Arrays.asList("Configuração 1", "Configuração 2");

        Assertions.assertEquals(configuracoesEsperadas, configuracoes.getConfiguracoes());

        configuracoes.removerConfiguracao("Configuração 1");
        configuracoesEsperadas = Arrays.asList("Configuração 2");

        Assertions.assertEquals(configuracoesEsperadas, configuracoes.getConfiguracoes());
    }

    @Test
    void testMemento() {
        Originador originador = new Originador();
        originador.setEstado(Arrays.asList("Estado 1", "Estado 2"));

        Memento memento = originador.salvarEstado();

        originador.setEstado(Arrays.asList("Estado 3", "Estado 4"));

        originador.restaurarEstado(memento);

        List<String> estadoEsperado = Arrays.asList("Estado 1", "Estado 2");

        Assertions.assertEquals(estadoEsperado, originador.getEstado());
    }
}
