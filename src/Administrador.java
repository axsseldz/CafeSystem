import java.util.Arrays;

public class Administrador extends Usuario {
    private Empleado[] empleados;

    // CONSTRUCTORES
    public Administrador() {

    }

    public Administrador(String nombre, String correo, int id) {
        super(nombre, correo, id);
    }

    // METODOS ----------------------------------

    // AGREGAR EMPLEADOS A UNA ARREGLO
    private void agregarEmpleado(Empleado empleado) {
        if (empleados == null) {
            empleados = new Empleado[1];
        }

        else {
            empleados = Arrays.copyOf(empleados, empleados.length + 1);
        }

        empleados[empleados.length - 1] = empleado;
    }

    // CREAR EMPLEADO
    public Empleado setEmpleado(
            String nombre,
            String correo,
            int id,
            Boolean puedeCobrar,
            Boolean puedeHacerCorte,
            Boolean puedeHacerCafe,
            Boolean puedeHacerSnacks,
            Boolean esDeLimpieza,
            int jornadaLaboral) {

        Empleado empleado = new Empleado(
                nombre,
                correo,
                id,
                puedeCobrar,
                puedeHacerCorte,
                puedeHacerCafe,
                puedeHacerSnacks,
                esDeLimpieza,
                jornadaLaboral);

        agregarEmpleado(empleado);
        return empleado;
    }

    // VER TODOS LOS EMPLEADOS
    public void getEmpleados() {
        System.out.println("\nLista de empleados:");

        for (Empleado empleado : empleados) {
            System.out.println("\nNombre: " + empleado.getNombre());
            System.out.println("Correo: " + empleado.getCorreo());
            System.out.println("ID: " + empleado.getId());
            System.out.println("Puede cobrar: " + empleado.getPuedeCobrar());
            System.out.println("Puede hacer corte: " + empleado.getPuedeHacerCorte());
            System.out.println("Puede hacer cafe: " + empleado.getPuedeHacerCafe());
            System.out.println("Puede hacer snacks: " + empleado.getPuedeHacerSnacks());
            System.out.println("Es de limpieza: " + empleado.getEsDeLimpieza());
            System.out.println("Jornada laboral: " + empleado.getJornadaLaboral() + " horas\n");
        }
    }

    // EDITAR Menu
    public void editarMenu(Menu menu) {
        // editar menu....
    }

    // GENERAR REPORTE DE VENTAS
    public void setReporteVentas(Menu menu) {
        // set reporte de ventas...
    }

    // GET REPORTE DE VENTAS
    public void getReporteVentas() {
        // get reporte de ventas....
    }

}
