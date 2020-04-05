package torniqueteConState;

import java.util.Scanner;

public class Controlador {

    public void start() {
        Torniquete torniquete = new Torniquete();
        Scanner in = new Scanner(System.in);
        int opcion = 1;
        System.out.print("\nEstado Actual: ");
        do {
            if (opcion == 1) {
                torniquete.bloquear();
            } else {
                torniquete.desbloquear();
            }
            System.out.println("\n1.- Pasar" + "\n2.- Poner moneda" + "\n3.- Salir del programa");
            opcion = in.nextInt();
        } while (opcion != 3);
    }
}
