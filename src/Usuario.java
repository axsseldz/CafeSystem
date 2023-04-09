public class Usuario {
    private String nombre;
    private String correo;
    private int id;

    // CONSTRUCTORES
    public Usuario() {

    }

    public Usuario(String nombre, String correo, int id) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
    }

    // METODOS ---------------------------

    // NOMBRE
    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // CORREO
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    // ID
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
