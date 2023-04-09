import java.util.Arrays;

public class Cafeteria {
    private String nombreDeCafeteria;
    private String direccion;
    public String licencia;
    private Menu[] menus;

    // CONSTRUCTORES
    public Cafeteria() {

    }

    public Cafeteria(String nombreDeCafeteria, String direccion, String licencia) {
        this.nombreDeCafeteria = nombreDeCafeteria;
        this.direccion = direccion;
        this.licencia = licencia;
    }

    // METODOS ---------------------------

    // NOMBRE DE CAFETERIA
    public void setNombreDeCafeteria(String nombreDeCafeteria) {
        this.nombreDeCafeteria = nombreDeCafeteria;
    }

    public String getNombreDeCafeteria() {
        return nombreDeCafeteria;
    }

    // DIRECCION
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    // LICENCIA ************
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    // CREAR MENU
    public Menu setMenu(
            String entrada,
            String platoFuerte,
            String postre,
            int precioDeEntrada,
            int precioDePlatoFuerte,
            int precioDePostre) {

        Menu menu = new Menu(
                entrada,
                platoFuerte,
                postre,
                precioDeEntrada,
                precioDePlatoFuerte,
                precioDePostre);

        agregarMenu(menu);

        return menu;
    }

    // AGREGAR MENU A LA LISTA DE MENUS
    private void agregarMenu(Menu menu) {
        if (menus == null) {
            menus = new Menu[1];
        }

        else {
            menus = Arrays.copyOf(menus, menus.length + 1);
        }

        menus[menus.length - 1] = menu;
    }

    // OBTENER MENU
    public void getMenus() {
        System.out.println("\nMenu:");

        for (Menu menu : menus) {
            System.out.println("\nEntrada: " + menu.getEntrada() + ", Precio: " +
                    menu.getPrecioDeEntrada());
            System.out
                    .println("Plato Fuerte: " + menu.getPlatoFuerte() + ", Precio: " +
                            menu.getPrecioDePlatoFuerte());
            System.out.println("Postre: " + menu.getPostre() + ", Precio: " +
                    menu.getPrecioDePostre() + "\n");
        }
    }

}
