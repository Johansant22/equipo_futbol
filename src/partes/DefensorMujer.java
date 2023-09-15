package partes;

public class DefensorMujer implements Defensor {
    public String toString() {
        return "defensor Mujer";
    }
    @Override
    public String barrida() {
        return "la defensa mujer hace una barrida";
    }

    @Override
    public String despeje() {
        return "La defensa despeja";
    }

    @Override
    public String cabezazoDefensivo() {
        return "despeja con la cabeza la defensa";
    }
    
}
