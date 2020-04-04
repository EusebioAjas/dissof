package torniqueteSinState;

import java.util.Scanner;

public class Controlador {

    public void start() {
        Torniquete torniquete = new Torniquete();
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        System.out.println("torniqueteSinState.Estado: " + torniquete.getStatus());
        while (!salir) {
            System.out.println("1.- Moneda");
            System.out.println("2.- Pasar");
            int valor = in.nextInt();

            if (valor == 1 && torniquete.getStatus().equals(Status.DESBLOQUEADO)) {
                System.out.println("Desbloqueado!, Pasar");
            } else if (valor == 1) {
                torniquete.coin();
                System.out.println("torniqueteSinState.Estado : " + torniquete.getStatus());
            } else if (valor == 2 && torniquete.getStatus().equals(Status.BLOQUEADO)) {
                System.out.println("Bloqueado!, ingrese Moneda");
            } else {
                torniquete.push();
                System.out.println("torniqueteSinState.Estado : " + torniquete.getStatus());
            }
            System.out.println("salir? ");
            salir = in.nextBoolean();
        }

    }
}
