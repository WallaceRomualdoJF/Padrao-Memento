import java.util.ArrayList;
import java.util.List;

class Zelador {
    private List<Memento> mementos;

    public Zelador() {
        mementos = new ArrayList<>();
    }

    public void adicionarMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int indice) {
        return mementos.get(indice);
    }
}
