package memento;

public class MementoPP {
    public static void main(String[] args) {
        var editor = new EditorTexto();
        var hist = new HistoricoEditorTexto();

        editor.adicionarTexto("Olá!\n");
        var m1 = editor.criarMemento();
        System.out.println(m1.getEstado());
        hist.adicionarMemento(m1);

        editor.adicionarTexto("Esse é o padrão de projetos Mamífero");
        var m2 = editor.criarMemento();
        System.out.println(m2.getEstado());
        //hist.adicionarMemento(m2);

        var m = hist.desfazer();
        System.out.println(m.getEstado());
        editor.restaurarMemento(m);

        /*editor.deletarTexto("Mamífero".length());
        var m3 = editor.criarMemento();
        System.out.println(m3.getEstado());
        hist.adicionarMemento(m3);
        
        editor.adicionarTexto("Memento");
        var m4 = editor.criarMemento();
        System.out.println(m4.getEstado());
        hist.adicionarMemento(m4);*/
    }
}

