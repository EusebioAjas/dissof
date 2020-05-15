public class Candidato {
    private String nombre;
    private int id;
    private int numVotos;

    public Candidato(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.numVotos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void incrementarVoto() {
        this.numVotos++;
    }

    @Override
    public String toString() {
        return getNombre() +","+ getNumVotos();
    }
}
