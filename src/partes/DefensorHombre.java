package partes;

public class DefensorHombre implements Defensor {
    public String toString() {
        return "defensor Hombre";
    }
    @Override
    public String barrida() {
        return "El defensa hombre comete falta";
    }

    @Override
    public String despeje() {
        return "el defensor despeja";
    }

    @Override
    public String cabezazoDefensivo() {
        return "el defensor hombre saca el balon con la cabeza";
    }
    
}
