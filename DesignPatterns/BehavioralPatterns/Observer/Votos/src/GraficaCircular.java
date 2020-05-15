import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GraficaCircular implements Observadores {

    private static final DefaultPieDataset datos = new DefaultPieDataset();

    public GraficaCircular() {
        init();
    }

    public void init() {
        JFreeChart grafica = ChartFactory.createPieChart3D("Votos Grafica Circular",
                datos,
                true,
                true,
                false
        );

        ChartFrame frame = new ChartFrame("Votos", grafica);
        grafica.setBackgroundPaint(Color.CYAN);

        frame.setSize(400, 300);
        frame.setLocation(710, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actualizar(HashMap<String, Candidato> observadores) {
        observadores.forEach((x, y) -> datos.setValue(y.getNombre(), y.getNumVotos()));
    }
}
