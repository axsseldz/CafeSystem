public class Licencia {
    private String nombreEmpresa;
    private String status;
    private String fechaDeVencimiento;

    // CONSTRUCTORES
    public Licencia() {

    }

    public Licencia(String nombreEmpresa, String status, String fechaDeVencimiento) {
        this.nombreEmpresa = nombreEmpresa;
        this.status = status;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    // METODOS ---------------------------

    // NOMBRE EMPRESA
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    // STATUS

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    // FECHA DE VENCIMIENTO

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}
