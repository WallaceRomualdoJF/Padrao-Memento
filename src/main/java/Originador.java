import java.util.ArrayList;
import java.util.List;

class Originador {
    private List<String> estado;

    public Originador() {
        estado = new ArrayList<>();
    }

    public void setEstado(List<String> estado) {
        this.estado = new ArrayList<>(estado);
    }

    public List<String> getEstado() {
        return new ArrayList<>(estado);
    }

    public Memento salvarEstado() {
        return new Memento(estado);
    }

    public void restaurarEstado(Memento memento) {
        estado = new ArrayList<>(memento.getEstado());
    }
}
