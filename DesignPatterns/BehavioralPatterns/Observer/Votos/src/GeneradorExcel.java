import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GeneradorExcel implements Observadores {

    public static final String RUTA_ARCHIVO = "src/files/votos.csv";

    public GeneradorExcel() {
        File file = new File(RUTA_ARCHIVO);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void actualizar(HashMap<String, Candidato> observadores) {

        StringBuilder contenido = new StringBuilder();
        observadores.forEach((x, y) -> contenido
                .append(x)
                .append(",")
                .append(y.getNumVotos())
                .append("\n"));

        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(RUTA_ARCHIVO);
            fileWriter.write(contenido.toString());
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
