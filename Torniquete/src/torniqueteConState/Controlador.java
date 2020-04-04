package torniqueteConState;

import torniqueteSinState.Status;

import java.util.Scanner;

public class Controlador {

    public void start() {
        Torniquete torniquete = new Torniquete();
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        System.out.println(" Estado Actual: " + torniquete.getEstadoActual());
        while (!salir) {
            System.out.println("1.- Moneda");
            System.out.println("2.- Pasar");
            int valor = in.nextInt();
            if (valor == 1) {
                torniquete.desbloquear();
            } else {
                torniquete.bloquear();
            }

            System.out.println("Desea salir? SI.- ingrese true | No.- ingrese false ");
            salir = in.nextBoolean();
        }
    }
}
