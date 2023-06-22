package memento;

import java.util.Stack;

class HistoricoEditorTexto {
    private Stack<MementoEditorTexto> historico;

    public HistoricoEditorTexto() {
        historico = new Stack<>();
    }

    public void adicionarMemento(MementoEditorTexto memento) {
        historico.push(memento);
    }

    public MementoEditorTexto desfazer() {
        if (!historico.isEmpty())
            return historico.pop();
        return null;
    }
}
