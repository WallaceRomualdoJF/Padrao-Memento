import java.util.ArrayList;
import java.util.List;

class CadastroProduto {
    private List<String> produtos;

    public CadastroProduto() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
    }

    public void removerProduto(String produto) {
        produtos.remove(produto);
    }

    public void exibirProdutos() {
        for (String produto : produtos) {
            // System.out.println(produto);
        }
    }

    public List<String> getProdutos() {
        return new ArrayList<>(produtos);
    }
}
