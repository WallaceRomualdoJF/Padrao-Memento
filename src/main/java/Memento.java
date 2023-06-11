import java.util.ArrayList;
import java.util.List;

class Memento {
    private List<String> estado;

    public Memento(List<String> estado) {
        this.estado = new ArrayList<>(estado);
    }

    public List<String> getEstado() {
        return new ArrayList<>(estado);
    }
}
