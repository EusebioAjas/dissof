public class Cliente {
    public static void main(String[] args) {
        UIVotos uiVotos = new UIVotos();
        uiVotos.agregarCandidato(new Candidato("Luis", 79879));
        uiVotos.agregarCandidato(new Candidato("Juan", 25656));
        uiVotos.agregarCandidato(new Candidato("Jimena", 17954));
        uiVotos.agregarCandidato(new Candidato("Jil", 17856));
        uiVotos.agregarCandidato(new Candidato("Martha", 87918));

        uiVotos.adicionarObservador(new GraficaCircular());
        uiVotos.adicionarObservador(new GraficaBarras());
        uiVotos.adicionarObservador(new GeneradorExcel());

    }
}
