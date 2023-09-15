package partes;

public class AtacanteHombre implements Atacante {
    public String toString() {
        return "atacante Hombre";
    }
    @Override
    public String patearArco() {
        return "El delantero hombre falla su tiro";
    }

    @Override
    public String regatear() {
        return "El delantero regatea al defensa";
    }

    @Override
    public String cabezazoOfensivo() {
        return "Hace un gol de cabeza";
    }
    
}
