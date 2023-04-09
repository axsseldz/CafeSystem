public class Empleado extends Usuario {
    // AREA DE CAJA
    private Boolean puedeCobrar;
    private Boolean puedeHacerCorte;

    // AREA DE BAR
    private Boolean puedeHacerCafe;

    // AREA DE COCINA
    private Boolean puedeHacerSnacks;

    // AREA DE LIMPIEZA
    private Boolean esDeLimpieza;

    // HORARIO
    private int jornadaLaboral;

    // CONSTRUCTORES
    public Empleado() {

    }

    public Empleado(
            String nombre,
            String correo,
            int id,
            Boolean puedeCobrar,
            Boolean puedeHacerCorte,
            Boolean puedeHacerCafe,
            Boolean puedeHacerSnacks,
            Boolean esDeLimpieza,
            int jornadaLaboral) {

        super(nombre, correo, id);
        this.puedeCobrar = puedeCobrar;
        this.puedeHacerCorte = puedeHacerCorte;
        this.puedeHacerCafe = puedeHacerCafe;
        this.puedeHacerSnacks = puedeHacerSnacks;
        this.esDeLimpieza = esDeLimpieza;
        this.jornadaLaboral = jornadaLaboral;
    }

    // METODOS ---------------------------

    // PUEDE COBRAR
    public void setPuedeCobrar(Boolean puedeCobrar) {
        this.puedeCobrar = puedeCobrar;
    }

    public Boolean getPuedeCobrar() {
        return puedeCobrar;
    }

    // PUEDE HACER CORTE
    public void setPuedeHacerCorte(Boolean puedeHacerCorte) {
        this.puedeHacerCorte = puedeHacerCorte;
    }

    public Boolean getPuedeHacerCorte() {
        return puedeHacerCorte;
    }

    // PUEDE HACER CAFE
    public void setPuedeHacerCafe(Boolean puedeHacerCafe) {
        this.puedeHacerCafe = puedeHacerCafe;
    }

    public Boolean getPuedeHacerCafe() {
        return puedeHacerCafe;
    }

    // PUEDE HACER SNACKS
    public void setPuedeHacerSnacks(Boolean puedeHacerSnacks) {
        this.puedeHacerSnacks = puedeHacerSnacks;
    }

    public Boolean getPuedeHacerSnacks() {
        return puedeHacerSnacks;
    }

    // ES DE LIMPIEZA
    public void setEsDeLimpieza(Boolean esDeLimpieza) {
        this.esDeLimpieza = esDeLimpieza;
    }

    public Boolean getEsDeLimpieza() {
        return esDeLimpieza;
    }

    // JORNADA LABORAL
    public void setJornadaLaboral(int jornadaLaboral) {
        this.jornadaLaboral = jornadaLaboral;
    }

    public int getJornadaLaboral() {
        return jornadaLaboral;
    }

}
