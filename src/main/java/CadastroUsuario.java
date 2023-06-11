import java.util.ArrayList;
import java.util.List;

class CadastroUsuario {
    private List<String> usuarios;

    public CadastroUsuario() {
        usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(String usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(String usuario) {
        usuarios.remove(usuario);
    }

    public void exibirUsuarios() {
        for (String usuario : usuarios) {
            // System.out.println(usuario);
        }
    }

    public List<String> getUsuarios() {
        return new ArrayList<>(usuarios);
    }
}
