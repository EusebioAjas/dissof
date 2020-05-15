import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UIVotos extends SimpleFrame implements ActionListener, Observado {
    private HashMap<String, Candidato> candidatos = new HashMap<>();
    private List<Observadores> observadores = new ArrayList<>();

    private JPanel panel = new JPanel();

    public UIVotos() {
        super();
        this.showIt("Votos");
        add(panel);
    }


    @Override
    public void adicionarObservador(Observadores observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observadores observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarTodos() {
        observadores.forEach(obs -> obs.actualizar(candidatos));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Candidato candidato = candidatos.get(e.getActionCommand());
        candidato.incrementarVoto();
        notificarTodos();

        System.out.println(candidato.toString());

    }

    public void agregarCandidato(Candidato candidato) {
        JButton btn = new JButton(candidato.getNombre());
        candidatos.put(candidato.getNombre(), candidato);
        btn.addActionListener(this);
        panel.add(btn);
    }
}
