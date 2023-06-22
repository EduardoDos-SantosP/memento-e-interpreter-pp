package memento;

class EditorTexto {
    private StringBuilder conteudo;

    public EditorTexto() {
        this.conteudo = new StringBuilder();
    }

    public void adicionarTexto(String texto) {
        conteudo.append(texto);
    }

    public void deletarTexto(int comprimento) {
        int tamanhoAtual = conteudo.length();
        if (comprimento <= tamanhoAtual) {
            conteudo.setLength(tamanhoAtual - comprimento);
        }
    }

    public String getConteudo() {
        return conteudo.toString();
    }

    public MementoEditorTexto criarMemento() {
        return new MementoEditorTexto(conteudo.toString());
    }

    public void restaurarMemento(MementoEditorTexto memento) {
        conteudo = new StringBuilder(memento.getEstado());
    }
}
