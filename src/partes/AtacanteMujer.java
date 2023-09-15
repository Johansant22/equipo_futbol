package partes;

public class AtacanteMujer implements Atacante {
    public String toString() {
        return "atacante Mujer";
    }
    @Override
    public String patearArco() {
        return "Una delantera patea al arco";
    }

    @Override
    public String regatear() {
        return "la delantera regatea a la defensa";
    }

    @Override
    public String cabezazoOfensivo() {
        return "Hace gol de cabeza la delantera";
    }
    
}
