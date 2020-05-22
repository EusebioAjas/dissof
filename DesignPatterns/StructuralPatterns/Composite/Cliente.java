public class Cliente {
    public Cliente() {
        Menu menuInicial = new Menu("Menu Inicial");

        Menu desayunosAlmuerzo = new Menu("desayunos y almuerzos");
        menuInicial.addElementoMenu(desayunosAlmuerzo);

        Menu completos = new Menu("Desayunos completos");
        Menu postres = new Menu("Postres");

        desayunosAlmuerzo.addElementoMenu(completos);
        desayunosAlmuerzo.addElementoMenu(postres);

        Platillo cheescake = new Platillo("Cheescake con fresa",42);
        Platillo chilaquiles = new Platillo("Chilaquiles",78);

        completos.addElementoMenu(chilaquiles);
        postres.addElementoMenu(cheescake);

        Menu comidasCenas = new Menu("Comidas y cenas");
        menuInicial.addElementoMenu(comidasCenas);

        Menu sopas = new Menu("Sopas");
        Menu carnes = new Menu("Carnes");

        comidasCenas.addElementoMenu(sopas);
        comidasCenas.addElementoMenu(carnes);

        Platillo arrachera = new Platillo("Arrachera",65);
        Platillo sopaespecial = new Platillo("Sopa especial",58);

        carnes.addElementoMenu(arrachera);
        sopas.addElementoMenu(sopaespecial);

        String menuPDF = new GenerarPDFMenu().generarPDFMenu(menuInicial);
        System.out.println(menuPDF);

    }

    public static void main(String[] args) {
        new Cliente();
    }
}
