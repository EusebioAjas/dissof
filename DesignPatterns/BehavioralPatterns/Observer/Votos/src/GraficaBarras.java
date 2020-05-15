import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GraficaBarras implements Observadores {

    private static DefaultCategoryDataset datos = new DefaultCategoryDataset();
    public GraficaBarras() {
        init();
    }

    public void init() {

        JFreeChart grafica = ChartFactory.createBarChart3D(
                "Votaciones",
                "Candidatos",
                "Votos",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );

        ChartFrame frame = new ChartFrame("Votos Grafica Barras", grafica);

        frame.setSize(400, 300);
        frame.setLocation(300, 100);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actualizar(HashMap<String, Candidato> observadores) {
        observadores.forEach((x, y) -> datos.setValue(y.getNumVotos(), "Votos", x));
    }
}
